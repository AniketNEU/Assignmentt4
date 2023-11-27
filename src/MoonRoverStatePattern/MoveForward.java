/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MoonRoverStatePattern;

/**
 * Represents the Move Forward state of the lunar buggy, implementing the State interface.
 * Handles the behavior related to moving forward.
 * @author anikettiwari
 * @version 1.0
 */
public class MoveForward implements State {
    /**
     * Substate indicating the current acceleration state ("Accelerate", "Decelerate", or "Constant Speed").
     */
    private String subState = "Accelerate";
    private String name = "Move Forward";
    
    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getSubState() {
        return subState;
    }

    /**
     * Handles the action when the right pedal is pressed a certain number of times.
     * @param numOfTimesPressed Number of times the right pedal is pressed.
     * @return True if the state transition is successful, false otherwise.
     */
    @Override
public boolean pressRightPedal(int numOfTimesPressed) {
    boolean move = false;
    switch (numOfTimesPressed) {
        case 2:
            if (this.subState != "Accelerate" && this.subState != "Decelerate") {
                // System.out.println("Error: Can only press Right Pedal twice when in Accelerate or Decelerate States.\nUnable to move.");
            } else if (this.subState.equals("Accelerate")) {
                // System.out.println("Transitioning from Accelerate State to Decelerate State...");
                this.subState = "Decelerate";
                move = true;
            } else {
                // System.out.println("Transitioning from Decelerate State to Accelerate State...");
                this.subState = "Accelerate";
            }
            break;
        case 3:
            if (this.subState != "Decelerate") {
                // System.out.println("Error: Can only press Right Pedal thrice when in Decelerate State.\nUnable to move.");
            } else {
                // System.out.println("Transitioning from Decelerate State to At Rest State...");
                this.subState = null;
                move = true;
            }
            break;
        default:
            // System.out.println("Error: Must press Right Pedal twice or thrice when in Move Forward State.\nUnable to move.");
            break;
    }

    if (move) {
        Context.getInstance().setState(new AtRest());
    }
    return move;
}

    /**
     * Handles the action when the right pedal is pressed for a certain duration.
     * @param numOfSecondsPressed Number of seconds the right pedal is pressed.
     * @return True if the state transition is successful, false otherwise.
     */
    @Override
    public boolean pressRightPedalForTime(int numOfSecondsPressed) {
        switch (numOfSecondsPressed) {
            case 3:
                if (this.subState != "Decelerate" && this.subState != "Constant Speed") {
                    System.out.println("Error: Can only press Right Pedal for 3 seconds when in Constant Speed or Decelerate States.\nUnable to move.");
                } else if (this.subState.equals("Decelerate")) {
                    System.out.println("Transitioning from Decelerate State to Constant Speed State...");
                    this.subState = "Constant Speed";
                } else {
                    System.out.println("Transitioning from Constant Speed State to Decelerate State...");
                    this.subState = "Decelerate";
                }
                break;
            case 5:
                if (this.subState != "Accelerate" && this.subState != "Constant Speed") {
                    System.out.println("Error: Can only press Right Pedal for 5 seconds when in Constant Speed or Accelerate States.\nUnable to move.");
                } else if (this.subState.equals("Accelerate")) {
                    System.out.println("Transitioning from Accelerate State to Constant Speed State...");
                    this.subState = "Constant Speed";
                } else {
                    System.out.println("Transitioning from Constant Speed State to Accelerate State...");
                    this.subState = "Accelerate";
                }
                break;
            default:
                System.out.println("Error: Must press Right Pedal for 3 or 5 seconds when in Move Forward State.\nUnable to move.");
                break;
        }
        return false; // You need to decide the return value based on the behavior you want
    }

    /**
     * Handles the action when the left pedal is pressed a certain number of times.
     * @param numOfTimesPressed Number of times the left pedal is pressed.
     * @return False since accelerating forward is not allowed while already moving forward at constant speed.
     */
    @Override
    public boolean pressLeftPedal(int numOfTimesPressed) {
        System.out.println("Cannot accelerate forward while already moving forward at constant speed.");
        return false;
    }

    /**
     * Handles the action when the left pedal is pressed for a certain duration.
     * @param numOfSecondsPressed Number of seconds the left pedal is pressed.
     * @return False since accelerating backward is not allowed while moving forward.
     */
    @Override
    public boolean pressLeftPedalForTime(int numOfSecondsPressed) {
        System.out.println("Cannot accelerate backward while moving forward.");
        return false;
    }
}

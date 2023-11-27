/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MoonRoverStatePattern;

/**
 * Represents the Move Backward state of the lunar buggy.
 * Implements the State interface for handling pedal presses.
 * @author anikettiwari
 */
public class MoveBackward implements State {

    /** The sub-state indicating the current mode of movement (e.g., Accelerate, Decelerate, Constant Speed). */
    private String name = "Move Backward";
    private String subState = "Accelerate";

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getSubState() {
        return subState;
    }
    /**
     * Handles the press of the left pedal based on the number of times pressed.
     * @param numOfTimesPressed The number of times the left pedal is pressed.
     * @return True if the transition to a new state is successful, false otherwise.
     */
    @Override
    public boolean pressLeftPedal(int numOfTimesPressed) {
        boolean move = false;
        switch (numOfTimesPressed) {
            case 1:
                if (this.subState != "Decelerate" && this.subState != "Constant Speed") {
                    System.out.println("Error: Can only press Left Pedal once when in Constant Speed or Decelerate States.\nUnable to move.");
                } else if (this.subState == "Decelerate") {
                    System.out.println("Transitioning from Decelerate State to Constant Speed State...");
                    this.subState = "Constant Speed";
                } else {
                    System.out.println("Transitioning from Constant Speed State to Decelerate State...");
                    this.subState = "Decelerate";
                }
                break;
            case 2:
                if (this.subState != "Decelerate" && this.subState != "Accelerate") {
                    System.out.println("Error: Can only press Left Pedal twice when in Accelerate or Decelerate States.\nUnable to move.");
                } else if (this.subState == "Decelerate") {
                    System.out.println("Transitioning from Decelerate State to Accelerate State...");
                    this.subState = "Accelerate";
                } else {
                    System.out.println("Transitioning from Accelerate State to Decelerate State...");
                    this.subState = "Decelerate";
                }
                break;
            case 3:
                if (this.subState != "Decelerate") {
                    System.out.println("Error: Can only press Left Pedal thrice when in Decelerate State.\nUnable to move.");
                } else {
                    System.out.println("Transitioning from Decelerate State to At Rest State...");
                    this.subState = null;
                    move = true;
                }
                break;
            default:
                System.out.println("Error: Must press Left Pedal once, twice, or thrice when in Move Backward State.\nUnable to move.");
                break;
        }
        if (move) {
            Context.getInstance().setState(new AtRest());
        }
        return move;
    }

    /**
     * Handles the press of the left pedal for a specific duration.
     * @param numOfSecondsPressed The duration for which the left pedal is pressed.
     * @return True if the transition to a new state is successful, false otherwise.
     */
    @Override
    public boolean pressLeftPedalForTime(int numOfSecondsPressed) {
        if (numOfSecondsPressed != 3) {
            System.out.println("Error: Can only press Left Pedal for 3 seconds when in Accelerate or Constant Speed States to move.\nUnable to move.");
            return false;
        }
        if (this.subState != "Accelerate" && this.subState != "Constant Speed") {
            System.out.println("Error: Can only press Left Pedal for 3 seconds when in Accelerate or Constant Speed States.\nUnable to move.");
            return false;
        }
        if (this.subState == "Accelerate") {
            System.out.println("Transitioning from Accelerate State to Constant Speed State...");
            this.subState = "Constant Speed";
            return true;
        }
        System.out.println("Transitioning from Constant Speed State to Accelerate State...");
        this.subState = "Accelerate";
        return true;
    }

    /**
     * Handles the press of the right pedal.
     * @param numOfTimesPressed The number of times the right pedal is pressed.
     * @return True if the transition to a new state is successful, false otherwise.
     */
    @Override
    public boolean pressRightPedal(int numOfTimesPressed) {
        System.out.println("Cannot deaccelerate while moving backward.");
        return false;
    }

    /**
     * Handles the press of the right pedal for a specific duration.
     * @param numOfSecondsPressed The duration for which the right pedal is pressed.
     * @return True if the transition to a new state is successful, false otherwise.
     */
    @Override
    public boolean pressRightPedalForTime(int numOfSecondsPressed) {
        System.out.println("Cannot deaccelerate while moving backward.");
        return false;
    }
}

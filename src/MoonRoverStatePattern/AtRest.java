/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MoonRoverStatePattern;

/**
 * Represents the At Rest state of the lunar buggy.
 * Implements the State interface for handling pedal presses.
 * @author anikettiwari
 */
public class AtRest implements State {
    
    private String name = "At Rest";
    private String subState = "None";

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getSubState() {
        return subState;
    }

    /**
     * Handles the press of the right pedal based on the number of times pressed.
     * @param numOfTimesPressed The number of times the right pedal is pressed.
     * @return True if the transition to a new state is successful, false otherwise.
     */
    @Override
    public boolean pressRightPedal(int numOfTimesPressed) {
        if (numOfTimesPressed != 1) {
            System.out.println("Error: Can only press Right Pedal once when in this state.\nUnable to move.");
            return false;
        } else {
            System.out.println("Transitioning from this state to Move Forward State...");
            Context.getInstance().setState(new MoveForward());
            return true;
        }
    }

    /**
     * Handles the press of the right pedal for a specific duration.
     * @param numOfSecondsPressed The duration for which the right pedal is pressed.
     * @return True if the transition to a new state is successful, false otherwise.
     */
    @Override
    public boolean pressRightPedalForTime(int numOfSecondsPressed) {
        if (numOfSecondsPressed > 3) {
            System.out.println("Maintaining constant forward speed");
            return true;
        } else {
            System.out.println("Error: Must press Right Pedal for more than 3 seconds to maintain constant speed.\nUnable to move.");
            return false;
        }
    }

    /**
     * Handles the press of the left pedal based on the number of times pressed.
     * @param numOfTimesPressed The number of times the left pedal is pressed.
     * @return True if the transition to a new state is successful, false otherwise.
     */
    @Override
    public boolean pressLeftPedal(int numOfTimesPressed) {
        if (numOfTimesPressed == 1) {
            System.out.println("Transitioning from this state to Move Backward State...");
            Context.getInstance().setState(new MoveBackward());
            return true;
        } else {
            System.out.println("Error: Can only press Left Pedal once when in this state.\nUnable to move.");
            return false;
        }
    }

    /**
     * Handles the press of the left pedal for a specific duration.
     * @param numOfSecondsPressed The duration for which the left pedal is pressed.
     * @return True if the transition to a new state is successful, false otherwise.
     */
    @Override
    public boolean pressLeftPedalForTime(int numOfSecondsPressed) {
        if (numOfSecondsPressed == 5) {
            System.out.println("Transitioning from this state to Move Backward State...");
            Context.getInstance().setState(new MoveBackward());
            return true;
        } else {
            System.out.println("Error: Must press Left Pedal for 5 seconds when in this state.\nUnable to move.");
            return false;
        }
    }
}

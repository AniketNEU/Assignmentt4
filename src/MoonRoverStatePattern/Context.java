/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MoonRoverStatePattern;

/**
 * Represents the context of the lunar buggy, maintaining the current state.
 * Implements the Singleton pattern for ensuring a single instance of the context.
 * @author anikettiwari
 */
public class Context {
    private State state;
    private static Context instance;

    private Context() {
        this.state = new AtRest();
    }

    /**
     * Gets the singleton instance of the Context class.
     * @return The singleton instance of the Context class.
     */
    public static Context getInstance() {
        if (instance == null) {
            instance = new Context();
        }
        return instance;
    }
    
    /**
     * @return
     */
    public State getState() {
        return state;
    }


    /**
     * Sets the current state of the context.
     * @param state The new state to set.
     */
    public void setState(State state) {
        this.state = state;
    }

    /**
     * Handles the press of the right pedal based on the number of times pressed.
     * @param numOfTimesPressed The number of times the right pedal is pressed.
     * @return True if the transition to a new state is successful, false otherwise.
     */
    public boolean pressRightPedal(int numOfTimesPressed) {
        return state.pressRightPedal(numOfTimesPressed);
    }

    /**
     * Handles the press of the right pedal for a specific duration.
     * @param numOfSecondsPressed The duration for which the right pedal is pressed.
     * @return True if the transition to a new state is successful, false otherwise.
     */
    public boolean pressRightPedalForTime(int numOfSecondsPressed) {
        return state.pressRightPedalForTime(numOfSecondsPressed);
    }

    /**
     * Handles the press of the left pedal based on the number of times pressed.
     * @param numOfTimesPressed The number of times the left pedal is pressed.
     * @return True if the transition to a new state is successful, false otherwise.
     */
    public boolean pressLeftPedal(int numOfTimesPressed) {
        return state.pressLeftPedal(numOfTimesPressed);
    }

    /**
     * Handles the press of the left pedal for a specific duration.
     * @param numOfSecondsPressed The duration for which the left pedal is pressed.
     * @return True if the transition to a new state is successful, false otherwise.
     */
    public boolean pressLeftPedalForTime(int numOfSecondsPressed) {
        return state.pressLeftPedalForTime(numOfSecondsPressed);
    }
   
}

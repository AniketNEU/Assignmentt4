/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MoonRoverStatePattern;

/**
 *
 * @author anikettiwari
 */
public class RoverDemo {
    public static void main(String[] args) {
        Context context = Context.getInstance();

        // Initial state
        printState(context);

        // Press right pedal once
        context.pressRightPedal(1);
        printState(context);

        // Press right pedal for 5 seconds
        context.pressRightPedalForTime(5);
        printState(context);

        // Press left pedal once
        context.pressLeftPedal(1);
        printState(context);

        // Press left pedal for 3 seconds
        context.pressLeftPedalForTime(3);
        printState(context);

        // Press right pedal twice
        context.pressRightPedal(2);
        printState(context);

        // Press right pedal thrice
        context.pressRightPedal(3);
        printState(context);
    }

    private static void printState(Context context) {
        System.out.println("Current State: " + context.getState().getName());
        System.out.println("Current SubState: " + context.getState().getSubState());
        System.out.println("---------------");
    }
}


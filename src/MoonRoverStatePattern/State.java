/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package MoonRoverStatePattern;

/**
 *
 * @author anikettiwari
 */
public interface State {
    String getName();
    String getSubState();
    boolean pressRightPedal(int numOfTimesPressed);
    boolean pressRightPedalForTime(int numOfSecondsPressed);
    boolean pressLeftPedal(int numOfTimesPressed);
    boolean pressLeftPedalForTime(int numOfSecondsPressed);
}


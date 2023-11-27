/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import MoonRoverStatePattern.MoveForward;
import org.junit.Test;
import static org.junit.Assert.*;


/**
 *
 * @author anikettiwari
 */
public class MoveForwardTest {
    
    @Test
public void testPressRightPedal() {
    MoveForward moveForward = new MoveForward();

    // Test case: Press right pedal twice (transition between Accelerate and Decelerate)
    assertTrue(moveForward.pressRightPedal(2));

    // After the transition, the subState should be "Decelerate"
    assertEquals("Decelerate", moveForward.getSubState());
}
    
}

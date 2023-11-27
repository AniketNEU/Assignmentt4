/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import MoonRoverStatePattern.MoveBackward;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author anikettiwari
 */
public class MoveBackwardTest {
    
    @Test
    public void testPressLeftPedalForTime() {
        MoveBackward moveBackward = new MoveBackward();

        // Test case: Press left pedal for 3 seconds (transition to At Rest)
        assertTrue(moveBackward.pressLeftPedalForTime(3));
    }
    
}

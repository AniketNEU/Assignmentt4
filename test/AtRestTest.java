/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import MoonRoverStatePattern.AtRest;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author anikettiwari
 */
public class AtRestTest {
    
    @Test
    public void testPressRightPedal() {
        AtRest atRest = new AtRest();

        // Test case: Press right pedal once (transition to Move Forward)
        assertTrue(atRest.pressRightPedal(1));
    }
    
}

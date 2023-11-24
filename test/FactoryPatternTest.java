/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import FactoryPattern.Circle;
import FactoryPattern.Rectangle;
import FactoryPattern.Shape;
import FactoryPattern.ShapeFactory;
import FactoryPattern.Square;
import static org.junit.Assert.*;
import org.junit.Test;

public class FactoryPatternTest {

    @Test
    public void testGetCircle() {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape circle = shapeFactory.getShape("CIRCLE");

        assertNotNull(circle);
        assertTrue(circle instanceof Circle);
    }

    @Test
    public void testGetSquare() {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape square = shapeFactory.getShape("SQUARE");

        assertNotNull(square);
        assertTrue(square instanceof Square);
    }

    @Test
    public void testGetRectangle() {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape rectangle = shapeFactory.getShape("Rectangle");

        assertNotNull(rectangle);
        assertTrue(rectangle instanceof Rectangle);
    }
}


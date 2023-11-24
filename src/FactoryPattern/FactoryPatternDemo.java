/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FactoryPattern;

/**
 *
 * @author anikettiwari
 * @version 1.0
 */
/**
 * The FactoryPatternDemo class demonstrates the use of the Factory Pattern 
 * to create instances of different shapes using the ShapeFactory.
 */
public class FactoryPatternDemo {
    /**
     * The main method where the demonstration of the Factory Pattern occurs.
     * It creates a ShapeFactory and uses it to create instances of different shapes,
     * then calls the draw method on each shape.
     * @param args
     */
    public static void main(String[] args){
        ShapeFactory shapeFactory = new ShapeFactory();
        
        Shape shape1 = shapeFactory.getShape("circle");
        shape1.draw();
        
        Shape shape2 = shapeFactory.getShape("rectangle");
        shape2.draw();
        
        Shape shape3 = shapeFactory.getShape("square");
        shape3.draw();
    }
    
}

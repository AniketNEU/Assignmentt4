/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Facade;

/**
 * The FacadePatternDemo class demonstrates the use of the Facade Pattern
 * by using the ShapeMaker facade to draw various shapes.
 * It simplifies the client code by providing a unified interface to create and draw shapes.
 *
 * @author anikettiwari
 * @version 1.0
 */
public class FacadePatternDemo {
    /**
     * The main method where the demonstration of the Facade Pattern occurs.
     * It creates a ShapeMaker object and uses it to draw a circle, rectangle, and square.
     *
     * @param args Command line arguments 
     */
    public static void main(String[] args) {
        ShapeMaker shapeMaker = new ShapeMaker();
        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();
    }
}


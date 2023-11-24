/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Facade;

/**
 * The ShapeMaker class serves as a facade for drawing various shapes, including circles, rectangles, and squares.
 * It encapsulates the creation and drawing logic, providing a simplified interface for clients.
 *
 * @author anikettiwari
 * @version 1.0
 */
public class ShapeMaker {
    private Shape circle;
    private Shape rectangle;
    private Shape square;

    /**
     * Constructs a ShapeMaker object and initializes its internal shapes.
     * The default configuration includes a Circle, Rectangle, and Square.
     */
    public ShapeMaker(){
        circle = new Circle();
        rectangle = new Rectangle();
        square = new Square();
    }

    /**
     * Draws a circle using the encapsulated Circle object.
     */
    public void drawCircle(){
        circle.draw();
    }

    /**
     * Draws a rectangle using the encapsulated Rectangle object.
     */
    public void drawRectangle(){
        rectangle.draw();
    }

    /**
     * Draws a square using the encapsulated Square object.
     */
    public void drawSquare(){
        square.draw();
    }
}

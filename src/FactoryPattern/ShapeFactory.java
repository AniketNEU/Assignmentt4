/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FactoryPattern;

/**
 *
 * The ShapeFactory class is responsible for creating instances of different shapes.
 * It follows the Factory Pattern, allowing clients to create shapes without knowing
 * the specific implementation details.
 * @author anikettiwari
 * @version 1.0
 */
public class ShapeFactory {
    /**
     * This method returns a shape based on the given shape type
     * @param shapeType a string describing the type of shape to create
     * @return an instance of the shape or null
     */
    public Shape getShape(String shapeType){
        if(shapeType == null){
            return null;
        }
        
        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        }
        else if (shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }else if(shapeType.equalsIgnoreCase("Rectangle")){
            return new Rectangle();
        }
        return null;
    }
}

package Singleton;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * The SingletonPatternDemo class demonstrates the use of the Singleton Pattern
 * to ensure that only a single instance of the SingleObject class is created.
 * @author anikettiwari
 * @version 1.0
 */

public class SingletonPatternDemo {
    /**
     * The main method where the demonstration of the Singleton patter occurs.
     * @param args 
     */
    public static void main(String [] args){
        SingleObject object = SingleObject.getInstance();
        object.showMessage();
    }
    
}

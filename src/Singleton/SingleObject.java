package Singleton;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * This is the single object class representing a singleton design pattern
 * @author anikettiwari
 * @version 1.0
 */
public class SingleObject {
    
    private static SingleObject instance = new SingleObject();
    private SingleObject(){};
    /**
     * Returns the single instance of the SingleObject class.
     *
     * @return The single instance of the SingleObject class.
     */
    public static SingleObject getInstance(){
        return instance;
    }
    /** This is the show message method which returns a "Hello world!" message*/
    public void showMessage(){
        System.out.println("Hello world!");
    }
    
}

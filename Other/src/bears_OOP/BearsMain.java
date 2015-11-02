/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bears_OOP;

/**
 *
 * @author h
 */
public class BearsMain {
    
    public static void main(String [] args) {
    Bear grizzly = new GrizzlyBear();
    
    grizzly.display();
    grizzly.performEat();
    grizzly.performSound();
    
    Bear teddy = new TeddyBear();
    
    teddy.display();
    teddy.performEat();
    teddy.performSound();
    
   
            
    }
}
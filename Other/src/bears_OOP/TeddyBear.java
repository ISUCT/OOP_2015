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
public class TeddyBear extends Bear {
    public  TeddyBear(){
    soundBehavior = new SoundSinging();
    eatBehavior = new EatNothing();
    }
    
    public void display(){
    System.out.println("Im a Teddy bear!");
    }
}

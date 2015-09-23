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
public class GrizzlyBear extends Bear {
    public GrizzlyBear(){
    soundBehavior = new SoundRoar();
    eatBehavior = new EatMeat();
    }
    
    public void display() {
    System.out.println("Im a grizzly bear! Arr!");
    }
    
    
}

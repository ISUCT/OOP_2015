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
public class NorthBear extends Bear {
    public NorthBear(){
    soundBehavior = new SoundRoar();
    eatBehavior = new EatBerries();
    }
    
    public void display() {
    System.out.println("Im a North bear!");
    }
    
}

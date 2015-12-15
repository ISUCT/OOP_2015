/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simuduck;

/**
 *
 * @author h
 */
public class RedheadDuck extends Duck {

    public RedheadDuck(){
        quackBehavior = new Squeak();
        flyBehavior = new FlyWithWings();
    
    }
    public void display(){
        System.out.println("Im a red head duck!");
    }
    
}

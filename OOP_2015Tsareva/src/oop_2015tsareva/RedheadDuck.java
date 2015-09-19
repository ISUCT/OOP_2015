/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package oop_2015tsareva;

/**
 *
 * @author stud_17
 */
public class RedheadDuck extends Duck {

    public RedheadDuck(){
        quackBehavior = new Squeak();
        flyBehavior = new FlyWithWings();
    
    }
    @Override
    public void display(){
        System.out.println("Im a red head duck!");
   }
    
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package oop_2015_orlova_e_a;

/**
 *
 * @author stud_6
 */
public class RedheadDuck  extends Duck{
    public RedheadDuck(){
        quackBehavior = new Squeak();
        flyBehavior = new FlyWithWings();
        
    }
    @Override
    public void display(){
        System.out.println("Im a red head duck !");
    }
    
}

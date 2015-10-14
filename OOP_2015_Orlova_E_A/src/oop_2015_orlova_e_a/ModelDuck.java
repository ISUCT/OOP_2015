/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package oop_2015_orlova_e_a;

/**
 *
 * @author stud_6
 */
public class ModelDuck  extends Duck{
    
    public void Duck(){
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }
    
    @Override
    public void display(){
        System.out.println("I'm model duck !");
    }
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package oop_2015.krylova.ea;

/**
 *
 * @author stud_17
 */
public class ModelDuck extends Duck{

   
    public void Duck() {
    flyBehavior = new FlyNoWay();
    quackBehavior = new Quack();
    }

    @Override
    public void display() {
    System.out.println("I'm a model duck!");
    }
    
}

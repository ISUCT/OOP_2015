/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package oop_2015golovkina;

/**
 *
 * @author stud_17
 */
public class ModelDuck extends Duck {
    public ModelDuck() {
    flyBehavior = new FlyNoWay();
    quackBehavior = new Quack();
    }
    @Override
    public void display() {
    System.out.println("I'm a model duck!");
    }
    
}

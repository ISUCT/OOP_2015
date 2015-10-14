/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package oop_2015_orlova_e_a;

/**
 *
 * @author stud_6
 */
public class MallardDuck  extends Duck {
    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }
    @Override
    public void display(){
        System.out.println("I'm a real Mallard duck");
        
    }
}

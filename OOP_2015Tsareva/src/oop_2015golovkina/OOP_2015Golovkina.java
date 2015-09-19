/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package oop_2015golovkina;

/**
 *
 * @author stud_17
 */
public class OOP_2015Golovkina {

    /**
     * @param args the command line arguments
     */
   public static void main (String[] args){
    Duck mallard = new MallardDuck();
    mallard.performQuack();
    mallard.performFly();
        // TODO code application logic here
    Duck model = new ModelDuck();
    model.performFly();
    model.setFlyBehavior(new FlyRocketPowered());
    model.performFly();
    }
}
    
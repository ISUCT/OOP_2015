/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author stud_17
 */
public class ModelDuck extends Duck { 
   public ModelDuck() { 
      flyBehavior = new FlyNoWay() ; 
      quackBehavior = new Squeak(); 
   }
   public void display() { 
      System.out.println("I'm a model duck"); 
   }


    
}

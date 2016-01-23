/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author stud_17
 */
public class MiniClassDuckSimulator {
    public static void main (String [] args){
    Duck mallard = new MallardDuck();
    mallard.performQuack();
    mallard.performFly();
    
    Duck model = new ModelDuck();
    model.performFly();
    model.setFlyBehavior(new FlyRocketPowered());
    model.performFly();
    model.setFlyBehavior(new FlyWithWings());
    model.performFly();
    model.setFlyBehavior(new FlyNoWay());
    model.performFly();
    
    Duck readhead = new RedheadDuck();
    readhead.setQuackBehavior(new Squeak());
    readhead.performQuack();
    

    }
            
}

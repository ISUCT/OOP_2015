/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dekorator;

/**
 *
 * @author stud_17
 */
public class Whip extends CondimentDecorator  {

    Beverage beverage;
    
    public Whip(Beverage beverage) {
        description = "Whip";
    }

    @Override
    public double cost() {
       return 1.09 + beverage.cost();
    }

    @Override
    public String getDescription() {
     return beverage.getDescription() + ", Whip";
    }
    
}

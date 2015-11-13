/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dekorator;

/**
 *
 * @author stud_17
 */
public class Mocha extends CondimentDecorator {

    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Moch";
    }

    @Override
    public double cost() {
        return .20 + beverage.cost();
    }
}

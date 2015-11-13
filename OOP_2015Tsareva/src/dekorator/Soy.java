/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dekorator;

/**
 *
 * @author stud_17
 */
public class Soy extends CondimentDecorator {

    Beverage beverage;

    public Soy(Beverage beverage3) {
        description = "Soy";
        this.beverage = beverage3;
    }

    @Override
    public double cost() {
        return .12 + beverage.cost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }
}

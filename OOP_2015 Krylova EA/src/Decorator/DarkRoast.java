/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Decorator;

/**
 *
 * @author stud_17
 */
class DarkRoast extends CondimentDecorator {

   Beverage beverage;

    public DarkRoast(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ",DarkRoast";
    }

    @Override
    public double cost() {
        return .20 + beverage.cost();
    }
    }


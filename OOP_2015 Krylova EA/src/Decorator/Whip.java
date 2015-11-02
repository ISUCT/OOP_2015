/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Decorator;

/**
 *
 * @author stud_17
 */
 class Whip extends CondimentDecorator {

        Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ",Whip"; 
    }

    @Override
    public double cost() {
        return .20 + beverage.cost();
    }
    }
 
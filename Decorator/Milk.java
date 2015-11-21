/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Decorator;

/**
 *
 * @author h
 */
public class Milk extends CondimentDecorator {

    Beverage beverage;

    public Milk(Beverage beverage) {
        this.beverage = beverage;

    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", milk";

    }

    @Override
    public double cost() {
        return .10 + beverage.cost();

    }
}

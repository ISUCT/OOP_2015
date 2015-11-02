/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Decorator;

/**
 *
 * @author dmitry
 */
public class Esspresso extends Beverage {

    public Esspresso() {
        description = "Esspresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}

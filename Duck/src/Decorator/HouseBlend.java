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
public class HouseBlend extends Beverage {

    public HouseBlend() {
        description = "House Blend Cofee";

    }

    public double cost() {
        return .89;
    }
}

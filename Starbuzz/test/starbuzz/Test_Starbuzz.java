/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package starbuzz;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author h
 */
public class Test_Starbuzz {

    public Test_Starbuzz() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void coffee() {
        DarkRoast dr = new DarkRoast();
        assertEquals(0.99, dr.cost(), 0.001);

    }

    @Test
    public void Espresso_Whip() {
        Beverage beverage = new Espresso();
        beverage = new Whip(beverage);
        beverage.cost();
        assertEquals(2.09, beverage.cost(), 0.001);

    }

    @Test
    public void HouseBlend_Milk() {
        Beverage beverage = new HouseBlend();
        beverage = new Milk(beverage);
        beverage.cost();
        assertEquals(0.99, beverage.cost(), 0.001);
    }

    @Test
    public void Decaf_Mocha() {
       Beverage beverage = new Decaf();
        beverage = new Mocha(beverage);
        beverage.cost();
        assertEquals(1.25, beverage.cost(), 0.001); 
    }
    
    @Test
    public void DarkRoast_Soy() {
       Beverage beverage = new DarkRoast ();
        beverage = new Soy(beverage);
        beverage.cost();
        assertEquals(1.14, beverage.cost(), 0.001); 
    }
}

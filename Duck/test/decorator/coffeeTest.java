/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Decorator;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author h
 */
public class coffeeTest {
    
    public coffeeTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    @Test
    public void coffeeTest() {
        Espresso es = new Espresso();
        assertEquals(1.99, es.cost(), 0.001);
    }
    
    @Test
    public void coffeeAndMochaTest(){
        Beverage beverage3 = new HouseBlend();
        beverage3 = new Mocha(beverage3);
        beverage3.cost();
        assertEquals(1.09, beverage3.cost(), 0.001);
    
    }
    
    @Test
    public void coffeeAndMilkTest(){
        Beverage beverage5  = new DarkRoast();
        beverage5 = new Milk(beverage5);
        beverage5.cost();
        assertEquals(1.09, beverage5.cost(), 0.01);
        
        beverage5 = new Milk(beverage5);
        beverage5.cost();
        assertEquals(1.19, beverage5.cost(), 0.01);
        
        
    
    
    }
    
    @Test
    public void coffeeAndWhipAndSoyTest(){
        Beverage beverage6 = new Decaf();
        beverage6 = new Whip(beverage6);
        beverage6.cost();
        assertEquals(1.15, beverage6.cost(), 0.01);
        
        beverage6 = new Soy(beverage6);
        beverage6.cost();
        assertEquals(1.3, beverage6.cost(), 0.01);
    
    }
    
}
    



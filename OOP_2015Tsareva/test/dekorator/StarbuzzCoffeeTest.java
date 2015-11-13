/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dekorator;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author stud_17
 */
public class StarbuzzCoffeeTest {
    
    public StarbuzzCoffeeTest() {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(baos);
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    //System.setOut(ps);
    }
    
    @After
    public void tearDown() {
     //baos.reset();
    }

    /**
     * Test of main method, of class StarbuzzCoffee.
     */
    @Test
    public void espressoClean() {
        Beverage beverage = new Espresso();
        assertEquals(1.99, beverage.cost(), 0.01);
    }
    @Test
    public void espressoMocha() {
        Beverage beverage = new Espresso();
        beverage = new Mocha(beverage);
        assertEquals(2.19, beverage.cost(), 0.01);
    }
    
    @Test
    public void espressoTwoMocha() {
        Beverage beverage = new Espresso();
        beverage = new Mocha(beverage);
        beverage = new Mocha(beverage);
        assertEquals(2.39, beverage.cost(), 0.01);
    }
    
    @Test
    public void espressoSoy() {
        Beverage beverage = new Espresso();
        beverage = new Soy(beverage);
        assertEquals(2.11, beverage.cost(), 0.01);
    }
    
//    Beverage beverage2 = new DarcRoast();
//    beverage2 = new Mocha(beverage2);
//    beverage2 = new Mocha(beverage2);
//    beverage2 = new Whip(beverage);
//    System.out.println(beverage2.getDescription()
//            + " $" + beverage2.cost());
}

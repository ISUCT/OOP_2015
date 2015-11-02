/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dekorator;

/**
 *
 * @author stud_17
 */
class DarkRoast extends Beverage {

    public DarkRoast() {
        description = "DarkRoast";
    }

    @Override
    public double cost() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    
}

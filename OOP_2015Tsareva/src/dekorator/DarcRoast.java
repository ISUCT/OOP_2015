/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dekorator;

/**
 *
 * @author stud_17
 */
class DarcRoast extends Beverage {

    public DarcRoast() {
        description = "DarcRoats";
    }

    @Override
    public double cost() {
        return 1.13;
    }
    
}

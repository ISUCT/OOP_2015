/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dekorator;

/**
 *
 * @author stud_17
 */
public class Decaf extends Beverage {
    public Decaf() {
        description = "Decaf";
        }
    @Override
    public double cost(){
    return 1.95;
    }
    
}

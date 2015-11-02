/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package starbuzz;

/**
 *
 * @author stud_17
 */
public abstract class Beverage{
    String description = "Unknow Beverage";
    
    public String getDescription(){
        return description;
    }
    
    public abstract double cost();
}
    
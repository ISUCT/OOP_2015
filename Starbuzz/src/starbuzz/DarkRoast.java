/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package starbuzz;

/**
 *
 * @author stud_5
 */
public class DarkRoast extends Beverage {

    public DarkRoast(){
        description="DarkRoast";
    }
    
    @Override
    public double cost(){
        return .99;
    }
}

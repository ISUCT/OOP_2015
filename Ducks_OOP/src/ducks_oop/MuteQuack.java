/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ducks_oop;

/**
 *
 * @author stud_17
 */
public class MuteQuack implements QuackBehavior {
    public void quack() {
        System.out.println("<< Silence >>");
    }
}

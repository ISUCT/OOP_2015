/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bears_OOP;

/**
 *
 * @author h
 */
public abstract class Bear {
    SoundBehavior soundBehavior;
    EatBehavior eatBehavior;
    
    public Bear() {

    }

    public abstract void display();

    public void performSound() {
        soundBehavior.sound();
    }

    public void performEat() {

        eatBehavior.eat();
    }

    

    public void setSoundBehavior(SoundBehavior sb) {
        soundBehavior = sb;
    }

    public void setEatBehavior(EatBehavior eb) {
        eatBehavior = eb;
    } 
    
}

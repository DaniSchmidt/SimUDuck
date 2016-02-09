package com.simuduck;

/**
 * Created by schmidtda on 09.02.2016.
 */
public class Main {
    public static void main(String[] args) {
        RedHeadDuck redHeadDuck = new RedHeadDuck();
        redHeadDuck.quack();
        redHeadDuck.fly();

        MallardDuck mallardDuck = new MallardDuck();
        mallardDuck.quack();
        mallardDuck.fly();

        RubberDuck rubberDuck = new RubberDuck();
        rubberDuck.quack();
        rubberDuck.fly();
    }
}

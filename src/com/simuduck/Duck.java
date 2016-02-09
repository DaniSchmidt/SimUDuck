package com.simuduck;

/**
 * Created by schmidtda on 09.02.2016.
 */
public abstract class Duck {

    private final QuackBehaviour quackBehaviour;
    private final FlyBehaviour flyBehaviour;

    public Duck(QuackBehaviour quackBehaviour, FlyBehaviour flyBehaviour) {
        this.quackBehaviour = quackBehaviour;
        this.flyBehaviour = flyBehaviour;
    }

    public void swim() {

    }

    public abstract void display();

    public final String quack() {
        String quack = quackBehaviour.quack();
        System.out.println(quack);
        return quack;
    }

    public final void fly() {
        flyBehaviour.fly();
    }

}

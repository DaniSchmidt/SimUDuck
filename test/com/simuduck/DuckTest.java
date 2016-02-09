package com.simuduck;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by schmidtda on 09.02.2016.
 */
public class DuckTest {

    @Test
    public void testMallardDuck() {
        MallardDuck mallardDuck = new MallardDuck();
        Assert.assertEquals("quack", mallardDuck.quack());
    }

    @Test
    public void testRubberDuck() {
        RubberDuck rubberDuck = new RubberDuck();
        Assert.assertEquals("squeak", rubberDuck.quack());
    }

}

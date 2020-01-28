package com.platzi.javatests;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PriceCalculatorShould {

    @Test
    public void total_zero_when_there_are_no_price() {
        PriceCalculator calculator = new PriceCalculator();

        Assert.assertEquals(calculator.getTotal(), 0,0.1);
    }

    @Test
    public void total_is_the_sume_of_prices(){
        PriceCalculator calculator = new PriceCalculator();
        calculator.addPrice(13.2);
        calculator.addPrice(11.8);
        Assert.assertEquals(calculator.getTotal(),25,0.1);
    }


    @Test
    public void apply_discount_to_prices(){
        PriceCalculator calculator = new PriceCalculator();
        calculator.addPrice(13.2);
        calculator.addPrice(25.8);
        calculator.setDiscount(50);
        Assert.assertEquals(calculator.getTotal(),19.5,0.1);
    }
}
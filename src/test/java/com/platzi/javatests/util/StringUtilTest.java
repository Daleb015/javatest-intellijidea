package com.platzi.javatests.util;


import org.junit.Assert;
import org.junit.Test;

public class StringUtilTest {

    @Test
    public void repeat_string_once(){
        Assert.assertEquals("holaholahola",StringUtil.repeat("hola",3));

    }

    @Test
    public void repeat_string_multiple_times(){

        Assert.assertEquals("hola",StringUtil.repeat("hola",1));
    }

    @Test
    public void repeat_string_zero_times(){
        Assert.assertEquals("",StringUtil.repeat("hola",0));

    }

    @Test(expected = IllegalArgumentException.class)
    public void repeat_string_negative_times(){
        StringUtil.repeat("hola",-1);
    }


    @Test
    public void evaluate_when_string_exist(){
        Assert.assertFalse(StringUtil.isEmpty("Hola"));
    }

    @Test
    public void stringIsEmpty(){
        Assert.assertTrue(StringUtil.isEmpty(""));
    }

    @Test
    public void stringIsNull(){
        Assert.assertTrue(StringUtil.isEmpty(null));
    }

    @Test
    public void stringIsSpace(){
        Assert.assertTrue(StringUtil.isEmpty(" "));
    }

}
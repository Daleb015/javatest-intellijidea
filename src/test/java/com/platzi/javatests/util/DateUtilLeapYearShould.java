package com.platzi.javatests.util;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;


public class DateUtilLeapYearShould {

    /**
     * All years divisible by 400 are leap years(1600,2000,2400),
     * All years divisible by 100 nut not by 400 are not leap years (1700,1800,1900)
     * All years divisible by 4 but not by 100 are leap years (196,2004,2008)
     * All years not divisible by 4 are not leap years (2017,2018,2019)
     */

    @Test
    public void return_true_when_divisible_by_400(){

         Assert.assertTrue(DateUtil.isLeapYear(1600));
         Assert.assertTrue(DateUtil.isLeapYear(2000));
         Assert.assertTrue(DateUtil.isLeapYear(2400));
    }

    @Test
    public void return_false_when_year_is_divisible_by_100_but_no_by_400(){
        Assert.assertFalse(DateUtil.isLeapYear(1700));
        Assert.assertFalse(DateUtil.isLeapYear(1800));
        Assert.assertFalse(DateUtil.isLeapYear(1900));
    }

    @Test
    public void return_true_when_year_is_divisible_by_4_but_not_by_100(){
        Assert.assertTrue(DateUtil.isLeapYear(1996));
        Assert.assertTrue(DateUtil.isLeapYear(2004));
        Assert.assertTrue(DateUtil.isLeapYear(2008));
    }

    @Test
    public void return_false_when_year_is_not_divisible_by_4(){
        Assert.assertFalse(DateUtil.isLeapYear(2017));
        Assert.assertFalse(DateUtil.isLeapYear(2018));
        Assert.assertFalse(DateUtil.isLeapYear(2019));
    }

}
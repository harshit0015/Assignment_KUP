package com.knoldus;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Max_number_implTest {

    @Test
    public void findmaxnumbertest()
    {
        Max_number_impl object = new Max_number_impl();
        int num = object.maxnumber(10, 10);
        Assertions.assertEquals(10, num);
    }

    @Test
    public void notfindmaxnumbertest1()
    {
        Max_number_impl object = new Max_number_impl();
         object.maxnumber(101, 100);
        Assertions.assertNotEquals(100, 101);
    }
}


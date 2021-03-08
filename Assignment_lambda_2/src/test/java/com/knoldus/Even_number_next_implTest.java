package com.knoldus;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;


 public  class Even_number_next_implTest {
    @Test
    public void nextevennumberTest()
    {
        Long longReceived1 = Even_number_next_impl.next_even_number.apply(11L);
        Assertions.assertEquals(longReceived1,Long.valueOf(12));
    }
    @Test
     public void notnextevennumberTest1()
     {
         Long longReceived1 = Even_number_next_impl.next_even_number.apply(241L);
         Assertions.assertNotEquals(243,242,"number must be  even");
     }
}





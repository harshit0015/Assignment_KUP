package com.koldus;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Distinct_String_implTest
 {
    @Test
    public void distinct_String_test()
    {
        Distinct_String_impl object = new Distinct_String_impl();

        ArrayList<String> inputList1 = new ArrayList<>(Arrays.asList("java", "scala", "java", "clojure", "clojure"));
        ArrayList<String> expectedOutputList1 = new ArrayList<>(Arrays.asList("java", "scala", "clojure"));
        List<String> actualOutputList1 = object.returndistinctstring.implementofDistinctFromString(inputList1);
        Assert.assertEquals(actualOutputList1, expectedOutputList1);

        ArrayList<String> inputList2 = new ArrayList<>(Arrays.asList("the", "three", "the", "three", "the", "three", "an", "an", "a"));
        ArrayList<String> expectedOutputList2 = new ArrayList<>(Arrays.asList("a", "an", "the", "three"));
        List<String> actualOutputList2 = object.returndistinctstring.implementofDistinctFromString(inputList2);
        Assert.assertSame(actualOutputList2, actualOutputList2);

        ArrayList<String> inputList3 = new ArrayList<>(Arrays.asList(""));
        ArrayList<String> expectedInputList3 = new ArrayList<>(Arrays.asList(""));
        List<String> actualOutputList3 = object.returndistinctstring.implementofDistinctFromString(inputList3);
        Assert.assertEquals(actualOutputList3, expectedInputList3);
    }

    @Test
    public void notdistinct_String_test()
    {
        Distinct_String_impl object1 = new Distinct_String_impl();
        ArrayList<String> inputList4 = new ArrayList<>(Arrays.asList("the", "three", "the", "three", "the", "three", "an", "an", "a"));
        ArrayList<String> expectedOutputList2 = new ArrayList<>(Arrays.asList("a", "the", "three"));
        List<String> actualOutputList2 = object1.returndistinctstring.implementofDistinctFromString(inputList4);
        Assert.assertNotSame(inputList4,expectedOutputList2);
    }
 }

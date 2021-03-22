package com.knoldus;

import org.junit.Assert;
import org.junit.Test;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class String_Concatenate_implTest {
        @Test
        public void concatenate_testmethod()
        {
            List<String> awesomeAnimals = Arrays.asList("The","lambda","has","too","many","string","arguments.");
            String string = awesomeAnimals.stream().collect(Collectors.joining("")).toUpperCase();
            String expectedoutput = "THELAMBDAHASTOOMANYSTRINGARGUMENTS.";
            Assert.assertEquals(expectedoutput,string);
        }
        @Test
        public void concatenate_testmethod1()
        {
            List<String> awesomeAnimals = Arrays.asList("The","lambda","has","too","many","string","arguments.");
            String string2= awesomeAnimals.stream().collect(Collectors.joining("")).toUpperCase();
            String expectedoutput = "THELAMBDAHASTOOMANYSTRINGARGUMENTS";
            Assert.assertNotEquals(expectedoutput,string2);
        }
    }


package com.koldus;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Driverclass
 {
     public static void main(String[] args)
    {
        ArrayList<String> list1 = new ArrayList<>(Arrays.asList("java", "scala", "java", "clojure", "clojure"));
        Distinct_String_impl distinct_string_impl = new Distinct_String_impl();
        List<String> result= distinct_string_impl.returndistinctstring.implementofDistinctFromString(list1);
        System.out.println(result);
    }
 }



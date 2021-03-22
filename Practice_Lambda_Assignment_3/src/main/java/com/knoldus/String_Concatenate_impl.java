package com.knoldus;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class String_Concatenate_impl implements String_Concatenate_interface {

/* Implement of  concatenate_Uppercase_string() method  */
    @Override
    public String concatenate_Uppercase_string()
    {
        List<String> list = Arrays.asList("The", "lambda", "has", "too", "many", "string", "arguments.");

        String result  = list.stream().map(name -> name.toUpperCase()).collect(Collectors.joining(""));

       System.out.println(result);
        return result ;
    }

}

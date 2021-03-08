package com.koldus;

import java.util.stream.Collectors;

 public class Distinct_String_impl
  {
    /* Implement method to find distinct list from passing list */
    public Distinct_String returndistinctstring = (list1) ->
     list1.stream().distinct().collect(Collectors.toList());
  }

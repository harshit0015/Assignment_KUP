package com.knoldus;
import java.util.stream.LongStream;

public class ProductionInRangeBorder_impl
  {
    /* Implement production of all numbers in this range of left and right border */
        public ProductionInRangeBorder productInRangeInterface = (leftborder,rightborder) ->
      {
        long result = leftborder;
        result *= LongStream.rangeClosed(leftborder + 1,rightborder).reduce(1, (a, b) -> a * b);
        return result;
      };
  }



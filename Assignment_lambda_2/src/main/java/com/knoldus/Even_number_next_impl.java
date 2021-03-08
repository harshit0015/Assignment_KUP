package com.knoldus;

import java.util.function.Function;
import java.util.function.LongFunction;

public class Even_number_next_impl {
    /* Implement  method to find next even number of given number */
    public static Function<Long, Long> next_even_number = (n) -> n % 2 == 0 ? n + 2 : n + 1;

}
package com.knoldus;

import java.util.Scanner;

public class Driverclass {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        long number= sc.nextLong();

        Long nextEvenNumber =Even_number_next_impl.next_even_number.apply(Long.valueOf(number));
        System.out.println("Next Even number is : " +nextEvenNumber);
    }
}



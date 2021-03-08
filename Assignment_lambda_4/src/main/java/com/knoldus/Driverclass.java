package com.knoldus;

import java.util.Scanner;

public class Driverclass {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter  left and right range ");

        long leftborder = sc.nextLong();
        long rightborder = sc.nextLong();
        ProductionInRangeBorder_impl productionInRange = new ProductionInRangeBorder_impl();

        long Result = productionInRange.productInRangeInterface.productionInRange(leftborder,rightborder);
        System.out.println("Result are: " +Result);
    }
}



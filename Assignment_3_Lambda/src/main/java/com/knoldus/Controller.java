package com.knoldus;

import java.io.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

public class Controller {

    public static void main (String args[])
    {
        Readfile_checkrepeatedword_interface r1=new Readfile_checkrepeatedword_interface_impl();
        Readfile_Interface r2 =new Readfile_Interface_impl();

        Map<String, Integer> wordMap = r2.buildWordMap("Readdata_file");
        List<Map.Entry<String, Integer>> list =r1.sortByValueInDecreasingOrder(wordMap);
        System.out.println("List of repeated word from file and their count");
        for (Map.Entry<String, Integer> entry : list) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " => " + entry.getValue());
            }
        }
    }

}
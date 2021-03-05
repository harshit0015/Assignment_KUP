package com.knoldus;

import java.util.*;

public class Readfile_checkrepeatedword_interface_impl implements Readfile_checkrepeatedword_interface {



        public List<Map.Entry<String, Integer>> sortByValueInDecreasingOrder(Map<String, Integer> wordMap)
        { Set<Map.Entry<String, Integer>> entries = wordMap.entrySet();
            List<Map.Entry<String, Integer>> list = new ArrayList<>(entries);
            Collections.sort(list, new Comparator<Map.Entry<String, Integer>>()
            { @Override public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) { return (o2.getValue()).compareTo(o1.getValue()); } });
            return list;
        }

    }



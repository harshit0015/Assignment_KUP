package com.knoldus;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

class Readfile_Interface_impl implements Readfile_Interface {
        public Map<String, Integer> buildWordMap (String fileName)
        {
            Map<String, Integer> wordMap = new HashMap<>();
            // Using try-with-resource statement for automatic resource management
            try (FileInputStream fis = new FileInputStream(fileName);
                 DataInputStream dis = new DataInputStream(fis);
                 BufferedReader br = new BufferedReader(new InputStreamReader(dis))) {

                // words are separated by whitespace
                Pattern pattern = Pattern.compile("\\s+");
                String line = null;
                while ((line = br.readLine()) != null) {

                    // do this if case sensitivity is not required i.e.
                    line = line.toLowerCase();
                    String[] words = pattern.split(line);
                    for (String word : words) {
                        if (wordMap.containsKey(word)) {
                            wordMap.put(word, (wordMap.get(word) + 1));
                        } else {
                            wordMap.put(word, 1);
                        }
                    }
                }
            } catch (IOException ioex) {
                ioex.printStackTrace();
            }
            return wordMap;
        }
    }



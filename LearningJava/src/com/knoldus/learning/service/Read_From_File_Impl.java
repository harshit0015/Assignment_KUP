package com.knoldus.learning.service;

import com.knoldus.learning.entity.Employee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
public class Read_From_File_Impl implements  Read_From_File{

   String fileName="Data_Read.csv";
   private static List readByJavaClassic(String fileName) throws IOException {

      List<String> result = new ArrayList<>();
      BufferedReader br = null;

      try {

         br = new BufferedReader(new FileReader(fileName));

         String line;
         while ((line = br.readLine()) != null) {
            result.add(line);
         }

      } catch (IOException e) {
         e.printStackTrace();
      } finally {
         if (br != null) {
            br.close();
         }
      }

      return result;
   }

   @Override
   public List<Employee> readEmployeedata() {
      try {
      List list = readByJavaClassic(fileName);
      list.forEach(System.out::println);
   } catch (IOException e) {
      e.printStackTrace();
   }

      return null;
   }
}


package com.knoldus.learning.controller;

import com.knoldus.learning.entity.Employee;
import com.knoldus.learning.service.*;
import java.util.ArrayList;
import java.util.List;


public class EmployeeController {

    public static void main(String[] a){
        ValidateEmployeeService validateEmployeeService = new ValidateEmployeeServiceImpl();
        SaveEmployeeService saveEmployeeService = new SaveEmployeeServiceImpl();
        Read_From_File readdatafromfile=new Read_From_File_Impl();
        List<Employee> emplList = new ArrayList<>();
        for(int i = -5;i<10;i++){
            Employee employee = new Employee(i,"Name"+i);
            emplList.add(employee);
        }
        System.out.println("Total employee size  :  "+emplList.size());
        //emplList iterate and call validate service, then save.
        for (Employee e : emplList) {
            if(validateEmployeeService.validateEmployee(e))
                saveEmployeeService.saveEmployee(e);
        }
        System.out.println("Saved employee  : "+saveEmployeeService.getEmployeeCount());

        //Calling the DATA reading from File
       System.out.println("Reading Data from File : "+ readdatafromfile.readEmployeedata());

        }
    }


package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class PayrollCalculator {

    public static void main(String[] args) {
       try { BufferedReader bufReader =new BufferedReader(new FileReader("employees.csv"));
           bufReader.readLine();
                 String line;
           while ((line = bufReader.readLine()) != null) {
             String [] data=line.split("\\|");
             Employee employee=new Employee(Integer.parseInt(data[0]),data[1],Double.parseDouble(data[2]), Double.parseDouble(data[3]));
              double pay=employee.getGrossPay();
               System.out.printf("%d %s %.2f\n",employee.getEmployeeId(),employee.getName(),pay);
           }
       }
       catch(Exception e){
           e.printStackTrace();
       }


    }
}

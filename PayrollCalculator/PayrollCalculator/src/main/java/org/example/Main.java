package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {



    public static void main(String[] args) {
        try  {
            BufferedReader  bufferRead = new BufferedReader (new FileReader ("employees.csv")) ;
            String ReaderLine ;
            bufferRead.readLine();
            while ((ReaderLine = bufferRead.readLine()) != null) {
                String[] data = ReaderLine.split( "\\|") ;
                var employeeName=data[1];
                var employeeId=Integer.parseInt(data[0]);
                var hoursWorked= Double.parseDouble(data[2]);
                var payRate= Double.parseDouble(data[3]);
                Employee employee = new Employee(employeeId,employeeName,hoursWorked,payRate);
                System.out.printf("\nEmployeeID: %d, \nEmployeeName: %s, \nEmployeePay: $%.2f \n",employee.getEmployeeID(),employee.getName(),employee.getCrossPay());
            }
            bufferRead.close();
        } catch (IOException e)  {
         e.printStackTrace();
        }

    }
}
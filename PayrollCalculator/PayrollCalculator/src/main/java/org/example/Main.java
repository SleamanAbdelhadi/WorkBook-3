package org.example;

import java.io.*;
import java.util.Scanner;

public class Main {



          public static void main(String[] args) {
              try  {
           boolean done=false ;
           while (!done) {
               Scanner scanner = new Scanner(System.in);
               System.out.println("enter the name of employee file to process");
               String fileName = scanner.nextLine();

               if (fileName.equals("employees.csv")) {
                   System.out.println("enter the name of payroll file");
                   String payrollFileName = scanner.nextLine();

                   FileWriter fileWriter = new FileWriter(payrollFileName);
                   BufferedWriter bufWriter = new BufferedWriter(fileWriter);

                   BufferedReader bufferRead = new BufferedReader(new FileReader("employees.csv"));
                   String ReaderLine;
                   bufferRead.readLine();
                   while ((ReaderLine = bufferRead.readLine()) != null) {

                       String[] data = ReaderLine.split("\\|");
                       var employeeName = data[1];
                       var employeeId = Integer.parseInt(data[0]);
                       var hoursWorked = Double.parseDouble(data[2]);
                       var payRate = Double.parseDouble(data[3]);
                       Employee employee = new Employee(employeeId, employeeName, hoursWorked, payRate);
                       System.out.printf("\nEmployeeID: %d, \nEmployeeName: %s, \nEmployeePay: $%.2f \n", employee.getEmployeeID(), employee.getName(), employee.getCrossPay());

                       String output;
                       output = String.format("%d|%s|%.2f\n",employee.getEmployeeID(),employee.getName(),employee.getCrossPay()) ;
                    bufWriter.write(output);
                   }
                   bufferRead.close();
                   bufWriter.close();
                   done=true;
               }
               else{
                   System.out.println("enter correct employee file name");
               }
           }
        } catch (IOException e)  {
         e.printStackTrace();
        }

    }
}
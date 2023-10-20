package org.example;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        DateTimeFormatter date = null;
        LocalDateTime today = LocalDateTime.now();

        date = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        System.out.println(today.format(date));

        date = DateTimeFormatter.ofPattern("MMMM/d/yyyy");
        System.out.println(today.format(date));

        date = DateTimeFormatter.ofPattern("EEEE, MMMM d, yyyy, hh:mm");
        System.out.println(today.format(date));

        date = DateTimeFormatter.ofPattern("hh:mm, 'on' dd-MMM-yyyy");
        System.out.println(today.format(date));

        }





    }

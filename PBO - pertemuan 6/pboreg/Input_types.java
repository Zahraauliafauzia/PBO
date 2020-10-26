package com.pboreg;

import java.util.*;

public class Input_types {

    public static void main ( String[] args){

        Scanner objek = new Scanner(System.in);
        System.out.println("Enter name, age, and salary : ");

        String name = objek.nextLine();

        int age = objek.nextInt();

        double salary = objek.nextDouble();

        System.out.println("Name   : " + name);
        System.out.println("Age    : " + age);
        System.out.println("Salary : " + salary);
    }
}

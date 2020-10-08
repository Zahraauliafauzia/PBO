package com.pboreg;

public class Method_parameters {

    // Parameter dan argumen
    public static void myMethod (String name){

        System.out.println(name + " Refsnes");
    }

    // Multiple parameter
    public static void myAge (String fname, int age){     // Nah ini dia dua parameter, nama dan umur
        System.out.println(fname + " Resnes" + " is " + age + " Age");
    }


    // Ini adalah program utama
    public static void main(String[] args){

        myMethod("Rara");  // dipanggil fungsinya ke sini buat yang parameter dan argumen
        myMethod("Aulia");
        myMethod("Rascaly");
        System.out.println();

        myAge("Rara", 18);  // Untuk yang multiple parameter
        myAge("Rascal", 7);
        myAge("Lily", 10);
        System.out.println();

    }
}

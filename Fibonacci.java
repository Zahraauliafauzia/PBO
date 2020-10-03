package com.pboreg;
import java.util.*;
public class Fibonacci {

    public static void main (String[] args){

        // program looping deret fibnacci

        int f_n, fn_1, fn_2,n;

        Scanner inputUser = new Scanner (System.in);
        System.out.print("Mengambil nilai fibonacci ke : ");
        n = inputUser.nextInt();

        fn_2 = 0;
        fn_1 = 1;

        for (int i = 1; i <= n ; i++) {
            f_n = fn_1 + fn_2;
            fn_2 = fn_1;
            fn_1 = f_n;

            System.out.println("Nilai ke - " + i + " adalah " + f_n);
        }
        System.out.println();
        System.out.println("Program selesai");
    }
}

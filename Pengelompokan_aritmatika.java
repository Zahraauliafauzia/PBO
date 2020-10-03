package com.pboreg;

import java.util.Scanner;

public class Pengelompokan_aritmatika {

    public static void main(String[] args){

        /* Kesimpulannya
           perkalian dan pembagian akan dieksekusi lebih dulu
           dari pada penjumlahan dan pengurangan.

           jika dilakukan peralian dan pembagian, maka operasinya
           akan dilakukan dari kiri ke kanan. Begitu juga pada penjumlahan
           dan pengurangan.
         */


        int hasil = 5 * 10 / 2;
        System.out.println("Hasil = " + hasil);
        hasil = 8 + 10 - 2;
        System.out.println("Hasil = " + hasil);

        //menggunakan pengelompokan oeprasi aritmatika
        hasil = 120 / (3 +3);
        System.out.println("Hasil = " + hasil);

        Scanner userInput = new Scanner(System.in);
        //Perhitungan persamaan kuadrat
        System.out.println();
        System.out.println("----MENGHITUNG PERSAMAAN KUADRAT----");

        int m,x,c;

        System.out.print("Nilai x = ");
        x = userInput.nextInt();
        System.out.print("Gradien = ");
        m = userInput.nextInt();
        System.out.print("Bias c  = ");
        c = userInput.nextInt();

        int y = m*x * x + c;
        System.out.println("Maka nilai y = " + y);


    }
}

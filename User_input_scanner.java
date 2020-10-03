package com.pboreg;

import java.util.Scanner; /* Artinya adalah "saya mau ambil sebuah library scanner yg berada di folder utility
                            dan ada di older java" jadi ini tuh folder sebenernya. */

public class User_input_scanner {

    public static void main(String[] args){

        Scanner userInput = new Scanner(System.in); //Dia membuat objek objek user input yang artinya dia kelas scanner

        // Membuat perhitungan luas persegi panjang
        int panjang, lebar, luas, tinggi, volume;

        System.out.println("-----MENGHITUNG LUAS-----");
        System.out.print("Panjang = ");
        panjang = userInput.nextInt();
        System.out.print("Lebar   = ");
        lebar = userInput.nextInt();

        luas = panjang * lebar;
        System.out.println("Luas    = " + luas);

        System.out.println();
        System.out.println("-----MENGHITUNG VOLUME-----");
        System.out.print("Tinggi  = ");
        tinggi = userInput.nextInt();

        volume = panjang * lebar * tinggi;
        System.out.println("Volume  = "  + volume);



    }
}

package com.pboreg;

import java.util.*; // terakhirnya bisa pakai .* atau .Scanner (sama saja untuk input data nantinya)

public class Latihan_Operator {

    public static void main(String[] args){

        // membuat sebuah onjek untuk menangkap inpus dari user
        Scanner inputUser = new Scanner(System.in);

        //Sebuah program sederhana untuk menebak angka
        int nilaiBenar = 6;
        int nilaiTebakan;
        boolean statusTebakan;

        System.out.print("Masukkan nilai anda = ");
        nilaiTebakan = inputUser.nextInt();
        System.out.println("Nilai tebakan anda  = " + nilaiTebakan);

        // Operasi logika
        statusTebakan = (nilaiTebakan==nilaiBenar);
        System.out.println("Tebakan anda        = " + statusTebakan);

        // Operasi aljabar boolean (and / or)
        System.out.println();
        System.out.println("Masukkan nilai diantara 4 - 8");
        nilaiTebakan = inputUser.nextInt();

        statusTebakan = (nilaiTebakan >= 3) && (nilaiTebakan <= 7);
        System.out.println("Tebakan anda = " + statusTebakan);

        // Logikanya seperti tabel kebenaran AND



    }
}

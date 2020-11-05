package com.uts;

import java.util.Scanner;

public class Main_dollar {

    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        Dollar data = new Dollar();

        System.out.println("-------------Selamat Datang di Konversi RARA ----------------");
        System.out.print("Masukkan nama : ");
        data.nama = input.next();
        System.out.print("Masukkan umur : ");
        data.umur = input.next();

        System.out.println("\nNama = " + data.getNama());
        System.out.println("Umur = " + data.getUmur() + " tahun");

        Dollar konversi1 = new Dollar("RARA");
        konversi1.display();
        konversi1.rumus();
        konversi1.display2();
        konversi1.rumus2();


    }
}

package com.pboreg;

import java.util.*;

public class Latihan_looping {

    public static  void main (String[] args){

        // Program menjumlahkan dengan perulangan loop

        int nilai_awal, nilai_akhir, total, total1, total2;

        Scanner inputUser = new Scanner(System.in);
        System.out.print("Masukkan nilai awal  = ");
        nilai_awal = inputUser.nextInt();
        System.out.print("Masukkan nilai akhir = ");
        nilai_akhir = inputUser.nextInt();

        total = 0;

        while (nilai_awal <= nilai_akhir){
            total = total + nilai_awal;
            System.out.println("ditambah " + nilai_awal + " menjadi " + total);
            nilai_awal++;
         }


        // Menggunakan Do While
        System.out.println();
        System.out.println();

        total1 = 0;

        Scanner inputAngka = new Scanner(System.in);
        System.out.print("Masukkan nilai awal  = ");
        nilai_awal = inputAngka.nextInt();
        System.out.print("Masukkan nilai akhir = ");
        nilai_akhir = inputAngka.nextInt();


        do{
            total1 = total1 + nilai_awal;
            System.out.println("ditambah " + nilai_awal + " Menjadi " + total1);
            nilai_awal++;
        }while (nilai_awal <= nilai_akhir);


        // Menggunakan for while
        System.out.println();
        System.out.println();

        total2 = 0;

        Scanner inputNilai = new Scanner((System.in));
        System.out.print("Masukkan nilai awal  = ");
        nilai_awal = inputNilai.nextInt();
        System.out.print("Masukkan nilai akhir = ");
        nilai_akhir = inputNilai.nextInt();

        for (; nilai_awal <= nilai_akhir; nilai_awal++){

            total2 = total2 + nilai_awal;
            System.out.println("ditambah " + nilai_awal + " menjadi " + total2);

        }

        // bikin sistem log in jadi klo user name benar "Anda masuk ke dalam dashboard"
        // kalau salah sekali masuk log in lagi
        // tiga kali salah progrmanya keluar atau di blokir, tantangan dari pak hendi

    }
}

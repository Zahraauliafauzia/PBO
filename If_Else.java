package com.pboreg;
import java.util.*;
public class If_Else {

    public static void main(String[] args){

        // Pemrograman percabangan If statement

        int a = 8 ;

        System.out.println("-----If statement-------");
        System.out.println("Nilai = " + a);

        // Ini adalah cabangnya

        if (a == 10) {

            System.out.println("Ini adalah cabang");
        } else{

            System.out.println("Nilai tidak sesuai");
        }

        System.out.println("Selesai");
        System.out.println();
        System.out.println();
        System.out.println("-----If else statement-----");


        //If Else statement

        int b = 7;

        System.out.println("Ini adalah awal program");
        //if else if statementnya

        if (b == 10){
            System.out.println("Aksi 1 yang keluar");
        } else if (b == 3){
            System.out.println("Aksi 2 yang keluar");
        } else {
            System.out.println("aksi default!"); //tidak memenuhi aksi 1 dan 2, ya dicetak ini
        }

        System.out.println("Ini adalah akhir program");
        System.out.println();
        System.out.println();



        //Is nested statement (if bersarang)

        System.out.println("-------- Netsed If --------");
         int c = 6;
         int d = 2;

        System.out.println("Awal program");

        if (c == 6){
            if (d == 1){
                System.out.println("ini adalah kondisi c = 6 dan d = 2");
            }else {
                System.out.println("ini adalah kondisi c = 6 dan d bukan 2");
            }
        }else{
            System.out.println("ini adalah kondisi c bukan 6 dan d bukan 2");
        }
        System.out.println();
        System.out.println("selesai.");
    }
}

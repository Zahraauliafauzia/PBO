package com.pboreg;
import java.util.*;
public class Switch_case {
// ------------Switch Case--------------

    public static void main(String[] argrs){

       String input;

       Scanner inputUser = new Scanner(System.in);
       System.out.print("Panggil nama : ");
       input = inputUser.next();

        // Ekspresinya berupa satuan (int, long, byte, short, string, dan anum).
        switch (input){
            case "otong":
                System.out.println("Saya hadir mba rara!");
                break;
            case "putra":
                System.out.println("Hadir mba rara!");
                break;
            case "dwi":
                System.out.println("yak hadir!");
                break;
            default:
                System.out.println("tidak hadir mba rara");
        }
        System.out.println();
        System.out.println("Absen selesai.");
        System.out.println();
        System.out.println();



        //Ternary Operator
        int nilai,x;

        Scanner nilaiAngka = new Scanner(System.in);
        System.out.println("------Ternary Operator-----");
        System.out.print("Masukkan angka = ");
        nilai = nilaiAngka.nextInt();

        // variabel x = ekspresi ? statement true : statement false

        x = (nilai == 16) ? (nilai*nilai) : (nilai/2);  //inget ini pake int, jdi hasil bagi dibulatkan
        System.out.println();
        System.out.println("Hasilnya = " + x);

    }
}

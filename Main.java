package com.pboreg;

public class Main {

    public static void main(String[] args) {

        // While Loop

        // while ( kondisi){
        //    aksi
        // }

        int a = 0;
        boolean kondisi = true;

        System.out.println("Awal program");

        while (kondisi){
            System.out.println("While loop ke-" + a ); //Jika a++ diletakkan dibawah println ini
            // maka coba aja, yang keprint itu hanya sampai loop ke 15

            if(a == 16){
                kondisi = false;
            }
            a++;
        }
        System.out.println("Akhir program");
        System.out.println("Selesai");
        System.out.println();

        int b = 0 ;
        while (b < 5){
            b+=2;
            System.out.print(b + " ");

        }
    }
}

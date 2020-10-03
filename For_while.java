package com.pboreg;

public class For_while {

    public static void main (String[] args){
//
//        for (inisialisasi; kondisi; step nilai){
//            aksi;
//        }

        System.out.println("ini awal program");

        System.out.println("Loop Pertama");

        for (int nilai = 0; nilai < 7; nilai++){

            System.out.println("For loop ke - " + nilai);
        }

        System.out.println();
        System.out.println("Loop Kedua");

        for (int nilai = 2; nilai <= 7; nilai++){

            System.out.println("For loop ke - " + nilai);
        }

        System.out.println();
        System.out.println("Loop ketiga");

        for (int nilai = 10; nilai >= 3; nilai--){

            System.out.println("For loop ke - " + nilai);
        }

        System.out.println();
        System.out.println("Ini akhir program");
        System.out.println();

        for (int a = 0; a <= 10 ; a = a + 2) {
            System.out.println("Hallo ke - " + a);
        }

        System.out.println();
        for (int  i = 0; i <10; i ++){
            if (i == 4){   //4 nya tidak kecetak, tapi program terus berlanjut
                continue;
            }
            System.out.println(i);
        }
    }
}

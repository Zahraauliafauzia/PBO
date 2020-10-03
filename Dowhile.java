package com.pboreg;

public class Dowhile {

    public static void main(String[] args) {

//        do{
//           aksi
//       }while (kondisi);

        System.out.println("Awal program ");

        int r = 0;
        boolean kondisi = true;

        do {
            r++;                                        // Aksiknya diletakan di atas untuk melakukan do while
            System.out.println("Do while ke - " + r);

            if (r == 5) {
                kondisi = false;
            }

        } while (kondisi);

        System.out.println("Akhir program");
        System.out.println();


        int a = 0;

        do {
            System.out.print(a + " ");
            a++;
        }
        while (a <= 5);
    }
}

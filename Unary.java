package com.pboreg;

public class Unary {
    public static void main(String[] args) {
        // Unary = Operasi yang dilakukan pada satu variabel saja

        int angka = 1;
        System.out.println("Unary (-) : " + angka + " mnenjadi " + angka);

        // Unary decrement dan increment
        int angka2 = 10;
        angka2++; //bertambah satu
        System.out.println("Nilai dengan (++) menjadi = " + angka2);

        int angka3 = 17;
        angka3--;
        System.out.println("Nilai dengan (--) menjadi = " + angka3);
        System.out.println();

        int a = 6;
        System.out.println("Nilai dengan (++) prefix menjadi = " + ++a); //Ditambah dulu kemudian baru ditampilkan
        int b = 6;
        System.out.println("Nilai dengan (++) prefix menjadi = " + b++); // ditambilkan dulu baru ditambah
        System.out.println("Nilai dengan (++) prefix menjadi = " + b); // Ketika cetak kedua kalinya baru bertambah

        // Unary Boolen dengan ! untuk negasi

        boolean rara = true;
        System.out.println();
        System.out.println("Nilai boolean = " + rara);
        System.out.println("Nilai boolean = " + !rara);

    }
}

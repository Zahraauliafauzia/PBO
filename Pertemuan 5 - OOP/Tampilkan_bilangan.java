package com.pboreg;

public class Tampilkan_bilangan {

    public static void main(String[] args){

        Bilangan obil = new Bilangan();

        System.out.println("Nilai A = " + obil.tampilkan_a());
        System.out.println("Nilai B = " + obil.tampilkan_b());
        System.out.println("Nilai C = " + obil.tampilkan_c());
        System.out.println();

        //nilai A diinput
        obil.inputA(100);
        System.out.println("Nilai A setelah diinput = " + obil.tampilkan_a());

        obil.inputB(200);
        System.out.println("Nilai B setelah diinput = " + obil.tampilkan_b());

        obil.inputC(300);
        System.out.println("Nilai C setelah diinput = " + obil.tampilkan_c());
        System.out.println();


        System.out.println("Hasil pertambahan = "+ obil.tambah());
        System.out.println();

        System.out.println("Hasil pertambahan = "+ obil.kurang());
        System.out.println();

        System.out.println("Hasil pertambahan = "+ obil.kali());
        System.out.println();


    }
}

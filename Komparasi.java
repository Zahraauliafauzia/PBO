package com.pboreg;

public class Komparasi {

    public static void main(String[] args){

        // Operator komparasi ini akan menghasilkan nilai dalam bentuk boolean

        int a,b;
        boolean hasilKomparasi;

        // operator equal atau persamaan
        System.out.println("------PERSMAAN------");
        a = 16;
        b = 16;
        hasilKomparasi = (a==b);
        System.out.println(a + " = " + b + " --> " + hasilKomparasi);

        a = 12;
        b = 16;
        hasilKomparasi = (a==b);
        System.out.println(a + " = " + b + " --> " + hasilKomparasi);

        // operator not equal atau pertidaksamaan
        System.out.println("------PERTIDAKSAAN------");
        a = 16;
        b = 16;
        hasilKomparasi = (a!=b);
        System.out.println(a + " = " + b + " --> " + hasilKomparasi);

        a = 12;
        b = 16;
        hasilKomparasi = (a!=b);
        System.out.println(a + " = " + b + " --> " + hasilKomparasi);

        // operator less than atau kurang dari
        System.out.println("------KURANG DARI------");
        a = 18;
        b = 16;
        hasilKomparasi = (a<b);
        System.out.println(a + " = " + b + " --> " + hasilKomparasi);

        a = 12;
        b = 16;
        hasilKomparasi = (a<b);
        System.out.println(a + " = " + b + " --> " + hasilKomparasi);

        // operator greater than atau lebih dari
        System.out.println("------LEBIH DARI------");
        a = 18;
        b = 16;
        hasilKomparasi = (a>b);
        System.out.println(a + " = " + b + " --> " + hasilKomparasi);

        a = 12;
        b = 16;
        hasilKomparasi = (a>b);
        System.out.println(a + " = " + b + " --> " + hasilKomparasi);

        // operator less than equal atau kurang dari sama dengan
        System.out.println("------KURANG DARI SAMA DENGAN------");
        a = 16;
        b = 16;
        hasilKomparasi = (a<=b);
        System.out.println(a + " = " + b + " --> " + hasilKomparasi);

        a = 20;
        b = 16;
        hasilKomparasi = (a<=b);
        System.out.println(a + " = " + b + " --> " + hasilKomparasi);

        // operator greater than equal atau lebih dari sama dengan
        System.out.println("------LEBIH DARI SAMA DENGAN------");
        a = 16;
        b = 16;
        hasilKomparasi = (a>=b);
        System.out.println(a + " = " + b + " --> " + hasilKomparasi);

        a = 12;
        b = 16;
        hasilKomparasi = (a>=b);
        System.out.println(a + " = " + b + " --> " + hasilKomparasi);

    }
}

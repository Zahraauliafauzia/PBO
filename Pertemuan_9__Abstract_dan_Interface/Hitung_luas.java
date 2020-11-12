package com.pboreg;
import java.util.Scanner;

abstract class bangunRuang {

    public abstract void Luas();

}

class Segitiga extends bangunRuang {
    public void Luas() {
        int alas, tinggi;
        Scanner input = new Scanner(System.in);
        System.out.println("----Hitung luas segitiga----");
        System.out.print("-> Masukkan alas   : ");
        alas = input.nextInt();
        System.out.print("-> Masukkan tinggi : ");
        tinggi = input.nextInt();

        double luas1;
        luas1 = 0.5 * alas * tinggi;

        System.out.println("=> Luas segitiga adalah 0.5 x " + alas + " x " + tinggi + " = "+ luas1 + " Cm2");
    }
}

class Lingkaran extends bangunRuang {
    public void Luas(){
        int diameter;

        double luas2;

        Scanner input = new Scanner(System.in);
        System.out.println("\n----Hitung luas lingkaran----");
        System.out.print("-> Masukkan diamater : ");
        diameter = input.nextInt();

        double jari2 = diameter /2;
        luas2 = 3.14 * jari2 * jari2;
        System.out.println("=> Luas lingkaran adalah 3.14 x " + jari2 + " x " + jari2+ "= " + luas2 + " Cm2");



    }
}


public class Hitung_luas {

    public static void main (String [] args){
        Segitiga segitiga1 = new Segitiga();
        segitiga1.Luas();

        Lingkaran lingkaran1 = new Lingkaran();
        lingkaran1.Luas();


    }
}

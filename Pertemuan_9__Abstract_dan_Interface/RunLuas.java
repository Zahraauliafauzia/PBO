package com.pboreg;

interface Hitung {

    public void bernama();
    public void Luas();
}

class Segi3 implements Hitung {
    @Override
    public void bernama() {
        System.out.println("Ini adalah bangun ruang segitiga");
    }

    @Override
    public void Luas() {
        int alas= 5;
        int tinggi = 2;
        double luasSegi3;
        luasSegi3 = 0.5 * alas * tinggi;
        System.out.println("Luas segitiga dengan alas " + alas + " dan tinggi " + tinggi +
                " adalah " + luasSegi3 + " Cm2");
    }
}

public class RunLuas {
    public static void main (String [] args){

        Segi3 segitiga1 = new Segi3();
        segitiga1.bernama();
        segitiga1.Luas();

    }

}

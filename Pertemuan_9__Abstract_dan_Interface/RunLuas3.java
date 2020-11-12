package com.pboreg;

interface Luas{
    public void setSisi(double...sisi);
    public double getLuas();
    public double getLuas2();
}
class LuasSegitiga implements  Luas {
    private double alas;
    private double tinggi;

    @Override
    public void setSisi(double... sisi) {
        this.alas = sisi[0];
        this.tinggi = sisi[1];

    }

    public double getAlas() {
        return alas;
    }

    public double getTinggi() {
        return tinggi;
    }


    @Override
    public double getLuas() {
        double luas = 0.5 * this.alas * this.tinggi;
        return luas ;

    }

    @Override
    public double getLuas2() {
        return 0;
    }

}
class LuasLingkaran implements Luas {
    private double r;

    public void setSisi(double... sisi) {
        this.r = sisi[0];
    }

    @Override
    public double getLuas() {
        return 0;
    }

    public double getR() {
        return r;
    }

    @Override
    public double getLuas2() {
        double luas2 = 3.14 * this.r * this.r;
        return  luas2;
    }
}


public class RunLuas3 {
    public static void main(String[] args) {
        LuasSegitiga ls = new LuasSegitiga();
        ls.setSisi(5,10);
        System.out.println("Luas segitiga = 0.5 x "
                +ls.getTinggi()+" x "
                +ls.getAlas()+" = "+ls.getLuas());

        LuasLingkaran Ll = new LuasLingkaran();
        Ll.setSisi(6);
        System.out.println("Luas lingkaran = 3.14 x " + Ll.getR() +
                " x " +Ll.getR() + " = " + Ll.getLuas2());

    }
}
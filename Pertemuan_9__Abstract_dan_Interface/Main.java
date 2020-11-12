package com.pboreg;

//Class Abstrack
abstract class Hewan{

    //abstrac method (tidak memiliki body)
    public abstract void suaraHewan();

    //reguler method
    public void tidur (){
        System.out.println("Zzz ...");
    }
}

//Subclass (turunan dari Class Hewan)
class Ayam extends Hewan{
    public void suaraHewan(){
        // body dari abstract method suaraHewan() dituis di sini

        System.out.println("Kuukuruyuuuuukkk...");
    }
}

class Kucing extends Hewan {
    public void suaraHewan(){

        System.out.println("Meong...meong..meong..");
    }
}

public class Main {

    public static void main(String[] args) {

        Ayam ayamku = new Ayam(); // membuat objek ayam
        ayamku.suaraHewan();
        ayamku.tidur();

        Kucing kucingku = new Kucing(); //membuat objek kucing
        kucingku.suaraHewan();
        kucingku.tidur();
    }
}

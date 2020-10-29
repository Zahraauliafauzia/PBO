package com.pbo;

// this.name akan mengakses atribut name kalau ada di kelas ini
// kalau tidak ada dia akan mengakses atribut name dari super class
// super.name hanya akan mengambil atribut name dari kelas super

public class HeroStregth extends Hero{
    String name = "Class Stregth";

    void display(){
        System.out.println("Ini adalah " + this.name); // jadinya kepanggil yg super classnya
        this.dummyMethod();
        System.out.print("\n");
    }
    void displaySuper(){
        System.out.println("Ini adalah " + super.name);// jadinya kepanggil yg super classnya
        super.dummyMethod();
        System.out.print("\n");
    }

    void dummyMethod(){
        System.out.println("method ini ada di subclass");
    }

}


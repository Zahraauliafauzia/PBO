package com.pboreg;

class Bilangan {    //Ini hanya package saja jadinya

    private int a = 10;
    private int b = 20;
    private int c = 30;

    //Method
    public int tampilkan_a(){
        return this.a;
    }
    public int tampilkan_b(){

        return this.b;
    }
    public int tampilkan_c(){

        return this.c;
    }

    //Input nilai A
    public void inputA(int nilai){
        this.a = nilai;
    }
    //Input nilai B
    public void inputB(int nilai){
        this.b = nilai;
    }
    //Input nilai C
    public void inputC(int nilai){
        this.c = nilai;
    }

    //Penambahan
    public int tambah(){
        int hasil = this.a + this.b + this.c;
        return hasil;
    }

    //Pembagian
    public int kurang(){
        int hasil = this.a - this.b - this.c;
        return hasil;
    }

    //Perkalian
    public int kali(){
        int hasil = this.a * this.b * this.c;
        return hasil;
    }

}

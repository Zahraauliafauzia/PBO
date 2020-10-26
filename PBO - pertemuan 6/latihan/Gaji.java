package com.latihan;

public class Gaji{
    int gajiPokok;
    int jamKer;
    int gajiLembur;
    int gajiTotal;

    Gaji(int gajiPokok, int jamKer, int gajiLembur){
        this.gajiPokok = gajiPokok;
        this.jamKer = jamKer;
        this.gajiLembur = gajiLembur;
    }

    void display(){
        System.out.println("Jam kerja   : " + this.jamKer + " jam");
        System.out.println("Gaji pokok  : Rp " + this.gajiPokok);
        System.out.println("Gaji lembur : Rp " + this.gajiLembur);
    }
}

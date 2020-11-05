package com.uts;

import java.util.Scanner;

class Dollar {

    double rupiah2, konfersi, konfersi2, dollar2;
    int dollar = 14591;
    int rupiah = 14591;
    String nama,umur, mataU,bank;


    Dollar(String bank){
        this.bank = bank;

    }

    public Dollar(String nama, String mataU,String umur) {
        this.nama = nama;
        this.mataU = mataU;

    }

    public Dollar() {

    }

    void rumus(){
        konfersi = rupiah2 / dollar;  // rupiah ke dollar -> hasilnya dollar

        System.out.println("Mata uang Rupiah : Rp " + rupiah2);
        System.out.println("Dikonversi       : " + konfersi + " dollar");

    }

    void rumus2(){
        konfersi2 = dollar2 * rupiah;

        System.out.println("Mata uang Dollar :" + dollar2);
        System.out.println("Dikonversi       : Rp " + konfersi2);
    }

    void display(){

        Scanner input = new Scanner(System.in);

        System.out.println("Ingin Konversi antara mata uang DOLLAR - RUPIAH di bank  " + this.bank + ":D");
        System.out.println("\nSilahkan Konversi menjadi Dollar!");
        System.out.print("Mata uang Rupiah : ");
        rupiah2= input.nextDouble();
    }

    void display2(){
        Scanner input = new Scanner(System.in);

        System.out.println("\nSilahkan Konversi menjadi Rupiah!");
        System.out.print("Mata uang Dollar : ");
        dollar2= input.nextDouble();
    }


    public String getUmur() {
        return umur;
    }


    public String getNama() {
        return nama;
    }

    public String getMataU() {
        return mataU;
    }

}

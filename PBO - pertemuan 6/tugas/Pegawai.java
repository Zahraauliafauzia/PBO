package com.tugas;

class Pegawai {
    String nama;
    int umur;
    String jabatan;
    int gajiPokok;
    int jamKer;
    double pajak;

    void display(){
        System.out.println("Name       : " + this.nama);
        System.out.println("Umur       : " + this.umur);
        System.out.println("Jabatan    : " + this.jabatan);
        System.out.println("Gaji pokok : Rp " + this.gajiPokok);
        System.out.println("Jam kerja  : " + this.jamKer + " jam\n");

    }

}

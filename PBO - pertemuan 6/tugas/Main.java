package com.tugas;

public class Main {

    public static void main (String [] args){



        Pegawai pegawai1 = new Pegawai();
        pegawai1.nama = "Rara";
        pegawai1.umur = 18;
        pegawai1.jabatan = "Boss";
        pegawai1.jamKer = 100;
        pegawai1.display();

        Pegawai pegawai2 = new Pegawai();
        pegawai2.nama = "Putra";
        pegawai2.umur = 23;
        pegawai2.jabatan = "Manager";
        pegawai2.gajiPokok = 2889000;
        pegawai2.jamKer = 178;
        pegawai2.display();


    }
}

package com.tugas;

public class Main {

    public static void main (String [] args){

        Pegawai pegawai1 = new Pegawai();
        pegawai1.nama = "Rara";
        pegawai1.umur = 18;
        pegawai1.jabatan = "Manager";
        pegawai1.display();

        Pegawai pegawai2 = new Pegawai();
        pegawai2.nama = "Putra";
        pegawai2.umur = 23;
        pegawai2.jabatan = "Sekretaris";
        pegawai2.display();

        Pegawai pegawai3 = new Pegawai();
        pegawai3.nama = "Rascal";
        pegawai3.umur = 25;
        pegawai3.jabatan = "Accounting";
        pegawai3.display();

        Pegawai pegawai4= new Pegawai();
        pegawai4.nama = "Lily";
        pegawai4.umur = 22;
        pegawai4.jabatan = "HRD";
        pegawai4.display();




    }
}

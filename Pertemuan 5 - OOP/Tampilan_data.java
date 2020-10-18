package com.pboreg;

public class Tampilan_data {

    public static void main(String[] ars){

        Data baru = new Data();

        baru.inputNim(2019071030);
        System.out.println("NIM         : " + baru.tampilkan_nim());

        baru.nama  = "Zahra Aulia";
        baru.prodi = "Informatika";
        baru.IPK   = 3.69;
        baru.run();

        baru.inputB(2019);
        System.out.println("Angakatan   : " + baru.tampilkan_tahun());

        baru.unive = "Universitas Pembangunan Jaya";
        baru.univ();


    }
}

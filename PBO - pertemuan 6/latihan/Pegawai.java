package com.latihan;

// Pegawainya
// Gaji lembur
// gaji total

class Pegawai {
    String nama;
    String umur;
    String jabatan;
    // objek member
    Gaji gaji;
    Pajak pajak;

    Pegawai(String nama, String umur, String jabatan) {
        this.nama = nama;
        this.umur = umur;
        this.jabatan = jabatan;
    }

    void equipGaji(Gaji gaji){
        this.gaji = gaji;
    }

    void equipPajak(Pajak pajak){
        this.pajak = pajak;
    }

    void display(){
        System.out.println("Nama        : " + this.nama);
        System.out.println("Umur        : " + this.umur + " tahun");
        System.out.println("Jabatan     : " + this.jabatan);
        this.gaji.display();
        this.pajak.display();

    }

}

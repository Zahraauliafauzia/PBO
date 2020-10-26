package com.pboreg;

import java.util.*;

class Orang {

    private String nama;
    private int umur;
    private String golDarah;

    //constructor
    public Orang() {
        this.nama = "Bina";
        this.umur = 16;
        this.golDarah = "A";
    }

    public void setGolDarah(String golDarah){

        this.golDarah = golDarah;
    }

    public String getNama() {
        return this.nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }


    public int getUmur() {
        return this.umur;
    }

    public String getGolDarah(){
        return this.golDarah;
    }
}

class Pegawai extends Orang {
    private String nip;
    private String jabatan;

    public Pegawai(){
        this.nip = "123";
        this.jabatan = "Security";
    }

    public void setNip(String nip) {
        this.nip = nip;
    }
    public String getNip(){
        return nip;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }
    public String getJabatan(){
        return jabatan;
    }


}


public class Main {


    public static void main (String[] args){

        Scanner input = new Scanner(System.in);
        String _nama;
        String _golDarah;
        String _nip;
        String _jabatan;
        int _umur;
        Pegawai pegawai1 = new Pegawai();

        System.out.print("Masukkan nama  : ");
         _nama = input.nextLine();
        System.out.print("Masukkan umur  : ");
        _umur = input.nextInt();
        System.out.print("Golongan darah : ");
        _golDarah = input.nextLine();
        System.out.print("Masukkan NIP   : ");
        _nip = input.nextLine();
        System.out.print("Jabatan anda   : ");
        _jabatan = input.nextLine();

         pegawai1.setNama(_nama);
         pegawai1.setUmur(_umur);
         pegawai1.setGolDarah(_golDarah);
         pegawai1.setNip(_nip);
         pegawai1.setJabatan(_jabatan);
        System.out.println("Nama           : " + pegawai1.getNama());
        System.out.println("Umur           : " + pegawai1.getUmur());
        System.out.println("Golongan darah : " + pegawai1.getGolDarah());
        System.out.println("NIP            : " + pegawai1.getNip());
        System.out.println("Jabatan        : " + pegawai1.getJabatan());
        

    }
}

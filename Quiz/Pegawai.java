package com.tugas;

import java.util.*;

class Pegawai {
    String nama;
    int umur;
    String jabatan;
    int gajiPokok;
    int jamKer;
    double pajak = 0.995;
    double gajiTot;
    int jamUmum = 173;
    int jamLembur, gajiLembur;

    void display(){
        Scanner input = new Scanner(System.in);

        System.out.println("Name        : " + this.nama);
        System.out.println("Umur        : " + this.umur + " tahun");
        System.out.println("Jabatan     : " + this.jabatan);
        System.out.print("Gaji pokok  : Rp ");
        gajiPokok = input.nextInt();
        System.out.print("Jam kerja   : ");
        jamKer = input.nextInt();

        if ( jamKer > 173){
            jamLembur = jamKer - jamUmum;
            System.out.println("Jam lembur  : " + jamLembur + " jam");

            if ( jamLembur > 0 ){
                gajiLembur = 20000 * jamLembur;
                gajiTot = (gajiPokok + gajiLembur) * pajak;
                System.out.println("Gaji lembur : Rp " + gajiLembur);
                System.out.println("Total gaji  : Rp " + gajiTot);
                System.out.println("Total gaji sudah termasuk pajak!");
            }
        }else{
            System.out.println("Anda tidak memiliki jam lembur");
            gajiTot = gajiPokok * pajak;
            System.out.println("Total gaji  : Rp " + gajiTot);
            System.out.println("Total gaji sudah termasuk pajak!");
        }

        System.out.print("\n");

    }

}

package com.latihan;

public class Main {

    public static void main (String[] args){
        Pegawai pegawa1 = new Pegawai("Ucup", "20", "Manager");

        Gaji gaji1 = new Gaji(2899000, 173, 0);

        Pajak pajak1 = new Pajak(0.5);

        pegawa1.equipGaji(gaji1);
        pegawa1.equipPajak(pajak1);
        pegawa1.display();



    }
}

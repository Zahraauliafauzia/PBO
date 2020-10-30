package com.latihan;

class Rata_rata extends Input{
    int jumlah, rata2;

    Rata_rata(int a, int b, int c) {
        super(a, b, c);
    }


    void display(){
        jumlah = this.a + this.b + this.c;
        rata2 = jumlah /3;

        System.out.println("\nNilai A + B + C = " + jumlah);
        System.out.println("Nilai rata-rata = " + rata2);
    }
}

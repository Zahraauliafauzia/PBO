package com.uts;
import java.util.Scanner;
import java.util.Scanner;

class Penjumlahan {
    int bilangan;
    int bil, jumlah;


    void display() {
        Scanner input = new Scanner(System.in);
        int bilangan = 1;

        System.out.println("\nSilahkan menjumlah angka!");

        while (bilangan != 0 && bilangan <10 ) {
            System.out.print("Masukkan Bilangan : ");
            bilangan = input.nextInt();
        }

        jumlah = bilangan + bilangan;
        System.out.println("\nHasil penjumlahan = " + bilangan);

    }
}

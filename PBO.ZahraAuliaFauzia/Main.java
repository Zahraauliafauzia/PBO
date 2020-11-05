package quiz4;

import java.util.Scanner;

public class Main {

    public static void main (String [] args){
        // String nama, umur;
        Scanner input = new Scanner(System.in);
        Fasilitas data = new Fasilitas();

        System.out.println("--------- Selamat Datang di Warnet Connect ---------\n");
        System.out.print("Masukkan nama : ");
        data.nama = input.next();
        System.out.print("Masukkan umur : ");
        data.umur = input.next();


        System.out.println("\nNama = " + data.getNama());
        System.out.println("Umur = " + data.getUmur() + " tahun");

        Fasilitas konsumen1 = new Fasilitas("Connect");
        konsumen1.display();
        konsumen1.hitung();




    }
}

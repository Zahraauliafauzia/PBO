package com.pboreg;
// ini program reference

class Buku{
    String judul;
    String penulis;

    Buku(String judul, String penulis){
        this.judul = judul;
        this.penulis = penulis;
    }

    void display (){
        System.out.println("\nJudul    : " + this.judul);
        System.out.println("Penulis  : " + this.penulis);
    }
}


public class Reference {

    public static void main (String [] args){
        Buku buku1 = new Buku("Harry Potter", "J.K Rowlling");

        buku1.display();

        // menampilkan addres
        String addressBuku1 = Integer.toHexString(System.identityHashCode(buku1));
        System.out.println(addressBuku1);

        // assigment objek
        Buku buku2 = buku1;
        buku2.display();
        String addressBuku2 = Integer.toHexString(System.identityHashCode(buku1));
        System.out.println(addressBuku2);

        // karena buku 1 dan 2 berada pada adress yang sama
        buku1.judul = "Kisah Harry Potter";
        buku1.display();
        buku2.display();

        //kita akan memasukan objek ke dalam method
        fungsi(buku2);
        buku1.display();
        buku2.display();
    }

    public static void fungsi(Buku dataBuku){

        String addressDataBuku = Integer.toHexString(System.identityHashCode(dataBuku));
        System.out.println("address dalam fungsi " + addressDataBuku);
        dataBuku.penulis = "J.K Rolling";
    }
}

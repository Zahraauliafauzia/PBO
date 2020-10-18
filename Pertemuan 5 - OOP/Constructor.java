package com.pboreg;



class Polos{
    String dataString;
    int dataInt;

}

// class Constructor
class Mahasiswa {
    String nama;
    String NIM;
    String jurusan;

    // Ini adalah constructor parameter
    Mahasiswa(String inputNama, String inputNIM, String inputJurusan ){
        nama  = inputNama;
        NIM = inputNIM;
        jurusan = inputJurusan;

        System.out.println(nama);
        System.out.println(NIM);
        System.out.println(jurusan);
        System.out.println();
    }

}


public class Constructor {

    public static void main(String[] args){
        Mahasiswa mahasiswa1 = new Mahasiswa("Ucup", "2019071001", "Informatika");
        Mahasiswa mahasiswa2 = new Mahasiswa("Rara","2019071030", "Informatika");


    }
}

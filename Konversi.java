package com.pboreg;

public class Konversi {

    public static void main(String[] args) {
        // Program untuk konversi data
        int nilaiInt = 256; //32-bit
        System.out.println("Nilai int = " + nilaiInt);

        // Memperluas rentang ke tipe data lebih besar
        long nilaiLongLong = nilaiInt;
        System.out.println("Nilai long = " + nilaiLongLong);

        // Memperkecil rentan ke tipe data lebih kecil
        byte nilaiByte =(byte) nilaiInt; //ketika harus ke tpe lebih kecil harus casting operator dulu,
        System.out.println("Nilai byte = " + nilaiByte);
        System.out.println("Nilai max dari byte = " + Byte.MAX_VALUE);
        System.out.println("Nilai min dari byte = " + Byte.MIN_VALUE);

        /*Memperkecil rentang ke tipe data yang lebih kecil akan menghilangkan
          nilai aslinya. Sedangkan memperbesar rentang ke tipe data yang lebih besar
          nilainya akan tetap sama.
          Seperti di atas 256 lebih dari nilai max byte, maka nilai byte akan kacau.*/

        // Casting Pembagian
        int a = 10;
        float b = 6;
        float c = a/b;

        System.out.println(a + "/ " + b + " = " + c);

        int x = 10;
        int y = 6;
        float z = (float) x/y; //hasilnya akan dikonversi menjadi float

        System.out.println(x + " / " + y + " = " + z);



    }
}

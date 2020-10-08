package com.pboreg;

public class Method_overload {

    static int plusMethodInt (int x, int y){
        return x + y;
    }

    static double plusMethodDouble (double a, double b){
        return a * b;
    }

    static String Method (String x, String y){
        String hasil = x + " " + y;
        return hasil;
    }

    static String Method (String x , int y){
        String hasil = "Nama panggilan " + x + ", umur " + y + " tahun";
        return hasil;
    }


    public static void main (String[] args){
        int myNum1 = plusMethodInt(5, 16);
        double myNum2 = plusMethodDouble(7, 7.7);  // Misal salah satunya dimasukkan tipe int,
        // maka akan dikonvert jadi (.0) ex : 8.0

        System.out.println("int    = " + myNum1);
        System.out.println("double = " + myNum2);
        System.out.println();

        String nilai = Method("Zahra", "Aulia");
        String nilai1 = Method("Rara", 18);
        System.out.println("Nama       : " + nilai);
        System.out.println("Keterangan : " + nilai1);
    }
}



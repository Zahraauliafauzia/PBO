package com.pboreg;

public class Recursion {

    public static void main (String[] args) {

        int result = sum(10);
        System.out.println(result);
    }
    public static int sum(int k){
        if (k > 0){
            return k + sum (k-1);     // Dia memanggil dirinya sendiri
        }else {
            return 0;
        }
    }
}

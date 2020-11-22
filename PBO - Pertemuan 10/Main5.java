package com.pboreg;
import java.util.Arrays;
public class Main5 {

    public static void main (String [] args){
        int[] arrAngka = {11,12,13,14,15,16,17,18,19,20};
        System.out.println(Arrays.toString(arrAngka));

        //Looping standar
        System.out.println("\nIni looping standar");
        for(int a=0; a<10 ; a++){
            System.out.println("Nilai ke - " + (a+1) + " Adalah = " + arrAngka[a] );
        }

        //looping
        System.out.println("\nIni looping dengan properti length");
        for(int a = 0; a<arrAngka.length; a++){
            System.out.println("Index ke-"  + a + "adalah = " +  arrAngka[a]);
        }

        //Looping dengan for each
        System.out.println("\nIni looping dengan for each");
        for(int angka : arrAngka){
            System.out.println("nilai looping ini =  " + angka );
        }


        int[] array1 = {1,2,3,4,5,};
        int[] array2 = new int[5];

        System.out.println("\n");
        System.out.println(array1);  // saat di sini lokasi memorinya berbedaa
        System.out.println(array2);

        array1 = array2;
        System.out.println("\nArray 1 -> " + Arrays.toString(array1));
        System.out.println("Array 2 -> " + Arrays.toString(array2));

        array1[0] = 100;
        array2[4] = 400;
        System.out.println("\nArray 1 -> " + Arrays.toString(array1));
        System.out.println("Array 2 -> " + Arrays.toString(array2));

        /* Method yang argumennya adalah reference, pass by reference
           Bukan pass by value
         */


    }
}

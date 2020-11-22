package com.pboreg;
import java.util.Arrays;
public class Main6 {

    public static void main(String[] args) {

        int[] arrays1 = {1,2,3,4,5};

        //merubah array menjadi string
        System.out.println("\nMerubah array menjadi String\n===============================");
        printArray(arrays1);

        //Mengkopi array
        System.out.println("\nMengkopi array\n===============================");
        int[] arrays2 = new int[5];
        printArray(arrays1);
        printArray(arrays2);

        System.out.println("\nMengkopi dengan loop\n=================================");
        for(int i = 0; i<arrays1.length; i++){
            arrays2[i] = arrays1[i];
        }
        printArray(arrays1);
        System.out.println(arrays1);  // Addres array 1 beda dengan array 2
        printArray(arrays2);
        System.out.println(arrays2);

        System.out.println("\nMengkopi dengan coptOf\n=================================");
        int[] arrays3 = Arrays.copyOf(arrays1, 4);
        printArray(arrays1);  //Addresnya juga beda
        printArray(arrays3);

        System.out.println("\nMengkopi dengan copyOfRange\n-------------------------------");
        int[] arrays4 = Arrays.copyOfRange(arrays1,2,4); // dihitung dengan indexnya
        printArray(arrays1);  //Addresnya juga beda
        printArray(arrays4);

        //fill array
        System.out.println("\nFill array\n-------------------------------");
        int[] arrays5 = new int[100];
        printArray(arrays5);
        Arrays.fill(arrays5,1);
        printArray(arrays5);

        // Komparasi Array
        System.out.println("\nKomparasi Array\n---------------------------------");
        int[] arrays6 = {1,2,3,4,5};
        int[] arrays7 = {1,2,3,9,5};

        System.out.println("\nmembandingkan dua buah array");
        System.out.println(Arrays.equals(arrays6,arrays7));

        if(Arrays.equals(arrays6,arrays7)){
            System.out.println("Array ini sama!");
        }else {
            System.out.println("Array ini beda!");
        }
        System.out.println("\nNgecek mana array yang lebih besar");
        System.out.println(Arrays.compare(arrays6,arrays7));

        System.out.println("\nNgecek mana index yang berbeda");
        System.out.println("Index yang berbeda adalah index ke " + Arrays.mismatch(arrays6,arrays7));

        //Sorting array
        System.out.println("\nSorting array\n=================================");
        int[] arrays8 = {1,6,4,5,3,5,2,6};
        printArray(arrays8);
        Arrays.sort(arrays8);
        printArray(arrays8);

        // search array
        System.out.println("\nSearch array\n====================================");
        int angka = 3;
        int posisi = Arrays.binarySearch(arrays8, angka);
        System.out.println("angka " + angka + " ada di index ke " + posisi);
    }


    private static void printArray(int [] dataArrays){
        System.out.println("Array = " + Arrays.toString(dataArrays));
    }
}

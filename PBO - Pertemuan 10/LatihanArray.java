package com.pboreg;
import java.util.Arrays;

public class LatihanArray {

    public static void main(String[] args) {

        int[] array1 = {1,2,3,4,12,54,8,60,700,11};
        int[] array2 = {0,4,3,2,1,5,9,8,7,4};
        printArray(array1,"Array angka");

        int[] arrayHasil = tambahArray(array1,array2);
        System.out.println("\nPenjumlahan dua buah array\n====================================");
        printArray(array1,"array 1 ");
        printArray(array2,"array 2 ");
        printArray(arrayHasil,"hasil   ");

        //Menggabungkan dua buah Array
        int[] arrayHasil2 = new int[array1.length + array2.length];

       for (int i=0; i < array1.length; i++){
            arrayHasil2[i] = array1[i];
        }
        for (int i=0;i < array2.length; i++){
            arrayHasil2[i + array1.length] = array2[i];
        }
        System.out.println("\nMenggabungkan dua buah array\n=============================");
        printArray(array1,"array 1 ");
        printArray(array2,"array 2 ");
        printArray(arrayHasil2,"hasil 2 ");

        // Sorting reverse, mengurutkan tapi kebalik
        System.out.println("\nSorting Array tetapi tebalik\n================================");
        printArray(array1, "array 1   ");
        reversed(array1);
        printArray(array1,"reversed 1");

        printArray(array2, "array 2   ");
        reversed2(array2);
        printArray(array2,"reversed 2");

    }

    private static void reversed2 (int[] dataArray){
        Arrays.sort(dataArray);
        int buffer;

        for (int i=0; i < dataArray.length/2 ; i++){
            buffer = dataArray[i];
            dataArray[i] = dataArray[(dataArray.length - 1) - i]; // Array yang didepan = array belakang(mirror)
            dataArray[(dataArray.length - 1) - i] = buffer; // Array yang di belakang = array didepan (jadi keswitch)

        }
    }

    private static void reversed (int[] dataArray){
        Arrays.sort(dataArray);
        int[] arrReverse = Arrays.copyOf(dataArray,dataArray.length);

        for (int i=0; i < dataArray.length; i++){
            dataArray[i] = arrReverse[(arrReverse.length - 1) - i];
        }

    }

    private static int[] tambahArray (int[] arrayInt1, int[] arrayInt2){
        //Menjumlahkan dua buah array
        int[] arrayHasil = new int[arrayInt1.length];
        for (int i = 0; i < arrayInt1.length; i++){
            arrayHasil[i] = arrayInt1[i] + arrayInt2[i];
        }
        return arrayHasil;

    }

    private static void printArray(int[] dataArray, String message){
        System.out.println(message + " = " + Arrays.toString(dataArray));
    }
}

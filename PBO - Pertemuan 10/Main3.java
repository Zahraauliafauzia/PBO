package com.pboreg; //Array
import java.util.Arrays;
import java.util.Scanner;

class Array{
    private int [] angka;

    public Array(int jmlData){

        angka = new int[jmlData];
    }


    public void setAngka(){
        Scanner input = new Scanner(System.in);

        System.out.println("Input data");
        for(int i = 0; i < this.angka.length; i++){
            System.out.print("Nilai " + (i+1) + " = ");
            this.angka[i] = input.nextInt();
        }
    }

    public void searchArr(){
        Scanner inputs = new Scanner(System.in);

        Arrays.sort(angka);
        printArray(angka);
        boolean run = true;
        boolean dataArr = false;
        String jawab;
        int counter = 0;
        Scanner scan = new Scanner(System.in);

        while( run ) {
            System.out.println("\nApakah anda ingin mencari data ?");
            System.out.print("[ya/tidak] :  ");

            jawab = scan.nextLine();

            // cek jawabnnya, kalau ya maka berhenti mengulang
            if( jawab.equalsIgnoreCase("tidak") ){

                run = false;

            }else {
                System.out.print("\nMasukkan data yang ingin dicari : ");
                int cari = inputs.nextInt();

                for (int i=0;i<angka.length;i++){
                    if (angka[i]==cari){
                        dataArr = true;
                        System.out.println("Data ada di dalam Array");
                        int posisi = Arrays.binarySearch(angka, cari);
                        System.out.println("Data " + cari + " ada dalam array dan ada di index ke " + posisi);

                        break;
                    }
                }
            }

            counter++;
        }

        System.out.println("\nAnda sudah mencari data sebanyak " + (counter-1) + " kali!" +
                "\nTerima kasih.");



    }
    public void display(){       //Perulangan dengan for
        System.out.print("\n------------------------------------");
        System.out.println("\nBilangan Array :");

        for(int i=0; i < this.angka.length; i++){
            System.out.print(this.angka[i] + " ");
        }
        System.out.println("\n------------------------------------");
    }

    private void printArray(int[] angka) {

    }



}

public class Main3 {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah bilangan : ");
        int jmlBil = input.nextInt();
        Array arrA = new Array(jmlBil);
        arrA.setAngka();
        arrA.display();
        arrA.searchArr();
    }
}

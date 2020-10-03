package com.pboreg;

public class Looping_bersarang {

    public static void main (String[] args){

        for (int a = 0; a <5 ; a++){
            for (int i = 1; i<=6 ; i++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
        System.out.println();

        for (int a = 0; a <5 ; a++) {
            for (int i = 0; i <= 6; i++) {
                System.out.print("* ");
                if (a == i){
                    break;
                }
            }
            System.out.print("\n");
        }
        System.out.println();

        for (int a = 0; a <5 ; a++){
            for (int i = 1; i<=6 ; i++){
                System.out.print("* ");
                if ((a + i)==5)
                    break;
            }
            System.out.print("\n");
        }
        System.out.print("\n");

        for (int a = 0; a <9; a++){
            for (int i = 0; i<9; i++){
                System.out.print("* ");
                if ((a == i)){
                    break;
                } else if ((a + i)==8){
                    break;
                }
            }
            System.out.print("\n");
        }
        System.out.println();


    }
}



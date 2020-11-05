package com.uts;

import java.util.Scanner;

public class Bmi {

    String nama, umur;
    double beratBadan;
    float tinggiBadan;
    float bmi;

    void hitungBmi(){
        bmi = (float) (beratBadan/ (tinggiBadan * tinggiBadan));

        System.out.println("\nBMI : " + bmi);
        if (bmi >= 18.5 && bmi <= 22.9){
            System.out.println("(Status BMI kamu NORMAL)");
        }if (bmi < 18.5){
            System.out.println("(Status BMI kamu UNDERWEIGHT)");
        }if(bmi > 22.9){
            System.out.println("(Status BMI kamu OVERWEIGHT)");
        }


    }

    void display(){
        Scanner input = new Scanner(System.in);

        System.out.println("\n======== Mengukur BMI =========");
        System.out.print("Masukkan nama : ");
        nama = input.next();
        System.out.print("Masukkan umur : ");
        umur = input.next();
        System.out.print("Masukkan berat badan (Kg) : ");
        beratBadan= input.nextDouble();
        System.out.print("Masukkan tinggi badan (M): ");
        tinggiBadan= input.nextFloat();
    }





}

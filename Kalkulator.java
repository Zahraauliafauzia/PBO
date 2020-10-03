package com.pboreg;
import java.util.*;
public class Kalkulator {

    // MEMBUAT KALKULATOR SEDERHANA

    public static void main (String[] args){

        // a operator b
        Scanner inpurUser;
        float a,b,r,j,hasil;
        char operator;

        inpurUser = new Scanner(System.in);
        System.out.println("======== Kalkulator  If Else ver.========");
        System.out.println();

        System.out.print("Masukkan nilai a = ");
        a = inpurUser.nextFloat();
        System.out.print("operator         = ");
        operator = inpurUser.next().charAt(0);
        System.out.print("Masukkan nilai b = ");
        b = inpurUser.nextFloat();
        System.out.println();

        System.out.println("Input user = " + a + " " + operator + " " + b);

        // operator yang tersedia +, -, *, /

        if (operator == '+'){
            hasil = a + b;
            System.out.println("Hasil      = " + hasil);
        } else if (operator == '-'){
            hasil = a - b;
            System.out.println("Hasil      = " + hasil);
        } else if (operator == '*'){
            hasil = a * b;
            System.out.println("Hasil      = " + hasil);
        } else if (operator == '/' ){
            if (b == 0){
                System.out.println("Pembagian nol akan menghasilkan nilai tak hingga");
            }else {
                hasil = a / b;
                System.out.println("Hasil  = " + hasil);
            }
        } else {
            System.out.println("Operator tidak tersedia!"); }


        System.out.println();
        System.out.println();
        System.out.println("====== Kalkulator Switch case ver. ======");
        System.out.println();

        System.out.print("Masukkan nilai r       = ");
        r = inpurUser.nextFloat();
        System.out.print("Operator yang anda mau = ");
        operator = inpurUser.next().charAt(0);
        System.out.print("Masukkan nilai j       = ");
        j = inpurUser.nextFloat();
        System.out.println();

        // untuk operatornya
        switch (operator){
            case '+':
                hasil = r + j;
                System.out.println("Hasil = " + hasil);
                break;
            case '-':
                hasil = r - j;
                System.out.println("Hasil = " + hasil);
                break;
            case '*':
                hasil = r * j;
                System.out.println("Hasil = " + hasil);
                break;
            case '/':
                hasil = r / j;
                System.out.println("Hasil = " + hasil);
                break;
            default:
                System.out.println("Operator tidak ditemukan!");
        }
    }
}

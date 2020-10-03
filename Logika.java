package com.pboreg;

public class Logika {

    public static void main(String[] args){

        /* Operator logika --> operasi yang dilakukan dengan tipe data boolean
           AND, OR, XOR, negasi */

        boolean a,b,c;

        // OR (||)
        System.out.println("===== OR =====");
        a = false;
        b = false;
        c = a || b;
        System.out.println(a + " || " + b + " = " + c);
        a = false;
        b = true;
        c = a || b;
        System.out.println(a + " || " + b + "  = " + c);
        a = true;
        b = false;
        c = a || b;
        System.out.println(a + "  || " + b + " = " + c);
        a = true;
        b = true;
        c = a || b;
        System.out.println(a + "  || " + b + "  = " + c);

        // AND (&&)
        System.out.println();
        System.out.println("===== AND =====");
        a = false;
        b = false;
        c = a && b;
        System.out.println(a + " && " + b + " = " + c);
        a = false;
        b = true;
        c = a && b;
        System.out.println(a + " && " + b + "  = " + c);
        a = true;
        b = false;
        c = a && b;
        System.out.println(a + "  && " + b + " = " + c);
        a = true;
        b = true;
        c = a && b;
        System.out.println(a + "  && " + b + "  = " + c);

        // XOR [eksklusif OR] (^)
        System.out.println();
        System.out.println("===== XOR =====");
        a = false;
        b = false;
        c = a ^ b;
        System.out.println(a + " ^ " + b + " = " + c);
        a = false;
        b = true;
        c = a ^ b;
        System.out.println(a + " ^ " + b + "  = " + c);
        a = true;
        b = false;
        c = a ^ b;
        System.out.println(a + "  ^ " + b + " = " + c);
        a = true;
        b = true;
        c = a ^ b;
        System.out.println(a + "  ^ " + b + "  = " + c);

        // Negasi [ Penukaran nilai ] (!)
        System.out.println();
        System.out.println("===== NEGASI =====");
        a = true;
        c = !a;
        System.out.println(a + "  ! --> " + c);
        a = false;
        c = !a;
        System.out.println(a + " ! --> " + c);
    }
}

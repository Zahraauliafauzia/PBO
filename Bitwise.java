package com.pboreg;

public class Bitwise {

    public static void main(String[] args){

        /* Operator Bitwise
           --> operator untuk melakukan operasi pada nilai bit */

        byte a = 3;
        byte b,c;
        String a_bits, b_bits, c_bits;

        // Operator SHIFT LEFT
        System.out.println("===== SHIFT LEFT =====");
        a_bits = String.format("%8s",Integer.toBinaryString(a)).replace(' ', '0');
        System.out.printf("%s = %d\n", a_bits,a);

        b = (byte)(a << 2);
        b_bits = String.format("%8s",Integer.toBinaryString(b)).replace(' ', '0');
        System.out.println(b_bits + " = " + b);

        // Operator SHIFT RIGHT
        System.out.println();
        System.out.println("===== SHIFT RIGHT =====");
        a = 24;
        a_bits = String.format("%8s",Integer.toBinaryString(a)).replace(' ', '0');
        System.out.printf("%s = %d\n", a_bits,a);

        b = (byte)(a >> 2);
        b_bits = String.format("%8s",Integer.toBinaryString(b)).replace(' ', '0');
        System.out.println(b_bits + " = " + b);

        // Operator bitwise OR
        System.out.println();
        System.out.println("===== BITWISE OR (|)=====");
        a = 24;
        a_bits = String.format("%8s",Integer.toBinaryString(a)).replace(' ', '0');
        System.out.printf("%s = %d\n", a_bits,a);

        b = 12;
        b_bits = String.format("%8s",Integer.toBinaryString(b)).replace(' ', '0');
        System.out.println(b_bits + " = " + b);

        System.out.println("----------------------hasil OR");
        c = (byte)(a | b);
        c_bits = String.format("%8s",Integer.toBinaryString(c)).replace(' ', '0');
        System.out.println(c_bits + " = " + c);

        // Operator bitwise AND
        System.out.println();
        System.out.println("===== BITWISE AND (&)=====");
        a = 24;
        a_bits = String.format("%8s",Integer.toBinaryString(a)).replace(' ', '0');
        System.out.printf("%s = %d\n", a_bits,a);

        b = 12;
        b_bits = String.format("%8s",Integer.toBinaryString(b)).replace(' ', '0');
        System.out.println(b_bits + " = " + b);

        System.out.println("----------------------hasil AND");
        c = (byte)(a & b);
        c_bits = String.format("%8s",Integer.toBinaryString(c)).replace(' ', '0');
        System.out.println(c_bits + " = " + c);

        // Operator bitwise XOR
        System.out.println();
        System.out.println("===== BITWISE XOR (^)=====");
        a = 24;
        a_bits = String.format("%8s",Integer.toBinaryString(a)).replace(' ', '0');
        System.out.printf("%s = %d\n", a_bits,a);

        b = 12;
        b_bits = String.format("%8s",Integer.toBinaryString(b)).replace(' ', '0');
        System.out.println(b_bits + " = " + b);

        System.out.println("----------------------hasil XOR");
        c = (byte)(a ^ b);
        c_bits = String.format("%8s",Integer.toBinaryString(c)).replace(' ', '0');
        System.out.println(c_bits + " = " + c);

        // Operator bitwise Negasi atau Not
        System.out.println();
        System.out.println("===== BITWISE NEGASI (~) =====");
        a = 24;
        b = (byte)~a;
        a_bits = String.format("%8s",Integer.toBinaryString(a)).replace(' ', '0');
        System.out.printf("%s = %d\n", a_bits,a);
        b_bits = String.format("%8s",Integer.toBinaryString(b).substring(24));
        System.out.println(b_bits + " = " + b);

    }
}

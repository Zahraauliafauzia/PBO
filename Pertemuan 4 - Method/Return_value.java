package com.pboreg;

public class Return_value {

    static int myVar(int x, int y) {
        return x + y;
    }
    static int myVar1(int a){
        return 5 + a;
    }

    public static void main(String[] args) {

        System.out.println(myVar(7, 9));
        System.out.println(7);
    }
}

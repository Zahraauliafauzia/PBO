package com.pboreg;

public class Method_with_if_else {

    static void checkAge(int ages){
        if (ages<18){
            System.out.println("Access denied  - You are not old enought");
        }else {
            System.out.println("Access granted - You are old enough!");
        }
    }

    public static void main(String[] args){
        checkAge(23);
    }
}

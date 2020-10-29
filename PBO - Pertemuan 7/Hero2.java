package com.pbo;

public class Hero2 {
    String name;
    double defPower;

    // ini contructor
    Hero2(String name, double defPower){
        this.name = name;
        this.defPower = defPower;
    }

    Hero2(String name){
        this.name = name;
    }

    void display(){
        System.out.println("Name          : " + this.name);
        System.out.println("Defence power : " + this.defPower);
        System.out.println();
    }
}

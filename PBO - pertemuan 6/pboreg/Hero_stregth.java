package com.pboreg;

class HeroStregth extends Hero{
    double defencePower;

    // overiding methods
    void display(){
        System.out.println("\nName          : " + this.name);
        System.out.println("Nomor ID      : " + this.id);
        System.out.println("Defence Power : " + this.defencePower);
    }


}
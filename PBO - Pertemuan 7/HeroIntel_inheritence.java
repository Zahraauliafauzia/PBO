package com.pboreg;

class HeroIntel extends Hero {
    double attackPower;

    // overiding methods
    void display(){
        System.out.println("\nName          : " + this.name);
        System.out.println("Attack Power  : " + this.attackPower + " hp");
    }
}

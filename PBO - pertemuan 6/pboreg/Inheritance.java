package com.pboreg;

// ini super class


// ini sub class


// ini sub class

public class Inheritance {

    public static void main (String[] args){
        Hero hero1 = new Hero();
        hero1.name = "Rara";
        hero1.id = "1234";
        hero1.display();

        HeroStregth hero2 = new HeroStregth();
        hero2.name = "Otong";
        hero2.defencePower = 100;
        hero2.id = "0001";
        hero2.display();

        HeroIntel hero3 = new HeroIntel();
        hero3.name = "Ucup";
        hero3.attackPower = 50;
        hero3.display();




    }
}

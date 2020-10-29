package com.pbo;

public class Main2 {

    public static  void main (String [] args){
        Hero2 hero1 = new Hero2("Saitama", 50);
        hero1.display();                             // ini memakai contructor superclass

        Hero2 hero2 = new Hero2("Rara", 77);
        hero2.display();                            // ini memakai constructor

        Hero2 hero3 = new Hero2("Among");
        hero3.display();
    }
}

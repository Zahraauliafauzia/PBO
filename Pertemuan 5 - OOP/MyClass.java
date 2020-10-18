package com.pboreg;

class MyClass {
    //Atribute
    public int x  = 5; //atribut ini boleh diakses scr lngsung dri luar Myclass
    int y  = 15;       //atribut ini boleh diakses scr lngsung dri luar Myclass dalam 1 package
    private int z = 7; //atribut ini tdk boleh diakses scr lngsung dri luar Myclass

    //method
    public int tampilkanz(){
        return this.z;
    }

    //classs : Bilangan
    //diakses secara private lalu buat public methodnya agar bisa diakses
}

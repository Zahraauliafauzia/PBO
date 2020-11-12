package com.pboreg;

//interface
interface Mamalia  {

    //interface method
    public void habitat();
    public void tidur();
}
interface MakhlukHidup {
    public void bernafas();
    public void bernama();
}

class Hewan1 implements Mamalia, MakhlukHidup {
    @Override
    public void habitat() {
        System.out.println("Tempat tinggal di Air");
    }

    @Override
    public void tidur() {
        System.out.println("Bisa tidur Zzz ...");
    }

    @Override
    public void bernafas() {
        System.out.println("Bernafas dengan Paru-paru");
    }

    @Override
    public void bernama() {
        System.out.println("Lumba-lumba");
    }
}

public class Main2 {
    public static void main (String [] args){
        Hewan1 lumba2 = new Hewan1();
        lumba2.bernama();
        lumba2.bernafas();
        lumba2.habitat();
        lumba2.tidur();
    }
}

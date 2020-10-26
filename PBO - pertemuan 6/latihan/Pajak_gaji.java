package com.latihan;

class Pajak {
    double pajakGaji;

    Pajak(double pajakGaji){
        this.pajakGaji = pajakGaji;
    }

    void display(){
        System.out.println("Pajak kerja : " + this.pajakGaji + " %");
    }
}

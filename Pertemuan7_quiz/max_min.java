package com.latihan;

class max_min extends Input {
    max_min(int a, int b, int c) {
        super(a, b, c);
    }

    private double bilMax() {
        double maks = -9999;
        if (this.a > maks) {
            maks = this.a;
        }
        if (this.b > maks) {
            maks = this.b;
        }
        if (this.c > maks){
            maks = this.c;
        }
        return maks;
    }
    private double bilMin() {
        double min = 9999;
        if (this.a < min) {
            min = this.a;
        }
        if (this.b < min) {
            min = this.b;
        }
        if (this.c < min){
            min = this.c;
        }
        return min;
    }


    public void display() {
        System.out.println("\nNilai Max       = " + this.bilMax());
        System.out.println("Nilai Min       = " + this.bilMin());
    }


}
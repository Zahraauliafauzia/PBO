package com.latihan;

import java.util.*;

public class Tampil_1 {

    public static void main (String [] args){

        Input input1 = new Input(100, 200, 300);
        input1.display();

        Input input2 = new Rata_rata(100, 200, 300);
        input2.display();

        Input input3 = new max_min(100, 200, 300);
        input3.display();

    }
}

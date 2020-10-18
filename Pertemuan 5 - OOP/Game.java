package com.pboreg;

public class Game {

    public static void main(String[] args){

        // membuat objek player
        Player petani = new Player();

        // mengisi atribut player
        petani.name = "Zahra Aulia";
        petani.speed = 78;
        petani.healthPoin = 0;

        // menjalankan method
        petani.run();

        if(petani.isDead()){
            System.out.println("Game Over!");
        }

    }
}

package com.terminal;

public class Player {
    private String name;
    private static int jumalahPlayer;

    // overloading constructor
    // Opsi 1
    Player(String name){
        Player.jumalahPlayer++;
        this.name = name;
    }
    Player(){
        Player.jumalahPlayer++;
        this.name = "player " + Player.jumalahPlayer;
    }

    void show(){
        System.out.println("Name : " + this.name);
    }
}

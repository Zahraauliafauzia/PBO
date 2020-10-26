package com.pboreg;

import com.terminal.Console;

/// Visibility default
class Player {
    private String name;

    Player(String name){
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    void show (){
        //System.out.println("Player Name : " + this.name);
        Console.log("Menggunakan Console");
        Console.log("Player name : " + this.name);
    }
}

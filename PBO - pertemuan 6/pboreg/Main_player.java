package com.pboreg;

// ini akan mengimport class console
import com.terminal.Console;

// import static method dari console
import static com.terminal.Console.log;

class Main_player {

    public static void main(String[] args){
        Player player1 = new Player("Rara");
        player1.show();

        Console.log("Menampilkan data dengan console.log");
        Console.log(player1.getName());

        log("Menampilkan data dengan log saja");
        log(player1.getName());
    }
}

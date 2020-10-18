package com.pboreg;

// Ini adalah proram permainan game , dari video latohan oop 1 dan 2

// Player
class Players {

    String name;
    double health;
    int level;
    // objek player
    Weapon weapon;
    Armor armor;

    Players(String name, double health){
        this.name = name;
        this.health = health;
    }

    void attack(Players opponent){
        double attackPower = this.weapon.attackPower;
        System.out.println(this.name + " attacking " + opponent.name + " with power " + attackPower);
        opponent.defence(weapon.attackPower);
    }

    void defence(double attackPower){

        // akan mengambil damage
        double damage;
        if (this.armor.defencePower < attackPower){
            damage = attackPower - this.armor.defencePower;
        }else {
            damage = 0;
        }

        this.health -= damage;
        System.out.println(this.name + " gets damage "+ damage);
    }

    void equipWeapon(Weapon weapon){
        this.weapon = weapon;
    }

    void equipArmor(Armor armor){
        this.armor = armor;
    }

    void display(){
        System.out.println("\nName     : " + this.name );
        System.out.println("Health   : " + this.health + " hp ");
        this.weapon.display();
        this.armor.display();


    }
}

// Senjata
class Weapon{
    double attackPower;
    String name;

    Weapon(String name, double attackPower){
        this.name = name;
        this.attackPower = attackPower;
    }

    void display(){
        System.out.println("Weapon   : " + this.name + " , Attack  : " + this.attackPower);
    }
}

// Armor
class Armor{
    double defencePower;
    String name;

    Armor(String name, double defencePower){
        this.name = name;
        this.defencePower = defencePower;
    }

    void display(){
        System.out.println("Armor    : " + this.name + " , Defence  : " + this.defencePower);
    }
}

public class Latihan_oop1 {

    public static void main (String [] args){

        // membuat objeek player
        Players players1 = new Players("Rara", 100);
        Players players2 = new Players("Putra", 50);

        // membuat objek weapon
        Weapon pedang = new Weapon("pedang", 15);
        Weapon ketapel = new Weapon("ketapel", 2);

        // membuat objek armor
        Armor bajuBesi = new Armor("Baju besi",10);
        Armor kaos = new Armor("Kaos", 5);

        // Player 1
        players1.equipWeapon(pedang);
        players1.equipArmor(bajuBesi);
        players1.display();

        // Player 2
        players2.equipWeapon(ketapel);
        players2.equipArmor(kaos);
        players2.display();

        System.out.println("\nPERTEMURAN !!!");
        System.out.println("\n------ Episode = 1 -----\n");
        players1.attack(players2);
        players1.display();
        players2.display();
        System.out.println("\n-----Episode = 2 -----\n");
        players2.attack(players1);
        players1.display();
        players2.display();
    }
}

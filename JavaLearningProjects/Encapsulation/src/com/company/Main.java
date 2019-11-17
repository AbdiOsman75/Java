package com.company;

public class Main {

    public static void main(String[] args) {
//        Player player = new Player();
//        player.name="Bob";
//        player.health=100;
//        player.weapon = "Sword";
//
//        int damage = 50;
//
//        player.loseHealth(damage);
//        System.out.println("Remaining health = "+player.healthRemaining());
//
//        damage = 51;
//        player.loseHealth(damage);
//        System.out.println("Remaining health = "+player.healthRemaining());

        EnhancedPlayer player = new EnhancedPlayer("Bob",100,"Sword");
        System.out.println("Initial health is "+player.getHealth());
    }
}

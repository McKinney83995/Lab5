package org.example;

public class App {
    public static void main(String[] args) {
        MonopolyCircularList<String> player1 = new MonopolyCircularList<>(), player2 = new MonopolyCircularList<>();

        System.out.println("\nWelcome to Monopoly!\n");

        System.out.println("Its Player 1's turn!");
        player1.takeATurn();

        System.out.println("Its Player 2's turn!");
        player2.takeATurn();


    }

}
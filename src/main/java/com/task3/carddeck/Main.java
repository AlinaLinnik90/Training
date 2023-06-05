package com.task3.carddeck;

public class Main {

    public static void main(String[] args) {
        Deck deck = new Deck();
        System.out.println(deck.size());

        deck.shuffle();

        deck.order();
        deck.print();


    }

}

package com.ryanwoolf.fivecarddraw.cardgame;

import java.util.Arrays;
import java.util.List;

public class Card {

    public static final List<String> SUITS = Arrays.asList("♣", "♦", "♥", "♠");
    public static final List<String> RANKS = Arrays.asList("2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A");

    public String getRank() {
        return rank;
    }

    public String getSuit() {
        return suit;
    }

    private String rank;
    private String suit;

    public Card(String rank, String suit) {
        this.rank = rank;
        this.suit = suit;
    }

    @Override
    public String toString() {
        return rank + suit;
    }

}

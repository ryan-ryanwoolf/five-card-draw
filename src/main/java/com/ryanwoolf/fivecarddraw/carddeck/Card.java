package com.ryanwoolf.fivecarddraw.carddeck;

import com.ryanwoolf.fivecarddraw.enums.Ranks;
import com.ryanwoolf.fivecarddraw.enums.Suits;

public class Card {
    private final Suits suit;
    private final Ranks rank;

    public Card(Ranks rank, Suits suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public Ranks getRank() {
        return rank;
    }

    public Suits getSuit() {
        return suit;
    }

    @Override
    public String toString() {
        return rank.getSymbol() + suit.getSymbol();
    }

}

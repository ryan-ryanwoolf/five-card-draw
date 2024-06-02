package com.ryanwoolf.fivecarddraw.carddeck;

import com.ryanwoolf.fivecarddraw.enums.Ranks;
import com.ryanwoolf.fivecarddraw.enums.Suits;

import java.util.*;

public abstract class AbstractDeck {

    private final ArrayList<Card> deckCards = new ArrayList<>();

    public AbstractDeck(){
        populateDeck();
    }

    //populateDeck -
    public void populateDeck(){
        for (Suits suit : Suits.values()) {
            for (Ranks rank : Ranks.values()) {
                deckCards.add(new Card(rank, suit));
            }
        }
    }

    public ArrayList<Card> getDeckCards() {
        return deckCards;
    }

    public abstract void shuffle();

}

package com.ryanwoolf.fivecarddraw.cardgame;

import com.ryanwoolf.fivecarddraw.enums.Ranks;
import com.ryanwoolf.fivecarddraw.enums.Suits;

import java.util.*;

public abstract class AbstractDeck {

    public ArrayList<Card> deckCards = new ArrayList<>();

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

    public abstract void shuffle();

}

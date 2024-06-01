package com.ryanwoolf.fivecarddraw.cardgame;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionShuffleDeck extends AbstractDeck {

    public void shuffle(){
        System.out.println("Shuffling... Shuffling... Shuffling...");
        Collections.shuffle(deckCards);
    }

}

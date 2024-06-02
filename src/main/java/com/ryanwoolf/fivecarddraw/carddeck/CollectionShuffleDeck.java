package com.ryanwoolf.fivecarddraw.carddeck;

import java.util.Collections;

public class CollectionShuffleDeck extends AbstractDeck {

    public void shuffle(){
        System.out.println("Shuffling... Shuffling... Shuffling...");
        Collections.shuffle(getDeckCards());
    }

}

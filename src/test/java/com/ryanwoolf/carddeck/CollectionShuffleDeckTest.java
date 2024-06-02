package com.ryanwoolf.carddeck;

import com.ryanwoolf.fivecarddraw.carddeck.Card;
import com.ryanwoolf.fivecarddraw.carddeck.CollectionShuffleDeck;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

public class CollectionShuffleDeckTest {

    @Test
    public void testGenericDeckHas52UniqueCards() {

        CollectionShuffleDeck deck = new CollectionShuffleDeck();
        Set<Card> uniqueCards = new HashSet<>(deck.getDeckCards());
        assert(uniqueCards.size()==52);
    }

    @Test
    public void testGenericDeckHas52UniqueCardsAfterShuffling() {

        CollectionShuffleDeck deck = new CollectionShuffleDeck();
        deck.shuffle();
        Set<Card> uniqueCards = new HashSet<>(deck.getDeckCards());
        assert(uniqueCards.size()==52);
    }
}

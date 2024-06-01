package com.ryanwoolf.cardgame;

import com.ryanwoolf.fivecarddraw.cardgame.Card;
import com.ryanwoolf.fivecarddraw.cardgame.CollectionShuffleDeck;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

public class CollectionShuffleDeckTest {

    @Test
    public void testGenericDeckHas52UniqueCards() {

        CollectionShuffleDeck deck = new CollectionShuffleDeck();
        Set<Card> uniqueCards = new HashSet<>(deck.deckCards);
        assert(uniqueCards.size()==52);
    }

    @Test
    public void testGenericDeckHas52UniqueCardsAfterShuffling() {

        CollectionShuffleDeck deck = new CollectionShuffleDeck();
        deck.shuffle();
        Set<Card> uniqueCards = new HashSet<>(deck.deckCards);
        assert(uniqueCards.size()==52);
    }
}

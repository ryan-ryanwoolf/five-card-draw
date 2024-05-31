package com.ryanwoolf.cardgame;

import com.ryanwoolf.fivecarddraw.cardgame.Card;
import com.ryanwoolf.fivecarddraw.cardgame.GenericDeck;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

public class GenericDeckTest {

    @Test
    public void testGenericDeckHas52UniqueCards() {

        GenericDeck deck = new GenericDeck(Card.SUITS,Card.RANKS);
        Set<Card> uniqueCards = new HashSet<>(deck.deckCards);
        assert(uniqueCards.size()==52);
    }

    @Test
    public void testGenericDeckHas52UniqueCardsAfterShuffling() {

        GenericDeck deck = new GenericDeck(Card.SUITS,Card.RANKS);
        deck.shuffle();
        Set<Card> uniqueCards = new HashSet<>(deck.deckCards);
        assert(uniqueCards.size()==52);
    }
}

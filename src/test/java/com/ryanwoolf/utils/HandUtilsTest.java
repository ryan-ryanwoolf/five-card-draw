package com.ryanwoolf.utils;

import com.ryanwoolf.fivecarddraw.carddeck.Card;
import com.ryanwoolf.fivecarddraw.carddeck.CollectionShuffleDeck;
import com.ryanwoolf.fivecarddraw.utils.HandUtils;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class HandUtilsTest {

    ArrayList<Card> cardsDealt = new ArrayList<Card>();
    CollectionShuffleDeck deck;
    @BeforeEach
    public void setUp() {
        this.deck = new CollectionShuffleDeck();
        this.deck.shuffle();
    }

    @Test
    public void testDealCards() {

        this.cardsDealt = HandUtils.dealCards(deck.getDeckCards(),5);
        assert(cardsDealt.size()==5);

    }
}

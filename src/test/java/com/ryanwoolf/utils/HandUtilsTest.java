package com.ryanwoolf.utils;

import com.ryanwoolf.fivecarddraw.cardgame.Card;
import com.ryanwoolf.fivecarddraw.cardgame.CollectionShuffleDeck;
import com.ryanwoolf.fivecarddraw.mocks.HandMocks;
import com.ryanwoolf.fivecarddraw.utils.HandUtils;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class HandUtilsTest {


    ArrayList<Card> cardsDealt = new ArrayList<Card>();
    CollectionShuffleDeck deck;
    HandMocks handMocks;
    @BeforeEach
    public void setUp() {
        this.deck = new CollectionShuffleDeck();
        this.deck.shuffle();
        this.handMocks = new HandMocks(deck.deckCards);
    }

    @Test
    public void testPredifinedHandToString() {

        this.cardsDealt = (ArrayList<Card>) this.handMocks.predefinedHand();
        String evaluationString = HandUtils.handToString(cardsDealt);
        System.out.println(evaluationString);
        assert(evaluationString.equals("2♥ 4♦ 7♠ 8♣ 10♥"));

    }

    @Test
    public void testDealCards() {

        this.cardsDealt = (ArrayList<Card>) HandUtils.dealCards(deck.deckCards,5);
        assert(cardsDealt.size()==5);

    }
}

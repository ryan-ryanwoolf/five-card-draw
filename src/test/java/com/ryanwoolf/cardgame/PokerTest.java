package com.ryanwoolf.cardgame;

import com.ryanwoolf.fivecarddraw.carddeck.Card;
import com.ryanwoolf.fivecarddraw.carddeck.CollectionShuffleDeck;
import com.ryanwoolf.fivecarddraw.cardgame.Poker;
import com.ryanwoolf.fivecarddraw.mocks.HandMocks;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class PokerTest {


    ArrayList<Card> cardsDealt = new ArrayList<Card>();
    CollectionShuffleDeck deck;
    HandMocks handMocks;
    @BeforeEach
    public void setUp() {
        this.deck = new CollectionShuffleDeck();
        this.deck.shuffle();
        this.handMocks = new HandMocks(deck.getDeckCards());
    }

    @Test
    public void testIsStraightFlush() {

        this.cardsDealt = (ArrayList<Card>) this.handMocks.straightFlush();
        Poker poker = new Poker(cardsDealt);
        assert(poker.getEvaluationString().equals("Straight Flush"));

    }

    @Test
    public void testIsFourOfAKind() {

        this.cardsDealt = (ArrayList<Card>) this.handMocks.fourOfAKind();
        Poker poker = new Poker(cardsDealt);
        assert(poker.getEvaluationString().equals("Four of a Kind"));

    }

    @Test
    public void testIsFullHouse() {

        this.cardsDealt = (ArrayList<Card>) this.handMocks.fullHouse();
        Poker poker = new Poker(cardsDealt);
        assert(poker.getEvaluationString().equals("Full House"));

    }

    @Test
    public void testIsFlush() {

        this.cardsDealt = (ArrayList<Card>) this.handMocks.flush();
        Poker poker = new Poker(cardsDealt);
        assert(poker.getEvaluationString().equals("Flush"));

    }

    @Test
    public void testIsStraight() {

        this.cardsDealt = (ArrayList<Card>) this.handMocks.straight();
        Poker poker = new Poker(cardsDealt);
        assert(poker.getEvaluationString().equals("Straight"));

    }

    @Test
    public void testIsThreeOfAKind() {

        this.cardsDealt = (ArrayList<Card>) this.handMocks.threeOfAKind();
        Poker poker = new Poker(this.cardsDealt);
        assert(poker.getEvaluationString().equals("Three of a Kind"));

    }

    @Test
    public void testIsTwoPair() {

        this.cardsDealt = (ArrayList<Card>) this.handMocks.twoPair();
        Poker poker = new Poker(this.cardsDealt);
        assert(poker.getEvaluationString().equals("Two Pair"));

    }

    @Test
    public void testIsOnePair() {

        this.cardsDealt = (ArrayList<Card>) this.handMocks.onePair();
        Poker poker = new Poker(this.cardsDealt);
        assert(poker.getEvaluationString().equals("One Pair"));

    }

    @Test
    public void testIsHighCards() {

        this.cardsDealt = (ArrayList<Card>) this.handMocks.highCard();
        Poker poker = new Poker(cardsDealt);
        assert(poker.getEvaluationString().equals("High Cards"));

    }


}

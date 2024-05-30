package com.ryanwoolf.utils;

import com.ryanwoolf.fivecarddraw.cardgame.Card;
import com.ryanwoolf.fivecarddraw.cardgame.GenericDeck;
import com.ryanwoolf.fivecarddraw.mocks.HandMocks;
import com.ryanwoolf.fivecarddraw.utils.EvaluationUtils;
import com.ryanwoolf.fivecarddraw.utils.HandUtils;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class EvaluationUtilsTest {


    ArrayList<Card> cardsDealt = new ArrayList<Card>();
    GenericDeck deck;
    HandMocks handMocks;
    @BeforeEach
    public void setUp() {
        this.deck = new GenericDeck(Card.SUITS,Card.RANKS);
        this.deck.shuffle();
        this.handMocks = new HandMocks(deck.deckCards);
    }

    @Test
    public void testIsStraightFlush() {

        this.cardsDealt = (ArrayList<Card>) this.handMocks.straightFlush();
        String evaluationString = HandUtils.evaluateHand(this.cardsDealt);
        assert(evaluationString.equals("Straight Flush"));

    }

    @Test
    public void testIsFourOfAKind() {

        this.cardsDealt = (ArrayList<Card>) this.handMocks.fourOfAKind();
        String evaluationString = HandUtils.evaluateHand(this.cardsDealt);
        assert(evaluationString.equals("Four of a Kind"));

    }

    @Test
    public void testIsFullHouse() {

        this.cardsDealt = (ArrayList<Card>) this.handMocks.fullHouse();
        String evaluationString = HandUtils.evaluateHand(this.cardsDealt);
        assert(evaluationString.equals("Full House"));

    }

    @Test
    public void testIsFlush() {

        this.cardsDealt = (ArrayList<Card>) this.handMocks.flush();
        String evaluationString = HandUtils.evaluateHand(this.cardsDealt);
        assert(evaluationString.equals("Flush"));

    }

    @Test
    public void testIsStraight() {

        this.cardsDealt = (ArrayList<Card>) this.handMocks.straight();
        String evaluationString = HandUtils.evaluateHand(this.cardsDealt);
        assert(evaluationString.equals("Straight"));

    }

    @Test
    public void testIsThreeOfAKind() {

        this.cardsDealt = (ArrayList<Card>) this.handMocks.threeOfAKind();
        String evaluationString = HandUtils.evaluateHand(this.cardsDealt);
        assert(evaluationString.equals("Three of a Kind"));

    }

    @Test
    public void testIsTwoPair() {

        this.cardsDealt = (ArrayList<Card>) this.handMocks.twoPair();
        String evaluationString = HandUtils.evaluateHand(this.cardsDealt);
        assert(evaluationString.equals("Two Pair"));

    }

    @Test
    public void testIsOnePair() {

        this.cardsDealt = (ArrayList<Card>) this.handMocks.onePair();
        String evaluationString = HandUtils.evaluateHand(this.cardsDealt);
        assert(evaluationString.equals("One Pair"));

    }

    @Test
    public void testIsHighCards() {

        this.cardsDealt = (ArrayList<Card>) this.handMocks.highCard();
        String evaluationString = HandUtils.evaluateHand(this.cardsDealt);
        assert(evaluationString.equals("High Cards"));

    }

}

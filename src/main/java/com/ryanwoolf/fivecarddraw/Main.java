package com.ryanwoolf.fivecarddraw;

import com.ryanwoolf.fivecarddraw.cardgame.Card;
import com.ryanwoolf.fivecarddraw.cardgame.GenericDeck;
import com.ryanwoolf.fivecarddraw.utils.HandUtils;

import java.util.ArrayList;

/*
This main class is defined in the shade plugin as the main entry point when we run the application in the console.
*/

public class Main {
    public static void main(String[] args) {
        GenericDeck deck = new GenericDeck(Card.SUITS,Card.RANKS);
        deck.shuffle();
        ArrayList<Card> cardsDealt = (ArrayList<Card>) HandUtils.dealCards(deck.deckCards,5);
        String cardsString = HandUtils.handToString(cardsDealt);
        String cardsEvaluation = HandUtils.evaluateHand(cardsDealt);
        System.out.println("Your hand:"+cardsString);
        System.out.println("You have:"+cardsEvaluation);
    }
}

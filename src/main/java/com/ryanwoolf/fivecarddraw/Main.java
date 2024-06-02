package com.ryanwoolf.fivecarddraw;

import com.ryanwoolf.fivecarddraw.carddeck.Card;
import com.ryanwoolf.fivecarddraw.carddeck.CollectionShuffleDeck;
import com.ryanwoolf.fivecarddraw.cardgame.Poker;
import com.ryanwoolf.fivecarddraw.utils.HandUtils;

import java.util.ArrayList;

/*
This main class is defined in the shade plugin as the main entry point when we run the application in the console.
*/

public class Main {
    public static void main(String[] args) {
        CollectionShuffleDeck deck = new CollectionShuffleDeck();
        deck.shuffle();
        ArrayList<Card> cardsDealt = HandUtils.dealCards(deck.getDeckCards(),5);
        Poker poker = new Poker(cardsDealt);
        poker.viewHand();
        poker.viewEvaluation();


    }
}

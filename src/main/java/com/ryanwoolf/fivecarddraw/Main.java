package com.ryanwoolf.fivecarddraw;

import com.ryanwoolf.fivecarddraw.cardgame.Card;
import com.ryanwoolf.fivecarddraw.cardgame.GenericDeck;
import com.ryanwoolf.fivecarddraw.utils.HandUtils;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        GenericDeck deck = new GenericDeck(Card.SUITS,Card.RANKS);
        deck.shuffle();
        System.out.println(deck.deckCards.size());
        ArrayList<Card> cardsDealt = (ArrayList<Card>) HandUtils.dealCards(deck.deckCards,5);
//        ArrayList<Card> cardsDealt = (ArrayList<Card>) HandUtils.straightFlush(deck.deckCards);
//        ArrayList<Card> cardsDealt = (ArrayList<Card>) HandUtils.fourOfAKind(deck.deckCards);
//        ArrayList<Card> cardsDealt = (ArrayList<Card>) HandUtils.fullHouse(deck.deckCards);
//        ArrayList<Card> cardsDealt = (ArrayList<Card>) HandUtils.flush(deck.deckCards);
//        ArrayList<Card> cardsDealt = (ArrayList<Card>) HandUtils.straight(deck.deckCards);
//        ArrayList<Card> cardsDealt = (ArrayList<Card>) HandUtils.threeOfAKind(deck.deckCards);
//        ArrayList<Card> cardsDealt = (ArrayList<Card>) HandUtils.twoPair(deck.deckCards);
//        ArrayList<Card> cardsDealt = (ArrayList<Card>) HandUtils.onePair(deck.deckCards);
//        ArrayList<Card> cardsDealt = (ArrayList<Card>) HandUtils.highCard(deck.deckCards);
        String cardsString = HandUtils.handToString(cardsDealt);
        String cardsEvaluation = HandUtils.evaluateHand(cardsDealt);
        System.out.println("Your hand:"+cardsString);
        System.out.println("You have:"+cardsEvaluation);
    }
}

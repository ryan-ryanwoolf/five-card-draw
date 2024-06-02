package com.ryanwoolf.fivecarddraw.utils;

import com.ryanwoolf.fivecarddraw.carddeck.Card;

import java.util.ArrayList;

public class HandUtils {

    public static ArrayList<Card> dealCards(ArrayList<Card> deckCards,int numberOfCards){
        ArrayList<Card> dealtCards = new ArrayList<Card>();
        for(int i = 0;i < numberOfCards;i++){
            if (!deckCards.isEmpty()) {
                dealtCards.add(deckCards.remove(0));
            }
            else
            {
                throw new IllegalStateException("Not enough cards in the deck to deal the requested number of cards.");
            }

        }
        return dealtCards;
    }

}

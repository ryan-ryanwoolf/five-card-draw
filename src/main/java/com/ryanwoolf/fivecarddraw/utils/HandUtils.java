package com.ryanwoolf.fivecarddraw.utils;

import com.ryanwoolf.fivecarddraw.cardgame.Card;

import java.util.ArrayList;
import java.util.List;

import static com.ryanwoolf.fivecarddraw.cardgame.Poker.*;

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

    public static String handToString(ArrayList<Card> handCards)
    {
        StringBuilder cardsStringBuilder = new StringBuilder();
        handCards.forEach(card -> {
            if (cardsStringBuilder.length() == 0) {
                cardsStringBuilder.append(card.toString());
            } else {
                cardsStringBuilder.append(" ").append(card.toString());
            }
        });

        return cardsStringBuilder.toString();
    }
}

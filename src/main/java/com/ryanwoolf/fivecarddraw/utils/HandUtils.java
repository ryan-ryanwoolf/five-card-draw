package com.ryanwoolf.fivecarddraw.utils;

import com.ryanwoolf.fivecarddraw.cardgame.Card;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import static com.ryanwoolf.fivecarddraw.utils.EvaluationUtils.*;

public class HandUtils {

    public static List<Card> dealCards(ArrayList<Card> deckCards,int numberOfCards){
        List<Card> dealtCards = new ArrayList<Card>();
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
                cardsStringBuilder.append("|").append(card.toString());
            }
        });

        return cardsStringBuilder.toString();
    }

    public static String evaluateHand(ArrayList<Card> handCards){
        if(evaluateStraightFlush(handCards)){
            return "Straight Flush";
        }
        else if(evaluateFourOfAKind(handCards)){
            return "Four of a Kind";
        }
        else if(evaluateFullHouse(handCards)){
            return "Full House";
        }
        else if(evaluateFlush(handCards)){
            return "Flush";
        }
        else if(evaluateStraight(handCards)){
            return "Straight";
        }
        else if(evaluateThreeOfAKind(handCards)){
            return "Three of a Kind";
        }
        else if(evaluateTwoPair(handCards)){
            return "Two Pair";
        }
        else if(evaluateOnePair(handCards)){
            return "One Pair";
        }
        else
        {
            return "High Cards";
        }
    }


}

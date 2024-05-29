package com.ryanwoolf.fivecarddraw.cardgame;

import com.ryanwoolf.fivecarddraw.cardgame.interfaces.Deck;

import java.util.*;

public class GenericDeck implements Deck {

    public ArrayList<Card> deckCards = new ArrayList<Card>();

    public GenericDeck(List<String> suits, List<String> ranks){


        for(int i = 0;i < suits.size();i++){

            for(int j = 0;j < ranks.size();j++){
                System.out.println(ranks.get(j) + suits.get(i));
                deckCards.add(new Card(ranks.get(j),suits.get(i)));
            }
        }
    }

    public void shuffle(){
        System.out.println("Shuffling... Shuffling... Shuffling...");
        Collections.shuffle(deckCards);
    }


}

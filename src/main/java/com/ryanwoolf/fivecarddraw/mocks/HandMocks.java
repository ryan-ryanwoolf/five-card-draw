package com.ryanwoolf.fivecarddraw.mocks;

import com.ryanwoolf.fivecarddraw.carddeck.Card;
import com.ryanwoolf.fivecarddraw.enums.Ranks;
import com.ryanwoolf.fivecarddraw.enums.Suits;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
/*
These are mock hands that will be used in our unit tests to ensure that our evaluation module is working as expected.
*/


public class HandMocks {

    ArrayList<Card> deckCards = new ArrayList<Card>();
    public HandMocks(ArrayList<Card> deckCards){
        this.deckCards = deckCards;
    }

    public List<Card> straightFlush(){
        List<Card> dealtCards = new ArrayList<Card>();
        Optional<Card> twoHearts = this.deckCards.stream()
                .filter(card -> card.getSuit().equals(Suits.HEARTS) && card.getRank().equals(Ranks.TWO))
                .findFirst();

        Optional<Card> threeHearts = this.deckCards.stream()
                .filter(card -> card.getSuit().equals(Suits.HEARTS) && card.getRank().equals(Ranks.THREE))
                .findFirst();

        Optional<Card> fourHearts = this.deckCards.stream()
                .filter(card -> card.getSuit().equals(Suits.HEARTS) && card.getRank().equals(Ranks.FOUR))
                .findFirst();

        Optional<Card> fiveHearts = this.deckCards.stream()
                .filter(card -> card.getSuit().equals(Suits.HEARTS) && card.getRank().equals(Ranks.FIVE))
                .findFirst();

        Optional<Card> sixHearts = this.deckCards.stream()
                .filter(card -> card.getSuit().equals(Suits.HEARTS) && card.getRank().equals(Ranks.SIX))
                .findFirst();
        if(twoHearts.isPresent()){
            dealtCards.add(twoHearts.get());
        }
        if(threeHearts.isPresent()){
            dealtCards.add(threeHearts.get());
        }
        if(fourHearts.isPresent()){
            dealtCards.add(fourHearts.get());
        }
        if(fiveHearts.isPresent()){
            dealtCards.add(fiveHearts.get());
        }
        if(sixHearts.isPresent()){
            dealtCards.add(sixHearts.get());
        }
        return dealtCards;
    }

    public List<Card> fourOfAKind(){
        List<Card> dealtCards = new ArrayList<Card>();
        Optional<Card> twoHearts = this.deckCards.stream()
                .filter(card -> card.getSuit().equals(Suits.HEARTS) && card.getRank().equals(Ranks.TWO))
                .findFirst();

        Optional<Card> twoDaimonds = this.deckCards.stream()
                .filter(card -> card.getSuit().equals(Suits.DIAMONDS) && card.getRank().equals(Ranks.TWO))
                .findFirst();

        Optional<Card> twoSpades = this.deckCards.stream()
                .filter(card -> card.getSuit().equals(Suits.SPADES) && card.getRank().equals(Ranks.TWO))
                .findFirst();

        Optional<Card> twoClubs = this.deckCards.stream()
                .filter(card -> card.getSuit().equals(Suits.CLUBS) && card.getRank().equals(Ranks.TWO))
                .findFirst();

        Optional<Card> sixHearts = this.deckCards.stream()
                .filter(card -> card.getSuit().equals(Suits.SPADES) && card.getRank().equals(Ranks.SIX))
                .findFirst();
        if(twoHearts.isPresent()){
            dealtCards.add(twoHearts.get());
        }
        if(twoDaimonds.isPresent()){
            dealtCards.add(twoDaimonds.get());
        }
        if(twoSpades.isPresent()){
            dealtCards.add(twoSpades.get());
        }
        if(twoClubs.isPresent()){
            dealtCards.add(twoClubs.get());
        }
        if(sixHearts.isPresent()){
            dealtCards.add(sixHearts.get());
        }
        return dealtCards;
    }

    public List<Card> fullHouse(){
        List<Card> dealtCards = new ArrayList<Card>();
        Optional<Card> twoHearts = this.deckCards.stream()
                .filter(card -> card.getSuit().equals(Suits.HEARTS) && card.getRank().equals(Ranks.TWO))
                .findFirst();

        Optional<Card> twoDaimonds = this.deckCards.stream()
                .filter(card -> card.getSuit().equals(Suits.DIAMONDS) && card.getRank().equals(Ranks.TWO))
                .findFirst();

        Optional<Card> twoSpades = this.deckCards.stream()
                .filter(card -> card.getSuit().equals(Suits.SPADES) && card.getRank().equals(Ranks.TWO))
                .findFirst();

        Optional<Card> sixClubs = this.deckCards.stream()
                .filter(card -> card.getSuit().equals(Suits.CLUBS) && card.getRank().equals(Ranks.SIX))
                .findFirst();

        Optional<Card> sixHearts = this.deckCards.stream()
                .filter(card -> card.getSuit().equals(Suits.HEARTS) && card.getRank().equals(Ranks.SIX))
                .findFirst();
        if(twoHearts.isPresent()){
            dealtCards.add(twoHearts.get());
        }
        if(twoDaimonds.isPresent()){
            dealtCards.add(twoDaimonds.get());
        }
        if(twoSpades.isPresent()){
            dealtCards.add(twoSpades.get());
        }
        if(sixClubs.isPresent()){
            dealtCards.add(sixClubs.get());
        }
        if(sixHearts.isPresent()){
            dealtCards.add(sixHearts.get());
        }
        return dealtCards;
    }

    public List<Card> flush(){
        List<Card> dealtCards = new ArrayList<Card>();
        Optional<Card> twoHearts = this.deckCards.stream()
                .filter(card -> card.getSuit().equals(Suits.HEARTS) && card.getRank().equals(Ranks.TWO))
                .findFirst();

        Optional<Card> fourHearts = this.deckCards.stream()
                .filter(card -> card.getSuit().equals(Suits.HEARTS) && card.getRank().equals(Ranks.FOUR))
                .findFirst();

        Optional<Card> sixHearts = this.deckCards.stream()
                .filter(card -> card.getSuit().equals(Suits.HEARTS) && card.getRank().equals(Ranks.SIX))
                .findFirst();

        Optional<Card> eightHearts = this.deckCards.stream()
                .filter(card -> card.getSuit().equals(Suits.HEARTS) && card.getRank().equals(Ranks.EIGHT))
                .findFirst();

        Optional<Card> tenHearts = this.deckCards.stream()
                .filter(card -> card.getSuit().equals(Suits.HEARTS) && card.getRank().equals(Ranks.TEN))
                .findFirst();
        if(twoHearts.isPresent()){
            dealtCards.add(twoHearts.get());
        }
        if(fourHearts.isPresent()){
            dealtCards.add(fourHearts.get());
        }
        if(sixHearts.isPresent()){
            dealtCards.add(sixHearts.get());
        }
        if(eightHearts.isPresent()){
            dealtCards.add(eightHearts.get());
        }
        if(tenHearts.isPresent()){
            dealtCards.add(tenHearts.get());
        }
        return dealtCards;
    }

    public List<Card> straight(){
        List<Card> dealtCards = new ArrayList<Card>();
        Optional<Card> twoHearts = this.deckCards.stream()
                .filter(card -> card.getSuit().equals(Suits.HEARTS) && card.getRank().equals(Ranks.TWO))
                .findFirst();

        Optional<Card> threeSpades = this.deckCards.stream()
                .filter(card -> card.getSuit().equals(Suits.SPADES) && card.getRank().equals(Ranks.THREE))
                .findFirst();

        Optional<Card> fourDaimonds = this.deckCards.stream()
                .filter(card -> card.getSuit().equals(Suits.DIAMONDS) && card.getRank().equals(Ranks.FOUR))
                .findFirst();

        Optional<Card> fiveClubs = this.deckCards.stream()
                .filter(card -> card.getSuit().equals(Suits.CLUBS) && card.getRank().equals(Ranks.FIVE))
                .findFirst();

        Optional<Card> sixHearts = this.deckCards.stream()
                .filter(card -> card.getSuit().equals(Suits.HEARTS) && card.getRank().equals(Ranks.SIX))
                .findFirst();
        if(twoHearts.isPresent()){
            dealtCards.add(twoHearts.get());
        }
        if(threeSpades.isPresent()){
            dealtCards.add(threeSpades.get());
        }
        if(fourDaimonds.isPresent()){
            dealtCards.add(fourDaimonds.get());
        }
        if(fiveClubs.isPresent()){
            dealtCards.add(fiveClubs.get());
        }
        if(sixHearts.isPresent()){
            dealtCards.add(sixHearts.get());
        }
        return dealtCards;
    }

    public List<Card> threeOfAKind(){
        List<Card> dealtCards = new ArrayList<Card>();
        Optional<Card> twoHearts = this.deckCards.stream()
                .filter(card -> card.getSuit().equals(Suits.HEARTS) && card.getRank().equals(Ranks.TWO))
                .findFirst();

        Optional<Card> twoDaimonds = this.deckCards.stream()
                .filter(card -> card.getSuit().equals(Suits.DIAMONDS) && card.getRank().equals(Ranks.TWO))
                .findFirst();

        Optional<Card> twoSpades = this.deckCards.stream()
                .filter(card -> card.getSuit().equals(Suits.SPADES) && card.getRank().equals(Ranks.TWO))
                .findFirst();

        Optional<Card> sevenClubs = this.deckCards.stream()
                .filter(card -> card.getSuit().equals(Suits.CLUBS) && card.getRank().equals(Ranks.SEVEN))
                .findFirst();

        Optional<Card> sixHearts = this.deckCards.stream()
                .filter(card -> card.getSuit().equals(Suits.HEARTS) && card.getRank().equals(Ranks.SIX))
                .findFirst();
        if(twoHearts.isPresent()){
            dealtCards.add(twoHearts.get());
        }
        if(twoDaimonds.isPresent()){
            dealtCards.add(twoDaimonds.get());
        }
        if(twoSpades.isPresent()){
            dealtCards.add(twoSpades.get());
        }
        if(sevenClubs.isPresent()){
            dealtCards.add(sevenClubs.get());
        }
        if(sixHearts.isPresent()){
            dealtCards.add(sixHearts.get());
        }
        return dealtCards;
    }

    public List<Card> twoPair(){
        List<Card> dealtCards = new ArrayList<Card>();
        Optional<Card> twoHearts = this.deckCards.stream()
                .filter(card -> card.getSuit().equals(Suits.HEARTS) && card.getRank().equals(Ranks.TWO))
                .findFirst();

        Optional<Card> twoDaimonds = this.deckCards.stream()
                .filter(card -> card.getSuit().equals(Suits.DIAMONDS) && card.getRank().equals(Ranks.TWO))
                .findFirst();

        Optional<Card> sevenSpades = this.deckCards.stream()
                .filter(card -> card.getSuit().equals(Suits.SPADES) && card.getRank().equals(Ranks.SEVEN))
                .findFirst();

        Optional<Card> sevenClubs = this.deckCards.stream()
                .filter(card -> card.getSuit().equals(Suits.CLUBS) && card.getRank().equals(Ranks.SEVEN))
                .findFirst();

        Optional<Card> sixHearts = this.deckCards.stream()
                .filter(card -> card.getSuit().equals(Suits.HEARTS) && card.getRank().equals(Ranks.SIX))
                .findFirst();
        if(twoHearts.isPresent()){
            dealtCards.add(twoHearts.get());
        }
        if(twoDaimonds.isPresent()){
            dealtCards.add(twoDaimonds.get());
        }
        if(sevenSpades.isPresent()){
            dealtCards.add(sevenSpades.get());
        }
        if(sevenClubs.isPresent()){
            dealtCards.add(sevenClubs.get());
        }
        if(sixHearts.isPresent()){
            dealtCards.add(sixHearts.get());
        }
        return dealtCards;
    }

    public List<Card> onePair(){
        List<Card> dealtCards = new ArrayList<Card>();
        Optional<Card> twoHearts = this.deckCards.stream()
                .filter(card -> card.getSuit().equals(Suits.HEARTS) && card.getRank().equals(Ranks.TWO))
                .findFirst();

        Optional<Card> twoDaimonds = this.deckCards.stream()
                .filter(card -> card.getSuit().equals(Suits.DIAMONDS) && card.getRank().equals(Ranks.TWO))
                .findFirst();

        Optional<Card> sevenSpades = this.deckCards.stream()
                .filter(card -> card.getSuit().equals(Suits.SPADES) && card.getRank().equals(Ranks.SEVEN))
                .findFirst();

        Optional<Card> eightClubs = this.deckCards.stream()
                .filter(card -> card.getSuit().equals(Suits.CLUBS) && card.getRank().equals(Ranks.EIGHT))
                .findFirst();

        Optional<Card> tenHearts = this.deckCards.stream()
                .filter(card -> card.getSuit().equals(Suits.HEARTS) && card.getRank().equals(Ranks.TEN))
                .findFirst();
        if(twoHearts.isPresent()){
            dealtCards.add(twoHearts.get());
        }
        if(twoDaimonds.isPresent()){
            dealtCards.add(twoDaimonds.get());
        }
        if(sevenSpades.isPresent()){
            dealtCards.add(sevenSpades.get());
        }
        if(eightClubs.isPresent()){
            dealtCards.add(eightClubs.get());
        }
        if(tenHearts.isPresent()){
            dealtCards.add(tenHearts.get());
        }
        return dealtCards;
    }

    public List<Card> highCard(){
        List<Card> dealtCards = new ArrayList<Card>();
        Optional<Card> twoHearts = this.deckCards.stream()
                .filter(card -> card.getSuit().equals(Suits.HEARTS) && card.getRank().equals(Ranks.TWO))
                .findFirst();

        Optional<Card> fourDaimonds = this.deckCards.stream()
                .filter(card -> card.getSuit().equals(Suits.DIAMONDS) && card.getRank().equals(Ranks.FOUR))
                .findFirst();

        Optional<Card> sevenSpades = this.deckCards.stream()
                .filter(card -> card.getSuit().equals(Suits.SPADES) && card.getRank().equals(Ranks.SEVEN))
                .findFirst();

        Optional<Card> eightClubs = this.deckCards.stream()
                .filter(card -> card.getSuit().equals(Suits.CLUBS) && card.getRank().equals(Ranks.EIGHT))
                .findFirst();

        Optional<Card> tenHearts = this.deckCards.stream()
                .filter(card -> card.getSuit().equals(Suits.HEARTS) && card.getRank().equals(Ranks.TEN))
                .findFirst();
        if(twoHearts.isPresent()){
            dealtCards.add(twoHearts.get());
        }
        if(fourDaimonds.isPresent()){
            dealtCards.add(fourDaimonds.get());
        }
        if(sevenSpades.isPresent()){
            dealtCards.add(sevenSpades.get());
        }
        if(eightClubs.isPresent()){
            dealtCards.add(eightClubs.get());
        }
        if(tenHearts.isPresent()){
            dealtCards.add(tenHearts.get());
        }
        return dealtCards;
    }

    public List<Card> predefinedHand(){
        List<Card> dealtCards = new ArrayList<Card>();
        Optional<Card> twoHearts = this.deckCards.stream()
                .filter(card -> card.getSuit().equals(Suits.HEARTS) && card.getRank().equals(Ranks.TWO))
                .findFirst();

        Optional<Card> fourDaimonds = this.deckCards.stream()
                .filter(card -> card.getSuit().equals(Suits.DIAMONDS) && card.getRank().equals(Ranks.FOUR))
                .findFirst();

        Optional<Card> sevenSpades = this.deckCards.stream()
                .filter(card -> card.getSuit().equals(Suits.SPADES) && card.getRank().equals(Ranks.SEVEN))
                .findFirst();

        Optional<Card> eightClubs = this.deckCards.stream()
                .filter(card -> card.getSuit().equals(Suits.CLUBS) && card.getRank().equals(Ranks.EIGHT))
                .findFirst();

        Optional<Card> tenHearts = this.deckCards.stream()
                .filter(card -> card.getSuit().equals(Suits.HEARTS) && card.getRank().equals(Ranks.TEN))
                .findFirst();
        if(twoHearts.isPresent()){
            dealtCards.add(twoHearts.get());
        }
        if(fourDaimonds.isPresent()){
            dealtCards.add(fourDaimonds.get());
        }
        if(sevenSpades.isPresent()){
            dealtCards.add(sevenSpades.get());
        }
        if(eightClubs.isPresent()){
            dealtCards.add(eightClubs.get());
        }
        if(tenHearts.isPresent()){
            dealtCards.add(tenHearts.get());
        }
        return dealtCards;
    }
}

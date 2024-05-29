package com.ryanwoolf.fivecarddraw.utils;

import com.ryanwoolf.fivecarddraw.cardgame.Card;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

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

    public static List<Card> straightFlush(ArrayList<Card> deckCards){
        List<Card> dealtCards = new ArrayList<Card>();
        Optional<Card> twoHearts = deckCards.stream()
                .filter(card -> card.getSuit().equals("♥") && card.getRank().equals("2"))
                .findFirst();

        Optional<Card> threeHearts = deckCards.stream()
                .filter(card -> card.getSuit().equals("♥") && card.getRank().equals("3"))
                .findFirst();

        Optional<Card> fourHearts = deckCards.stream()
                .filter(card -> card.getSuit().equals("♥") && card.getRank().equals("4"))
                .findFirst();

        Optional<Card> fiveHearts = deckCards.stream()
                .filter(card -> card.getSuit().equals("♥") && card.getRank().equals("5"))
                .findFirst();

        Optional<Card> sixHearts = deckCards.stream()
                .filter(card -> card.getSuit().equals("♥") && card.getRank().equals("6"))
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

    public static List<Card> fourOfAKind(ArrayList<Card> deckCards){
        List<Card> dealtCards = new ArrayList<Card>();
        Optional<Card> twoHearts = deckCards.stream()
                .filter(card -> card.getSuit().equals("♥") && card.getRank().equals("2"))
                .findFirst();

        Optional<Card> twoDaimonds = deckCards.stream()
                .filter(card -> card.getSuit().equals("♦") && card.getRank().equals("2"))
                .findFirst();

        Optional<Card> twoSpades = deckCards.stream()
                .filter(card -> card.getSuit().equals("♠") && card.getRank().equals("2"))
                .findFirst();

        Optional<Card> twoClubs = deckCards.stream()
                .filter(card -> card.getSuit().equals("♣") && card.getRank().equals("2"))
                .findFirst();

        Optional<Card> sixHearts = deckCards.stream()
                .filter(card -> card.getSuit().equals("♥") && card.getRank().equals("6"))
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

    public static List<Card> fullHouse(ArrayList<Card> deckCards){
        List<Card> dealtCards = new ArrayList<Card>();
        Optional<Card> twoHearts = deckCards.stream()
                .filter(card -> card.getSuit().equals("♥") && card.getRank().equals("2"))
                .findFirst();

        Optional<Card> twoDaimonds = deckCards.stream()
                .filter(card -> card.getSuit().equals("♦") && card.getRank().equals("2"))
                .findFirst();

        Optional<Card> twoSpades = deckCards.stream()
                .filter(card -> card.getSuit().equals("♠") && card.getRank().equals("2"))
                .findFirst();

        Optional<Card> sixClubs = deckCards.stream()
                .filter(card -> card.getSuit().equals("♣") && card.getRank().equals("6"))
                .findFirst();

        Optional<Card> sixHearts = deckCards.stream()
                .filter(card -> card.getSuit().equals("♥") && card.getRank().equals("6"))
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

    public static List<Card> flush(ArrayList<Card> deckCards){
        List<Card> dealtCards = new ArrayList<Card>();
        Optional<Card> twoHearts = deckCards.stream()
                .filter(card -> card.getSuit().equals("♥") && card.getRank().equals("2"))
                .findFirst();

        Optional<Card> fourHearts = deckCards.stream()
                .filter(card -> card.getSuit().equals("♥") && card.getRank().equals("4"))
                .findFirst();

        Optional<Card> sixHearts = deckCards.stream()
                .filter(card -> card.getSuit().equals("♥") && card.getRank().equals("6"))
                .findFirst();

        Optional<Card> eightHearts = deckCards.stream()
                .filter(card -> card.getSuit().equals("♥") && card.getRank().equals("8"))
                .findFirst();

        Optional<Card> tenHearts = deckCards.stream()
                .filter(card -> card.getSuit().equals("♥") && card.getRank().equals("10"))
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

    public static List<Card> straight(ArrayList<Card> deckCards){
        List<Card> dealtCards = new ArrayList<Card>();
        Optional<Card> twoHearts = deckCards.stream()
                .filter(card -> card.getSuit().equals("♥") && card.getRank().equals("2"))
                .findFirst();

        Optional<Card> threeSpades = deckCards.stream()
                .filter(card -> card.getSuit().equals("♠") && card.getRank().equals("3"))
                .findFirst();

        Optional<Card> fourDaimonds = deckCards.stream()
                .filter(card -> card.getSuit().equals("♦") && card.getRank().equals("4"))
                .findFirst();

        Optional<Card> fiveClubs = deckCards.stream()
                .filter(card -> card.getSuit().equals("♣") && card.getRank().equals("5"))
                .findFirst();

        Optional<Card> sixHearts = deckCards.stream()
                .filter(card -> card.getSuit().equals("♥") && card.getRank().equals("6"))
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

    public static List<Card> threeOfAKind(ArrayList<Card> deckCards){
        List<Card> dealtCards = new ArrayList<Card>();
        Optional<Card> twoHearts = deckCards.stream()
                .filter(card -> card.getSuit().equals("♥") && card.getRank().equals("2"))
                .findFirst();

        Optional<Card> twoDaimonds = deckCards.stream()
                .filter(card -> card.getSuit().equals("♦") && card.getRank().equals("2"))
                .findFirst();

        Optional<Card> twoSpades = deckCards.stream()
                .filter(card -> card.getSuit().equals("♠") && card.getRank().equals("2"))
                .findFirst();

        Optional<Card> sevenClubs = deckCards.stream()
                .filter(card -> card.getSuit().equals("♣") && card.getRank().equals("7"))
                .findFirst();

        Optional<Card> sixHearts = deckCards.stream()
                .filter(card -> card.getSuit().equals("♥") && card.getRank().equals("6"))
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

    public static List<Card> twoPair(ArrayList<Card> deckCards){
        List<Card> dealtCards = new ArrayList<Card>();
        Optional<Card> twoHearts = deckCards.stream()
                .filter(card -> card.getSuit().equals("♥") && card.getRank().equals("2"))
                .findFirst();

        Optional<Card> twoDaimonds = deckCards.stream()
                .filter(card -> card.getSuit().equals("♦") && card.getRank().equals("2"))
                .findFirst();

        Optional<Card> sevenSpades = deckCards.stream()
                .filter(card -> card.getSuit().equals("♠") && card.getRank().equals("7"))
                .findFirst();

        Optional<Card> sevenClubs = deckCards.stream()
                .filter(card -> card.getSuit().equals("♣") && card.getRank().equals("7"))
                .findFirst();

        Optional<Card> sixHearts = deckCards.stream()
                .filter(card -> card.getSuit().equals("♥") && card.getRank().equals("6"))
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

    public static List<Card> onePair(ArrayList<Card> deckCards){
        List<Card> dealtCards = new ArrayList<Card>();
        Optional<Card> twoHearts = deckCards.stream()
                .filter(card -> card.getSuit().equals("♥") && card.getRank().equals("2"))
                .findFirst();

        Optional<Card> twoDaimonds = deckCards.stream()
                .filter(card -> card.getSuit().equals("♦") && card.getRank().equals("2"))
                .findFirst();

        Optional<Card> sevenSpades = deckCards.stream()
                .filter(card -> card.getSuit().equals("♠") && card.getRank().equals("7"))
                .findFirst();

        Optional<Card> eightClubs = deckCards.stream()
                .filter(card -> card.getSuit().equals("♣") && card.getRank().equals("8"))
                .findFirst();

        Optional<Card> tenHearts = deckCards.stream()
                .filter(card -> card.getSuit().equals("♥") && card.getRank().equals("10"))
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

    public static List<Card> highCard(ArrayList<Card> deckCards){
        List<Card> dealtCards = new ArrayList<Card>();
        Optional<Card> twoHearts = deckCards.stream()
                .filter(card -> card.getSuit().equals("♥") && card.getRank().equals("2"))
                .findFirst();

        Optional<Card> fourDaimonds = deckCards.stream()
                .filter(card -> card.getSuit().equals("♦") && card.getRank().equals("4"))
                .findFirst();

        Optional<Card> sevenSpades = deckCards.stream()
                .filter(card -> card.getSuit().equals("♠") && card.getRank().equals("7"))
                .findFirst();

        Optional<Card> eightClubs = deckCards.stream()
                .filter(card -> card.getSuit().equals("♣") && card.getRank().equals("8"))
                .findFirst();

        Optional<Card> tenHearts = deckCards.stream()
                .filter(card -> card.getSuit().equals("♥") && card.getRank().equals("10"))
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

    public static boolean evaluateStraightFlush(ArrayList<Card> handCards) {

        Map<String, Long> suitCount = handCards.stream()
                .collect(Collectors.groupingBy(Card::getSuit, Collectors.counting()));

        System.out.println("suitCount.size():"+suitCount.size());

        if(suitCount.size()!=1){
            return false;
        }

        handCards.forEach(card -> System.out.println("Rank: " + card.getRank()));

        System.out.println(Card.RANKS.indexOf("2"));
        List<Integer> rankIndices = handCards.stream()
                .map(card -> Card.RANKS.indexOf(card.getRank()))
                .sorted()
                .collect(Collectors.toList());

        System.out.println("rankIndices:"+rankIndices);
        for (int i = 0; i < rankIndices.size() - 1; i++) {
            if (rankIndices.get(i) + 1 != rankIndices.get(i + 1)) {
                return false;
            }
        }
        return true;

    }

    public static boolean evaluateFourOfAKind(ArrayList<Card> handCards){

        Map<String, Long> rankCounts = handCards.stream()
                .collect(Collectors.groupingBy(Card::getRank, Collectors.counting()));

        System.out.println(rankCounts);
        if(rankCounts.containsValue(4L)){
            return true;
        }
        else
        {
            return false;
        }

    }

    public static boolean evaluateFullHouse(ArrayList<Card> handCards){

        Map<String, Long> rankCounts = handCards.stream()
                .collect(Collectors.groupingBy(Card::getRank, Collectors.counting()));

        System.out.println(rankCounts);
        if(rankCounts.containsValue(3L)&&rankCounts.containsValue(2L)){
            return true;
        }
        else
        {
            return false;
        }

    }

    public static boolean evaluateFlush(ArrayList<Card> handCards){

        Map<String, Long> suitCounts = handCards.stream()
                .collect(Collectors.groupingBy(Card::getSuit, Collectors.counting()));

        System.out.println(suitCounts);
        if(suitCounts.containsValue(5L)){
            return true;
        }
        else
        {
            return false;
        }

    }

    public static boolean evaluateStraight(ArrayList<Card> handCards) {

        List<Integer> rankIndices = handCards.stream()
                .map(card -> Card.RANKS.indexOf(card.getRank()))
                .sorted()
                .collect(Collectors.toList());

        System.out.println("rankIndices:"+rankIndices);
        for (int i = 0; i < rankIndices.size() - 1; i++) {
            if (rankIndices.get(i) + 1 != rankIndices.get(i + 1)) {
                return false;
            }
        }
        return true;

    }

    public static boolean evaluateThreeOfAKind(ArrayList<Card> handCards){

        Map<String, Long> rankCounts = handCards.stream()
                .collect(Collectors.groupingBy(Card::getRank, Collectors.counting()));

        System.out.println(rankCounts);
        if(rankCounts.containsValue(3L)){
            return true;
        }
        else
        {
            return false;
        }

    }

    public static boolean evaluateTwoPair(ArrayList<Card> handCards){

        Map<String, Long> rankCounts = handCards.stream()
                .collect(Collectors.groupingBy(Card::getRank, Collectors.counting()));

        int[] pairs = {0};
        rankCounts.forEach((rank, count) -> {
            if (count == 2L) {
                pairs[0]++;
            }
        });

        if(pairs[0]==2){
            return true;
        }
        else
        {
            return false;
        }

    }

    public static boolean evaluateOnePair(ArrayList<Card> handCards){

        Map<String, Long> rankCounts = handCards.stream()
                .collect(Collectors.groupingBy(Card::getRank, Collectors.counting()));

        int[] pairs = {0};
        rankCounts.forEach((rank, count) -> {
            if (count == 2L) {
                pairs[0]++;
            }
        });

        if(pairs[0]==1){
            return true;
        }
        else
        {
            return false;
        }

    }

}

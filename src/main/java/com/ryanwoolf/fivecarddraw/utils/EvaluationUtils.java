package com.ryanwoolf.fivecarddraw.utils;

import com.ryanwoolf.fivecarddraw.cardgame.Card;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EvaluationUtils {

    public static boolean evaluateStraightFlush(ArrayList<Card> handCards) {

        Map<String, Long> suitCount = handCards.stream()
                .collect(Collectors.groupingBy(Card::getSuit, Collectors.counting()));

        if(suitCount.size()!=1){
            return false;
        }

        List<Integer> rankIndices = handCards.stream()
                .map(card -> Card.RANKS.indexOf(card.getRank()))
                .sorted()
                .collect(Collectors.toList());

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

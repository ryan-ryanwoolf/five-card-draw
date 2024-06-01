package com.ryanwoolf.fivecarddraw.cardgame;

import com.ryanwoolf.fivecarddraw.enums.Ranks;
import com.ryanwoolf.fivecarddraw.enums.Suits;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Poker {

    ArrayList<Card> handCards = new ArrayList<>();
    Map<Suits, Long> suitCount;
    Map<Ranks, Long> rankCount;
    List<Integer> rankIndices;
    String handEvaluationString = "";
    public Poker(ArrayList<Card> handCards){
        this.handCards = handCards;
        precalculations();
        evaluateHand();
    }

    private void precalculations(){
        this.suitCount = this.handCards.stream()
                .collect(Collectors.groupingBy(Card::getSuit, Collectors.counting()));

        this.rankIndices = this.handCards.stream()
                .map(card -> card.getRank().ordinal())
                .sorted()
                .collect(Collectors.toList());

        this.rankCount = handCards.stream()
                .collect(Collectors.groupingBy(Card::getRank, Collectors.counting()));

    }

    private void evaluateHand(){

        if(evaluateStraightFlush()){
            this.handEvaluationString = "Straight Flush";
        }
        else if(evaluateFourOfAKind()){
            handEvaluationString = "Four of a Kind";
        }
        else if(evaluateFullHouse()){
            this.handEvaluationString = "Full House";
        }
        else if(evaluateFlush()){
            this.handEvaluationString = "Flush";
        }
        else if(evaluateStraight()){
            this.handEvaluationString = "Straight";
        }
        else if(evaluateThreeOfAKind()){
            this.handEvaluationString = "Three of a Kind";
        }
        else if(evaluateTwoPair()){
            this.handEvaluationString = "Two Pair";
        }
        else if(evaluateOnePair()){
            this.handEvaluationString = "One Pair";
        }
        else
        {
            this.handEvaluationString = "High Cards";
        }
    }

    public boolean evaluateStraightFlush() {

        if(suitCount.size()!=1){
            return false;
        }

        for (int i = 0; i < this.rankIndices.size() - 1; i++) {
            if (this.rankIndices.get(i) + 1 != this.rankIndices.get(i + 1)) {
                return false;
            }
        }
        return true;

    }

    public boolean evaluateFourOfAKind(){

        if(this.rankCount.containsValue(4L)){
            return true;
        }
        else
        {
            return false;
        }

    }

    public boolean evaluateFullHouse(){

        if(this.rankCount.containsValue(3L)&&this.rankCount.containsValue(2L)){
            return true;
        }
        else
        {
            return false;
        }

    }

    public boolean evaluateFlush(){

        if(this.suitCount.containsValue(5L)){
            return true;
        }
        else
        {
            return false;
        }

    }

    public boolean evaluateStraight() {

        for (int i = 0; i < this.rankIndices.size() - 1; i++) {
            if (this.rankIndices.get(i) + 1 != this.rankIndices.get(i + 1)) {
                return false;
            }
        }
        return true;

    }

    public boolean evaluateThreeOfAKind(){

        if(this.rankCount.containsValue(3L)){
            return true;
        }
        else
        {
            return false;
        }

    }

    public boolean evaluateTwoPair(){

        int[] pairs = {0};
        rankCount.forEach((rank, count) -> {
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

    public boolean evaluateOnePair(){

        int[] pairs = {0};
        this.rankCount.forEach((rank, count) -> {
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

    public String getEvaluationString(){
        return this.handEvaluationString;
    }
}

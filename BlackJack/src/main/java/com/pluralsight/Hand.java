package com.pluralsight;

import java.util.ArrayList;

public class Hand {
    private final ArrayList<Card> cards;

    public Hand(){
        this.cards = new ArrayList<Card>();
    }

    public void Deal(Card card){
        cards.add(card);
    }

    public void Deal(Deck deck, int numberOfCardsToDeal){
        for(int i = 0; i < numberOfCardsToDeal ; i++){
            Deal(deck.deal());
        }
    }



    public int getSize(){
        return cards.size();
    }

    public int getValue() throws Exception {
        int handValue = 0;
        for(Card card:cards){
            card.flip();
            handValue += card.getPointValue();
            card.flip();
        }
        return handValue;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        for(Card card: this.cards){
            sb.append(card.toString());
            sb.append("\n");
        }
        try {
            sb.append("The total is:").append(this.getValue());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        sb.append("\n");
        return sb.toString();
    }

    public void DisplayHand() throws Exception {

    }

}
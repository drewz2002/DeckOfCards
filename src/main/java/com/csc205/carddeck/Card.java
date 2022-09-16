package com.csc205.card;

public class Card {

    private Suit suit;
    private FaceValue value;

    public Card(){
        suit = null;
        value = null;
    }

    public Card(Suit suit, FaceValue value) {
        this.suit = suit;
        this.value = value;
    }


}

package com.example.carddeck;

import java.util.List;

public class StandardDeck extends AbstactDeck{

    public StandardDeck(){
        this.cards = newDeck();
    }

    private List<Card> newDeck() {
        List<Cards> newDeck = new ArrayList<>();

        for
    }

    @Override
    public void cut(int index) {

    }

    @Override
    public Card deal() {
        return null;
    }

    @Override
    public void newOrder(Deck deck) {

    }

    @Override
    public int search(Card card) {
        return 0;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public Card turnOver() {
        return null;
    }
}

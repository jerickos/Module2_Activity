package com.example.carddeck;

import java.util.Collections;
import java.util.List;
import java.util.Random;

public abstract class AbstactDeck implements Deck {

    protected List<Card> cards;

    public List<Card> getDecks() {
        return this.cards;
    }
    @Override
    public void shuffle(){
        long seed = System.nanoTime();
        Collections.shuffle(this.cards, new Random(seed));
    }

}

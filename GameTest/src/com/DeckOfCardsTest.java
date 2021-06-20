package com;

import cards.Card;
import cards.FaceOfCard;

public class DeckOfCardsTest {
    public static void main(String[] args) {
        DeckOfCards deck = new DeckOfCards();
        Card[] hand;

        //deck.sortByFaceCards(deck.cards);
        deck.shuffleCards();
        deck.printBySuits();
        //deck.printDeck();




    }
}

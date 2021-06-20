package com;

import cards.Card;
import cards.FaceOfCard;
import cards.SuitOfCard;

import java.util.List;
import java.util.Random;
import java.util.ArrayList;

public class DeckOfCards {

    ArrayList<Card> cards; //a list of all the cards in the deck
    int currentCard;
    private static int numberOfCards = 52;


    public DeckOfCards() {
        this.currentCard = 0;
        this.cards = new ArrayList<Card>();

        //initialize deck with Card objects
//        for (int i = 0; i < numberOfCards; i++) {
            for (SuitOfCard s : SuitOfCard.values()) {
                for (FaceOfCard f : FaceOfCard.values()) {
                    cards.add(new Card(f, s));
                }
            }
//        }
    }

    public void shuffleCards(){
        currentCard = 0; //by condition
        Random random = new Random();
        //select 2 random objects and exchange them
        for (int first = 0; first < numberOfCards; first++) {
            //select second random number
            int second = random.nextInt(numberOfCards);

            //exchange
            Card temp = cards.get(first);
            cards.set(first, cards.get(second));
            cards.set(second, temp);
        }
    }

    public Card[] dealFive(){
        Card[] deck = new Card[5];

        for(int i= 0; i < 5; i++){
            if (currentCard < deck.length) { //by condition
                Card temp = cards.get(currentCard);
                deck[i] = temp;
                currentCard++;
            } else deck[i] = null;

        }
        return deck;
    }

    public static void sortByFaceCards(ArrayList<Card> list) {
        ArrayList<Card> sorted = new ArrayList<Card>();

        for (FaceOfCard f : FaceOfCard.values()) { //first all aces, then all deuces, etc...
            for (int i = 0; i < numberOfCards; i++) {
                Card temp = list.get(i);
                if (temp.getFace() == f) {
                    sorted.add(temp);
                }
            }
        }
        //now that we have sorted our new array we must replace the old one
        for (int i=0; i < numberOfCards; i++){
            list.set(i, sorted.get(i));
        }

    }

    public void printBySuits(){

        for (SuitOfCard s : SuitOfCard.values()) { //so we get through all the suits, one at a time
            for (int i = 0; i < numberOfCards; i++){ //so we get through the deck
                if (cards.get(i).getSuit() == s){
                    System.out.printf("%-20s", cards.get(i));
                }
            }
            System.out.println();
        }
    }

    public List<FaceOfCard> getDistinctFaces(Card[] cards){
        List<FaceOfCard> faceOfCard = new ArrayList<>();

        for (int i = 0; i < numberOfCards; i++) {
            if (!faceOfCard.contains(cards[i].getFace())) { //so we remove all occurrences
                faceOfCard.set(i, cards[i].getFace());
            }
        }
        return faceOfCard;
    }



    public void printDeck(){
        int newLineCounter = 0;
        for (int i = 0; i < numberOfCards; i++)
        {
            System.out.printf("%-20s ", cards.get(i).toString());
            newLineCounter++;
            if (newLineCounter % 4 == 0 && newLineCounter != 0)
            {
                System.out.println();
            }
        }
    }











}

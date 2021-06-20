package model;

import java.util.Random;

public class StackOfCards {
    Card[] cards; // all cards in stack
    Card[] pack1; // after first /2
    Card[] pack2; // after second /2
    Card[] hand; // current hand with most of 12 cards
    int trump; // color index in Cards.suits, Коз на играта
    Random random; // random num generator
    int currentCard;
    int currentPack1;
    int currentPack2;

    public StackOfCards() {
        cards = new Card[64];
        int index = 0;
        int helper = 2;
        while (helper > 0) {
            for (int i = 0; i < 4; i++) { //suits
                for (int j = 0; j < 8; j++) { //faces
                    cards[index] = new Card(j, i);
                    index++;
                }
            }
            helper--;
        }

        random = new Random();
        this.trump = random.nextInt(4);
        currentCard = 0;
        currentPack1 = 0;
        currentPack2 = 0;

        //initialize pack1 and pack2
        int number = random.nextInt(33) + 16; //[16,48]
        pack1 = new Card[number];
        pack2 = new Card[64-number];
        hand = new Card[12];
    }

    public int getTrump(){
        return this.trump = trump > -1 && trump < 4 ? trump : 0;
    }

    public void shuffleCards() {
        int currentCard = 0;
        for (int first = 0; first < 64; first++) {
            int second = random.nextInt(64);

            //exchange
            Card temp = cards[first];
            cards[first] = cards[second];
            cards[second] = temp;

        }
    }

    public String printCards(){
        int newLineCounter = 0;
        String temp = " ";

        for (int i = 0; i < 12; i++) { //hand has most 12 cards
            if(hand[i] == null){ //but it can also have 7 for example
                break;
            }
            temp += hand[i].toString() + " ";
            newLineCounter++;
            if (newLineCounter % 4 == 0 && newLineCounter !=0){
                temp += "\n";
            }
        }
        return temp;
    }

    public void make2packs(){
        int number = random.nextInt(33) + 16; //[16,48]
        pack1 = new Card[number];
        pack2 = new Card[64-number];
        shuffleCards();

        for (int i = 0; i < number; i++) {
            pack1[i] = cards[i];
        }

        for (int i = number; i < 64; i++) {
            pack2[i] = cards[i];
        }
    }

    public boolean dealHand() {
        boolean flag = true;
        int index = 0;
        int helper = 12;

        if (currentPack1 < pack1.length) {
            for (int i = currentPack1; i < pack1.length && helper != 0; i++) {
                hand[index] = pack1[i];
                index++;
                currentPack1++;
                helper--;
            }
        } else if (currentPack2 < pack2.length) {
            for (int i = currentPack2; i < pack2.length && helper != 12; i++) {
                hand[index] = pack2[i];
                index++;
                currentPack2++;
                helper--;
            }
        } else {
            flag = false;
        }

        return flag;
    }

    public boolean hasKQ() {
        boolean king = false;
        boolean queen = false;

        for (int i = 0; i < hand.length; i++) {
            if (hand[i].getFace() == 1) {
                king = true;
            }

            if (hand[i].getFace() == 2) {
                queen = true;
            }
        }

        return king && queen;
    }

    public boolean has4ACE() {
        int counter = 0;
        for (int i = 0; i < hand.length; i++) {
            if (hand[i].getFace() == 0) {
                counter++;
            }
        }

        if (counter == 4) {
            return true;
        } else return false;
    }

    public static void main(String[] args) {
        StackOfCards cards = new StackOfCards();

        cards.dealHand();
        cards.printCards();
    }
}

package model;

import java.awt.*;

public class Card {
    //ACE, KING, QUEEN, JACK, TEN, NINE, EIGHT SEVEN
    //CLUBS, DIAMONDS, HEARTS, SPADES
    int face; //power
    int suit; //color

    public static String[] faces = {"ACE", "KING", "QUEEN", "JACK", "TEN", "NINE",
                                    "EIGHT", "SEVEN"};
    public static String[] suits = {"CLUBS", "DIAMONDS", "HEARTS", "SPADES"};

    public Card() {
        this.face = 1;
        this.suit = 1;
    }

    public Card(int face, int suit) {
        this.face = face;
        this.suit = suit;
    }

    public int getFace() {
       return face;
    }

    public int getSuit() {
        return suit;
    }

    public String getSuitName() {
        for (int i = 0; i <= this.suit; i++) {
            if (this.suit == i) {
                return suits[i];
            }
        }
        return null;
    }

    public String getFaceName() {
        for (int i = 0; i <= this.face; i++) {
            if (this.face == i) {
                return faces[i];
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return String.format("%s of %s", this.getFace(), this.getSuitName());
    }
}

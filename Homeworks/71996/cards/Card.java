package cards;

public class Card {
    FaceOfCard face;
    SuitOfCard suit;

    public Card(FaceOfCard face, SuitOfCard suit) {
        this.face = face; //initialize face of card
        this.suit = suit; //initialize suit of card
    }

    public FaceOfCard getFace() {
        return face;
    }

    public void setFace(FaceOfCard face) {
        this.face = face;
    }

    public SuitOfCard getSuit() {
        return suit;
    }

    public void setSuit(SuitOfCard suit) {
        this.suit = suit;
    }

    @Override
    public String toString() {
        return String.format("%s of %s", this.getFace(), this.getSuit());
    }
}

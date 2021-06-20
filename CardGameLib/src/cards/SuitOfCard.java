package cards;

public enum SuitOfCard {
    CLUBS("Clubs"), DIAMONDS("Diamonds"), HEARTS("Hearts"),
    SPADES("Spades");

    private String suit;

    SuitOfCard(String suit) {
        this.suit = suit;
    }

    public String getSuit() {
        return suit;
    }

    @Override
    public String toString() {
        return String.format("%s", this.getSuit());
    }
}

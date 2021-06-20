package cards;

public enum FaceOfCard {
    ACE("Ace"), DEUCE("Deuce"), THREE("Three"), FOUR("Four"),
    FIVE("Five"), SIX("Six"), SEVEN("Seven"), EIGHT("Eight"),
    NINE("Nine"), TEN("Ten"), JACK("Jack"), QUEEN("Queen"),
    KING("King");


    private String face;
    FaceOfCard(String face){
        this.face = face;
    }

    public String getFace() {
        return face;
    }

    public int getValue() {
        switch (face) {
            case "Ace":
                return 1;
            case "Deuce":
                return 2;
            case "Three":
                return 3;
            case "Four":
                return 4;
            case "Five":
                return 5;
            case "Six":
                return 6;
            case "Seven":
                return 7;
            case "Eight":
                return 8;
            case "Nine":
                return 9;
            case "Ten":
                return 10;
            case "Jack":
                return 11;
            case "Queen":
                return 12;
            case "King":
                return 13;
        }
        return 1;
    }

    @Override
    public String toString() {
        return String.format("%s", this.getFace());
    }
}


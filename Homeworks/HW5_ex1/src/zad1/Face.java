package zad1;

public enum Face {
    HEAD("HEAD"), TAIL("TAIL");

    private String face;

    Face (String face){
        this.face = (face == null) ? "TAIL" : face;
    }

    public String getFace(){
        return face;
    }

    @Override
    public String toString() {
        return String.format("%s", this.getFace());
    }

}

package zad1;

import java.util.Random;

public class Coin {
    private Random rand;
    private Face face;

    Coin(Face face){
        this.face = face;
        this.rand = new Random();
    }

    Face getFace(){
        return this.face;
    }

    void setFace(Face face){
        this.face = (face == null) ? Face.TAIL : face;
    }

    void flip(){
        int flipper = rand.nextInt(2);
        if (flipper == 1) {
            this.face = Face.HEAD;
        } else {
            this.face = Face.TAIL;
        }

    }

    boolean isHeads(){
        if (this.face == Face.HEAD) {
            return true;
        }
        return false;
    }

    @Override
    public String toString(){
        return String.format("%s", this.getFace());
    }
}


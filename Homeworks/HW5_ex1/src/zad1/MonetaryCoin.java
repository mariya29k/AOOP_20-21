package zad1;

public class MonetaryCoin extends Coin{
    private int value;

    MonetaryCoin(Face face, int value) {
        super(face);
        setValue(value);
    }

    void setValue(int value){
        this.value = value < 1 ? 1 : value;
    }

    int getValue(){
        return this.value;
    }

    @Override
    public String toString(){
        return String.format("%s of %d", super.toString(), this.getValue());
    }
}

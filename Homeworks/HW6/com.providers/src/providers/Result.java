package providers;

import java.util.Arrays;

public class Result {
    private char[] chars;
    private int data;

    public Result(char[] chars, int data) {
        setChars(chars);
        setData(data);
    }

    public char[] getChars() {
        char[] copy = new char[chars.length];
        for (int i = 0; i < copy.length; i++) {
            copy[i] = chars[i];
        }
        return copy;
    }

    public void setChars(char[] chars) {
        if (chars != null) {
            this.chars = new char[chars.length];
            for (int i = 0; i < chars.length; i++) {
                this.chars[i] = chars[i];
            }
        } else {
            this.chars = new char[0];
        }
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data < 0 ? 0 : data;
    }

    @Override
    public String toString() {
        return String.format("Chars: %s%n, Result: %d", Arrays.toString(chars), this.data);

    }
}

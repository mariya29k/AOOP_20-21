package providers;

import services.Cipherable;

import java.util.Random;

public class Wrapper {
    private int size;

    public Wrapper(int size) {
        setSize(size);
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size < 0 ? 0 : size;
    }


    private class FixedRandom implements Cipherable {
        //се генерира една и съща последователност от произволно избрани
        //символи в интервала A-Z за всяка конкретна стойност на аргумента seed на метода
        //getSecretNumbers
        @Override
        public char[] getSecretChars(int seed) {
            Random random = new Random(seed);
            char[] chars = new char[size];

            //A = 65, Z = 90, 90 - 65 = 25, but bound should be + 1
            //and then parse it to char
            for (int i = 0; i < chars.length; i++) {
                chars[i] = (char)(random.nextInt(26) + 65);
            }
            return chars;
        }
    }

    public Cipherable makeFixedSelection() {
        return new FixedRandom();
    }

    private class FixedSelection implements Cipherable{

        @Override
        public char[] getSecretChars(int seed) {
            Random random = new Random();
            int randomNum;
            char[] randomChars = new char[seed];

            //се генерира произволна последователност от seed произволно избрани
            //символи в интервала A-Z
            for (int i = 0; i < randomChars.length; i++) {
                randomChars[i] = (char)(random.nextInt(26) + 65);
            }

            //Произволна последователност от така избраните
            //символи да се запишат в реда на генерирането им в масива с дължина size,
            //връщан от getSecretChars(int seed)
            char[] result = new char[size];
            for (int i = 0; i < result.length; i++) {
                randomNum = random.nextInt(seed);
                result[i] = randomChars[randomNum];
            }
            return new char[0];
        }
    }

    public Cipherable makeFixedRandom() {
        return new FixedSelection();
    }
}

package providers;

import services.Cipherable;

public class CipherGenerator {

    public static Result countDistinct(Cipherable cipher, int seed) {
        //пресмята броя на уникалните символи в масива от символи, генерирани от
        //метода getSecretChars(seed) на обекта, рефериран с параметъра cipher
        int counter = 0;
        char[] chars = cipher.getSecretChars(seed);
        boolean flag = false;

        for (int i = 0; i < chars.length; i++) {
            flag = true;
            for (int j = 0; j < chars.length; j++) {
                if (chars[i] == chars[j]){
                    flag = false;
                    break;
                }
            }

            if (flag) {
                counter++;
            }
        }

        return new Result(chars, counter);
    }
}

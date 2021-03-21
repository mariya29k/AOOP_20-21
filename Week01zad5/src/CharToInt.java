public class CharToInt {
    public static void main(String[] args) {
        char capitalSymbol = 'A';
        int capitalToInt = capitalSymbol;

        char lowerSymbol = 'a';
        int lowerToInt = lowerSymbol;

        char numSymbol = '0';
        int numToInt = numSymbol;

        System.out.println("Characters to Integers: ");
        //printing A B C
        for (int i = 0; i < 3; i++) {
            System.out.println(capitalToInt);
            capitalSymbol += 1;
            capitalToInt = capitalSymbol;
        }

        //printing a b c
        for (int i = 0; i < 3; i++) {
            System.out.println(lowerToInt);
            lowerSymbol += 1;
            lowerToInt = lowerSymbol;
        }

        //printing 0 1 2
        for (int i = 0; i < 3; i++) {
            System.out.println(numToInt);
            numSymbol += 1;
            numToInt = numSymbol;
        }

        //printing $ * + / " "
        char dollar = '$';
        int dollarToInt = dollar;
        System.out.println(dollarToInt);

        char asterik = '*';
        int asterikToInt = asterik;
        System.out.println(asterikToInt);

        char plus = '+';
        int plusToInt = plus;
        System.out.println(plusToInt);

        char slash = '/';
        int slashToInt = slash;
        System.out.println(slashToInt);

        char blank = ' ';
        int blankToInt = blank;
        System.out.println(blankToInt);
    }


}

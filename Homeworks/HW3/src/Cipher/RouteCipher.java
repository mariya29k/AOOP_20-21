package Cipher;

public class RouteCipher {
    private int key; // |key| = number of columns

    public RouteCipher(int key) {
        setKey(key);
    }

    public RouteCipher() {
        this(new RouteCipher(1));
    }

    public RouteCipher(RouteCipher routeCipher) {
        this(routeCipher.key);
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key; //validation is not needed since the key can be > 0 || < 0 || == 0
    }

    //create 2-dimensional array
    public char[][] createArray(char[] array, int columns, int rows) {
        //if we do not have enough chars to fulfill the matrix, we add X
        //so firstly I'll fill the two dimensional array with Xs and then will add text
        char[][] twoDimensional = new char[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                twoDimensional[i][j] = 'X';
            }
        }

        int helper = 0; //iterates through one dimensional array
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns && helper < array.length; j++) {
                twoDimensional[i][j] = array[helper];
                helper++;
            }
        }
        return twoDimensional;
    }

    //1 method to read if positive and second if negative
    //they will be called in the main encrypt function
    public String encrypt(String plainText){
        char[] cipherTextChars = plainText.toCharArray();
        int key = getKey();

        //the number of rows[i] will depend on the key and the length of the text
        //the number columns[j] are equal to the key
        int textLength = cipherTextChars.length;
        int columns = Math.abs(key); //if key < 0
        int rows = (textLength + columns - (textLength % columns)) / columns;
        // {a,b,c,d,e,f,g} -> length = 7, key = 4
        // {{a,b,c,d},
        //  {e,f,g,X}}
        // rows = (7 + 4 - 3) / 4 = 2
        // it works even if length % key == 0
        char[][] twoDimensional = createArray(cipherTextChars, columns, rows);
        //creating empty String for output in which we will add encrypted characters
        String encrypted = "";

        if (key > 0) {
            return encryptPositiveKey(twoDimensional, 0, rows-1, 0, columns-1, encrypted);
        } else if (key < 0) {
            return encryptNegativeKey(twoDimensional, 0, rows-1, 0, columns-1, encrypted);

        }
        else { //case key == 0 nothing changes
            return plainText;
        }

    }

    //Spiralling from top left corner in counterclockwise direction
    public String encryptPositiveKey(char[][] twoDimensional, int x1, int rows, int y1, int columns, String encrypted) {

        //top left -> bottom left
        for (int i = x1; i <= rows; i++) {
            encrypted += twoDimensional[i][y1];
        }
        // bottom left -> bottom right
        for (int i = y1 + 1; i <= columns; i++) {
            encrypted += twoDimensional[rows][i];
        }
        //bottom right -> top right
        for (int i = rows - 1; i >= x1 ; i--) {
            encrypted += twoDimensional[i][columns];
        }
        //top right -> top left
        for (int i = columns - 1; i >= y1 + 1 ; i--) {
            encrypted += twoDimensional[x1][i];
        }

        //if more layers need to be printed
        //in each iteration we go one step inwards till we reach the middle, where the recursion ends
        if(y1 - columns > 0) {
            encryptPositiveKey(twoDimensional, x1+1, rows -1, y1 +1, columns-1, encrypted);
        }
        return encrypted;
    }

    //Spiralling from bottom right corner in counterclockwise direction
    public String encryptNegativeKey (char[][] twoDimensional, int x1, int rows, int y1, int columns, String encrypted) {
        //bottom right -> top right
        for (int i = rows; i >= x1 ; i--) {
            encrypted += twoDimensional[i][columns];
        }
        //top right -> top left
        for (int i = columns - 1; i >= x1 ; i--) {
            encrypted += twoDimensional[x1][i];
        }
        //top left -> bottom left
        for (int i = x1 + 1 ; i <= rows; i++) {
            encrypted += twoDimensional[i][y1];
        }
        // bottom left -> bottom right
        for (int i = y1 + 1; i <= columns - 1; i++) {
            encrypted += twoDimensional[rows][i];
        }

        //if more layers need to be printed
        //in each iteration we go one step inwards till we reach the middle, where the recursion ends
        if(columns - y1 > 0) {
            return encryptNegativeKey(twoDimensional, x1+1, rows -1, y1 +1, columns-1, encrypted);

        }
        return encrypted;
    }


    String decrypt(String cipherText){
        return cipherText;
    }
    //again two different methods for reading
    //and we will be needing also the height or width of the grid
    //the text will need to be put in a matrix then decrypted and then put back in a sentence

    @Override
    public String toString() {
        return "RouteCipher{" +
                "key=" + key +
                '}';
    }
}

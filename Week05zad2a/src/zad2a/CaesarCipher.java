package zad2a;

public class CaesarCipher {
    private int shiftLength;

    public CaesarCipher(int shiftLength){
        setShiftLength(shiftLength);
    }

    public int getShiftLength() {
        return shiftLength;
    }

    public void setShiftLength(int shiftLength) {
        this.shiftLength = shiftLength > 0 ? shiftLength : 1;
    }

     public String encode (String text){
        char[] letters = text.toCharArray();
         for (int i = 0; i < letters.length; i++) {
             int letterCode = letters[i];
             if (Character.isUpperCase(letterCode)) {
                 int bigACode = 'A';
                 int newLetterCode = (letterCode + shiftLength - bigACode) % 26 + bigACode;
                 letters[i] = (char) newLetterCode;
             } else {
                 int smallACode = 'a';
                 int newLetterCode = (letterCode + shiftLength - smallACode) % 26 + smallACode;
                 letters[i] = (char) newLetterCode;
             }
         }

         return new String(letters);
    }

    public String decode (String encodedText){
        char[] letters = encodedText.toCharArray();

        for (int i = 0; i < letters.length; i++) {
            int letterCode = letters[i];
            if (Character.isUpperCase(letterCode)) {
                int bigACode = 'A';
                int newLetterCode = (letterCode + (26 - shiftLength) - bigACode) % 26 + bigACode;
                letters[i] = (char) newLetterCode;
            } else {
                int smallACode = 'a';
                int newLetterCode = (letterCode + (26 - shiftLength) - smallACode) % 26 + smallACode;
                letters[i] = (char) newLetterCode;
            }
        }

        return new String(letters);
    }
}

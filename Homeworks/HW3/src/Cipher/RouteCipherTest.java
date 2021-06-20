package Cipher;

public class RouteCipherTest {
    public static void main(String[] args) {
        RouteCipher test = new RouteCipher(4);
        System.out.println(test.encrypt("THISISPLAINTEXT"));

        RouteCipher test1 = new RouteCipher(4);
        System.out.println(test1.encrypt("TIAEXTXTLSIH"));


    }

}

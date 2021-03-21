package zad1b;

import java.util.Scanner;

public class PhoneCoderTest {
    public static void main(String[] args) {
        PhoneCoder phoneCoder = new PhoneCoder(3);
        System.out.println(phoneCoder);
        Scanner input = new Scanner(System.in);

        System.out.print("Phone number: ");
        String phoneNumber = input.nextLine();
        System.out.printf("Encoded phone number: %s\n", phoneCoder.encode(phoneNumber));

        System.out.print("Encoded phone number: ");
        String codedPhoneNumber = input.nextLine();
        System.out.printf("Decoded phone number: %s\n", phoneCoder.decode(codedPhoneNumber));
    }
}

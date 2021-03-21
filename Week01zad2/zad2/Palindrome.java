package zad2;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a five-digit number: ");
        String userInput = input.nextLine();
        int number = Integer.parseInt(userInput);
        // number > 10000 && number < 99999
        //00111

        if (isNotFiveDigitNumber((userInput))) {
            System.err.println("Entered number is not five digits");
        } else {
            System.out.println("Entered number is five digits");
            //11111 % 10 = 1
            //11111 / 10 = 1111
            int fifthDigit = number % 10;
            number /= 10;
            int fourthDigit = number % 10;
            number /= 10;
            int thirdDigit = number % 10;
            number /= 10;
            int secondDigit = number % 10;
            number /= 10;
            int firstDigit = number % 10;

            String resultString;
            if (firstDigit == fifthDigit && secondDigit == fourthDigit)
            {
                resultString = "Is Palindrome.";
            } else {
                resultString = "Is not a Palindrome.";
            }
            System.out.println(resultString);
        }
    }

    private static boolean isNotFiveDigitNumber(String userInput) {
        return (userInput.startsWith("-") && userInput.length() !=5) ||
                (userInput.startsWith("-") && userInput.length() == 6);
    }

}

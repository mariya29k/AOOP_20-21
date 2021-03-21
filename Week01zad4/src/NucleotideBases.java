import java.util.Scanner;

public class NucleotideBases {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter a four digit number: ");
        String input = userInput.nextLine();
        int number = Integer.parseInt(input);

        if (isFourDigitNumber(input)) {
            int result;
            String nucleotideBases = "";
            while(number > 0) {
                result = number % 4;
                switch (result){
                    case 0: {
                        nucleotideBases = 'A' + nucleotideBases;
                        break;
                    }
                    case 1: {
                        nucleotideBases = 'C' + nucleotideBases;
                        break;
                    }
                    case 2: {
                        nucleotideBases = 'G' + nucleotideBases;
                        break;
                    }
                    case 3: {
                        nucleotideBases = 'T' + nucleotideBases;
                        break;
                    }
                }
                number /= 4;
            }
            System.out.println(nucleotideBases);
        } else {
            System.out.println("Entered number is not a four digit number.");
        }

    }

    private static boolean isFourDigitNumber(String userInput) {
        return (!userInput.startsWith("-") && userInput.length() ==4) ||
                (userInput.startsWith("-") && userInput.length() == 5);
    }
}

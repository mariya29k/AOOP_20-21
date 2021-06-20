import java.util.Scanner;

public class Hamming {
    public static void main(String[] args) {
        //user input
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int first = input.nextInt();

        System.out.print("Enter second number: ");
        int second = input.nextInt();


        //transform number to binary
        System.out.println("Decimal to binary of first number" + toBinary(first));
        System.out.println("Decimal to binary of second number" + toBinary(second));

        //find hammingDistance
        int hammingDistance = findHammingDistance(first, second);
        System.out.printf("Hamming distance between %d and %d is: %d", first, second, hammingDistance);


    }

    private static int findHammingDistance(int first, int second) {
        //first we calculate the XOR of 2 integers
        int num = first^second; //first^second is equivalent to (x|y) - (x&y)
        int helper = 0;

        //then we count the number of set bits
        while (num > 0) {
            helper += num & 1;
            num >>=1;
        }
        return helper;
    }

    private static String toBinary(int number) {
        String binary = " ";
        binary += Integer.toBinaryString(number);
        return binary;
    }
    //other way
//        public static void toBinary(int decimal) {
//            int binary[] = new int[40];
//            int index = 0;
//            while (decimal > 0) {
//                binary[index++] = decimal % 2;
//                decimal = decimal / 2;
//            }
//        }
    }

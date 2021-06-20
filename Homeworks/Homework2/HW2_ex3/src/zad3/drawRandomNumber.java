package zad3;

import java.text.NumberFormat;
import java.util.Random;

public class drawRandomNumber {
    public static void main(String[] args) {

        double countOne = 0,
                countTwo = 0,
                countThree= 0,
                countLoops = 0;

        NumberFormat probabilityOfNum = NumberFormat.getPercentInstance();
        probabilityOfNum.setMinimumFractionDigits(1);

        for (int i = 0; i < 60000; i++) {
            int number = drawingRandomNumber();

            if (number == 1 || number == 2) {
                countOne++;
            } else if (number >= 3 && number <= 5) {
                countTwo++;
            } else {
                countThree++;
            }

            if (countLoops == 10000) {
                System.out.print("The chances of drawing number between [1,3] for 10,000 loops: \n");
                System.out.print("Probability for drawing 1: " + probabilityOfNum.format(countOne /10000));
                System.out.print("\nProbability for drawing 2: " + probabilityOfNum.format(countTwo / 10000));
                System.out.print("\nProbability for drawing 3: "+ probabilityOfNum.format(countThree / 10000));
            }
            countLoops++;

        }

        //Calculating percentage depends on number of loops made, for 10,000 divide by 10, for
        //60,000 divide by 60
        System.out.print("\nThe chances of drawing number between [1,3] for 60,000 loops: ");
        System.out.print("\nProbability for drawing 1: " + probabilityOfNum.format(countOne /60000));
        System.out.print("\nProbability for drawing 2: " + probabilityOfNum.format(countTwo /60000));
        System.out.print("\nProbability for drawing 3: "+ probabilityOfNum.format(countThree /60000));

    }

    public static int drawingRandomNumber(){
        Random random = new Random();
        //for P(1) = 0.2, P(2) = 0.3, P(3) = 0.5 *by condition* we use 10 random numbers and we generate them in the for loop
        return 1 + random.nextInt(10);
    }
}

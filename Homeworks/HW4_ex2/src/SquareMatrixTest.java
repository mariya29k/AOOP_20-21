import java.util.Random;

public class SquareMatrixTest {
    public static void main(String[] args) {
        SquareMatrix squareMatrix = new SquareMatrix(generateMatrix());
        squareMatrix.printAll();

    }
    //generate squareMatrix with dimension between [2,12] and numbers in matrix between [0,8]
    public static int[][] generateMatrix(){
        Random number = new Random();
        int dimension = number.nextInt(11) + 2; //+2 because the interval is >=2 and
                                                    // bound is 11 because <=12 (if randomNum is 10
                                                    // when we add 2 we'll get 12

        int[][] squareMatrix = new int[dimension][dimension];

        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                squareMatrix[i][j] = number.nextInt(9); //[0,8]
            }
        }

        return squareMatrix;
    }

}

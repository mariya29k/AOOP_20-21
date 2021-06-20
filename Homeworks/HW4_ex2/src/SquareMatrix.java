import java.util.Arrays;

public class SquareMatrix {
    private int[][] dataArray;

    public SquareMatrix(){
        this(new int[0][0]);
    }

    public SquareMatrix(int[][] dataArray) {
        setDataArray(dataArray);
    }

    public SquareMatrix(SquareMatrix matrix){
        this(matrix.dataArray);
    }

    public int[][] getDataArray() { //deep copy
        int[][] copy = new int[dataArray.length][dataArray.length];

        for (int i = 0; i < copy.length; i++) {
            for (int j = 0; j < copy.length; j++) { //nxn
                copy[i][j] = dataArray[i][j];
            }
        }
        return copy;
    }

    public void setDataArray(int[][] dataArray) {
        //check if null
        if (dataArray !=null) {
           this.dataArray = new int[dataArray.length][dataArray.length];

            for (int i = 0; i < dataArray.length; i++) {
                for (int j = 0; j < dataArray.length; j++) {
                    this.dataArray[i][j] = dataArray[i][j];
                }
            }
        } else {
            this.dataArray = new int[0][0];
        }
    }

    public int findMaxSum(){
        int maxSumHelper = 0; //int_min

        for (int i = 0; i < dataArray.length - 1; i++) {
            for (int j = 0; j < dataArray.length - 1; j++) {
                //first, we calculate the sum of the current matrix 2x2
                //1 2
                //3 4 => 10
                int sum = dataArray[i][j] + dataArray[i][j+1] + dataArray[i+1][j] + dataArray[i+1][j+1];

                //if sum is greater than the max sum then maxSumHelper becomes equal to sum and then we go
                //through all submatrixes 2x2 in the squareMatrix
                if (sum > maxSumHelper) {
                    maxSumHelper = sum;
                }
            }
        }

        return maxSumHelper;
    }

    public void printAll(){
        //print maxSum of submatrix 2x2 in the array
        int maxSum = findMaxSum();
        System.out.println("Max sum: " + maxSum);

        //print rows and columns of all submatrix with sum == maxSum
        //same logic as findMaxSum
        for (int i = 0; i < dataArray.length - 1; i++) {
            for (int j = 0; j < dataArray.length - 1; j++) {
                int sum = dataArray[i][j] + dataArray[i][j+1] + dataArray[i+1][j] + dataArray[i+1][j+1];

                if (sum == maxSum) {
                    System.out.printf("[%d, %d]", i, j);
                    System.out.println();
                }
            }
        }
    }

    @Override
    public String toString() {
        String temp = " ";
        for (int i = 0; i < dataArray.length; i++) {
            for (int j = 0; j < dataArray.length; j++) {
                temp += dataArray[i][j] + " ";
            }
            temp += "\n";
        }
        return  temp;
    }


}

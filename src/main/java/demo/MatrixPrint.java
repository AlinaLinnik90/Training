package demo;

import java.util.Arrays;

public class MatrixPrint {
    public static void main(String[] args) {


        int[][] myNumbers = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15}, {16, 17, 18, 19, 20}, {21, 22, 23, 24, 25}};

        for (int i = 0; i < myNumbers.length; i++) {
            for (int j = 0; j < myNumbers[i].length; j++) {
                if (i == j) {
                    System.out.print(" * ");
                } else if (i == 0 & j == 4) {
                    System.out.print(" * ");
                } else if (i == 1 & j == 3) {
                    System.out.print(" * ");
                } else if (i == 3 & j == 1) {
                    System.out.print(" * ");
                } else if (i == 4 & j == 0) {
                    System.out.print(" * ");
                }
                else if (myNumbers[i][j]<10) {
                    System.out.print(" "+ myNumbers[i][j]+" ");
                }
                else

            System.out.print(myNumbers[i][j]+" ");
        }
        System.out.println();
    }

        int[] myArray;
        myArray = new int[5];
        myArray[0] = 1;
        myArray[1] = 3;
        System.out.println("Array Elements : " + Arrays.toString(myArray));

        int array_2d[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println("The two-dimensional array is as follows:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(array_2d[i][j]+" ");
            }
            System.out.println();
        }
    }
}





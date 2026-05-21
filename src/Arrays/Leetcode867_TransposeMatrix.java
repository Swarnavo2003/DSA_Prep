package Arrays;

import java.util.Scanner;

public class Leetcode867_TransposeMatrix {
    public static int[][] transpose(int[][] matrix) {
        int totalRows = matrix.length, totalCols = matrix[0].length;
        int newTotalRows = totalCols, newTotalCols = totalRows;
        int[][] result = new int[newTotalRows][newTotalCols];
        for(int row = 0; row < totalRows; row++) {
            for(int col = 0; col < totalCols; col++) {
                result[col][row] = matrix[row][col];
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalRows = sc.nextInt(), totalCols = sc.nextInt();
        int[][] nums = new int[totalRows][totalCols];

        for(int i = 0; i < totalRows; i++) {
            for(int j = 0; j < totalCols; j++) {
                nums[i][j] = sc.nextInt();
            }
        }

        int newTotalRows = totalCols, newTotalCols = totalRows;
        int[][] result = transpose(nums);
        for(int i = 0; i < newTotalRows; i++) {
            for(int j = 0; j < newTotalCols; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}

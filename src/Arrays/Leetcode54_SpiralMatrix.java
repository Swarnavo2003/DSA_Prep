package Arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Leetcode54_SpiralMatrix {
    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        int startRow = 0, endRow = matrix.length - 1, startCol = 0, endCol = matrix[0].length - 1;
        while(startRow <= endRow && startCol <= endCol) {
            for(int i = startCol; i <= endCol; i++) {
                result.add(matrix[startRow][i]);
            }
            startRow++;

            for(int i = startRow; i <= endRow; i++) {
                result.add(matrix[i][endCol]);
            }
            endCol--;

            if(startRow <= endRow) {
                for(int i = endCol; i >= startCol; i--) {
                    result.add(matrix[endRow][i]);
                }
                endRow--;
            }
            if(startCol <= endCol) {
                for (int i = endRow; i >= startRow; i--) {
                    result.add(matrix[i][startCol]);
                }
                startCol++;
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

        List<Integer> result = spiralOrder(nums);
        System.out.println(result);

        sc.close();
    }
}

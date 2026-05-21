package Arrays;

import java.util.Scanner;

public class Leetcode48_RotateImage {
    public static void rotate(int[][] matrix) {
        for(int row = 0; row < matrix.length; row++) {
            for(int col = row + 1; col < matrix[0].length; col++) {
                int temp = matrix[row][col];
                matrix[row][col] = matrix[col][row];
                matrix[col][row] = temp;
            }
        }

        for(int[] nums : matrix) {
            int i = 0, j = nums.length - 1;
            while(i < j) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;

                i++;
                j--;
            }
        }
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

        rotate(nums);

        for(int i = 0; i < totalRows; i++) {
            for(int j = 0; j < totalCols; j++) {
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}

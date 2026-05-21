package Arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WavePrintMatrix {
    public static  List<Integer> wavePrint(int[][] matrix, int m, int n) {
        List<Integer> result = new ArrayList<>();
        for(int col = 0; col < n; col++) {
            if(col % 2 == 0) {
                for(int row = 0; row < m; row++) {
                    result.add(matrix[row][col]);
                }
            } else {
                for(int row = m - 1; row >= 0; row--) {
                    result.add(matrix[row][col]);
                }
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt(), n = sc.nextInt();
        int[][] nums = new int[m][n];

        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                nums[i][j] = sc.nextInt();
            }
        }

        List<Integer> result = wavePrint(nums, m, n);
        System.out.println(result);

        sc.close();
    }
}

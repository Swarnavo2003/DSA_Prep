package Arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SumOfEachColumn2DArray {
    public static List<Integer> columnSum(int[][] nums) {
        List<Integer> result = new ArrayList<>();
        int m = nums.length, n = nums[0].length;
        for(int col = 0; col < n; col++) {
            int sum = 0;
            for(int row = 0; row < m; row++) {
                sum += nums[row][col];
            }
            result.add(sum);
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(), m = sc.nextInt();
        int[][] nums = new int[n][m];

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                nums[i][j] = sc.nextInt();
            }
        }

        List<Integer> result = columnSum(nums);
        System.out.println(result);

        sc.close();
    }
}

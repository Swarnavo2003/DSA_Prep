package Arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SumOfEachRows2DArray {
    public static List<Integer> rowSum(int[][] nums) {
        List<Integer> result = new ArrayList<>();
        for(int i = 0; i < nums.length; i++) {
            int sum = 0;
            for(int j = 0; j < nums[i].length; j++) {
                sum += nums[i][j];
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

        List<Integer> result = rowSum(nums);
        System.out.println(result);

        sc.close();
    }
}

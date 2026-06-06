package TwoPointers;

import java.util.Arrays;
import java.util.Scanner;

public class Leetcode977_SquareOfSortedArray {
    public static int[] sortedSquares(int[] nums) {
        int[] res = new int[nums.length];

        int i = 0, j = nums.length - 1, k = nums.length - 1;
        while(i <= j) {
            if(Math.abs(nums[i]) > Math.abs(nums[j])) {
                res[k] = nums[i] * nums[i];
                i = i + 1;
            } else {
                res[k] = nums[j] * nums[j];
                j = j - 1;
            }
            k = k - 1;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int[] res = sortedSquares(nums);
        System.out.println(Arrays.toString(res));
    }
}

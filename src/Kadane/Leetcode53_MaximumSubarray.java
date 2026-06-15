package Kadane;

import java.util.Scanner;

public class Leetcode53_MaximumSubarray {
    public static int maxSubArray(int[] nums) {
        int sum = 0, maxi = Integer.MIN_VALUE;
        for(int num : nums) {
            sum = sum + num;
            maxi = Math.max(sum, maxi);
            sum = Math.max(sum, 0);
        }
        return maxi;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int max = maxSubArray(nums);
        System.out.println(max);
    }
}

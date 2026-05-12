package SlidingWindow;

import java.util.Scanner;

public class Leetcode53_MaximumSubarray {
    public static int maxSubArray(int[] nums) {
        int sum = 0, maxSum = Integer.MIN_VALUE;
        for(int num : nums) {
            sum += num;
            if(sum > maxSum) {
                maxSum = sum;
            }
            if(sum < 0) sum = 0;
        }
        return maxSum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] nums = new int[n];
        for(int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int maxSum = maxSubArray(nums);
        System.out.println(maxSum);

        sc.close();
    }
}

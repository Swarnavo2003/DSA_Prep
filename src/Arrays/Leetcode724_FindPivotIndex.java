package Arrays;

import java.util.Scanner;

public class Leetcode724_FindPivotIndex {
    static int pivotIndex(int[] nums) {
        int totalSum = 0;
        for(int num : nums) {
            totalSum += num;
        }

        int leftSum = 0;
        for(int i = 0; i < nums.length; i++) {
            if(leftSum == totalSum - leftSum - nums[i]) {
                return i;
            }
            leftSum += nums[i];
        }

        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] nums = new int[n];
        for(int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int index = pivotIndex(nums);
        System.out.println(index);
    }
}

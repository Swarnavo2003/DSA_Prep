package TwoPointers;

import java.util.Arrays;
import java.util.Scanner;

public class Leetcode167_TwoSum2InputSortedArray {
    /*
    Problem: Find two numbers in a sorted array that add up to target (1-based indices)

    Method: Two Pointers

    Algorithm:
    - Initialize two pointers:
        → i = 0 (start)
        → j = n - 1 (end)
    - While i < j:
        → calculate sum = numbers[i] + numbers[j]
        → if sum > target → move j--
        → if sum < target → move i++
        → if equal → return [i+1, j+1]
    - If no pair found → return [-1, -1]

    Key Idea:
    - Use sorted property to adjust pointers efficiently
    - Reduce search space from both ends

    Complexity:
    - Time: O(n)
    - Space: O(1)

    Pattern:
    - Two Pointers

    Interview Note:
    - Better than HashMap when array is sorted
    - No extra space needed
    */
    public static int[] twoSum(int[] numbers, int target) {
        int i = 0, j = numbers.length - 1, n = numbers.length;
        while (i < j) {
            int sum = numbers[i] + numbers[j];
            if (sum > target) {
                j = j - 1;
            } else if (sum < target) {
                i = i + 1;
            } else {
                return new int[]{i + 1, j + 1};
            }
        }
        return new int[]{-1, -1};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i = 0 ; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        int[] ans = twoSum(nums, target);
        System.out.println(Arrays.toString(ans));
    }
}

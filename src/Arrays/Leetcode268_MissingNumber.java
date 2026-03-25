package Arrays;

public class Leetcode268_MissingNumber {
    /*
    Problem: Find the missing number in an array containing numbers from 0 to n

    Algorithm:
    - Let n be the length of the array
    - Calculate sum of all elements in the array
    - Calculate expected sum of numbers from 0 to n using formula:
        → n * (n + 1) / 2
    - Subtract actual sum from expected sum
    - The result is the missing number

    Key Idea:
    - Use mathematical formula to avoid extra space or sorting
    - Difference between expected and actual sum gives missing element

    Pattern:
    - Math / Summation Formula
    */
    public static int missingNumber(int[] nums) {
        int n = nums.length, sum = 0;
        for (int num : nums) {
            sum += num;
        }

        int rangeSum = ((n * (n + 1)) / 2 );

        return rangeSum - sum;
    }
    public static void main(String[] args) {
        int[] nums1 = {3,0,1};
        System.out.println(missingNumber(nums1));

        int[] nums2 = {0,1};
        System.out.println(missingNumber(nums2));

        int[] nums3 = {9,6,4,2,3,5,7,0,1};
        System.out.println(missingNumber(nums3));
    }
}

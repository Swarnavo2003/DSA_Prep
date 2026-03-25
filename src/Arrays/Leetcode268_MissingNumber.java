package Arrays;

import java.util.Arrays;

public class Leetcode268_MissingNumber {
    /*
    Problem: Find the missing number in an array containing numbers from 0 to n

    Method 1: Math (Summation Formula)

    Algorithm:
    - Let n be the length of the array
    - Calculate sum of all elements in the array
    - Calculate expected sum using formula:
        → n * (n + 1) / 2
    - Subtract actual sum from expected sum
    - Return the result

    Key Idea:
    - Difference between expected and actual sum gives missing number
    - Avoids extra space and sorting

    Complexity:
    - Time: O(n)
    - Space: O(1)
    */

    public static int missingNumber(int[] nums) {
        int n = nums.length, sum = 0;
        for (int num : nums) {
            sum += num;
        }

        int rangeSum = ((n * (n + 1)) / 2 );

        return rangeSum - sum;
    }

    /*
    Method 2: Hashing (Extra Array)

    Algorithm:
    - Create a temp array of size n + 1 initialized with 0
    - Traverse input array:
        → mark temp[nums[i]] = 1
    - Traverse temp array:
        → index with value 0 is the missing number
    - Return that index

    Key Idea:
    - Use extra space to track presence of elements
    - Missing index will remain unmarked

    Complexity:
    - Time: O(n)
    - Space: O(n)
     */

    public static int missingNumber2(int[] nums) {
         int[] temp = new int[nums.length + 1];
         Arrays.fill(temp, 0);

         for(int i = 0; i < nums.length; i++) {
             temp[nums[i]] = 1;
         }

         int res = 0;
         for(int i = 0; i < temp.length; i++) {
             if(temp[i] == 0) res = i;
         }

         return res;
    }

    /*
    Pattern:
    - Math → Summation Formula
    - Hashing → Frequency / Presence Array

    Interview Note:
    - Prefer Math method (optimal)
    - Hashing is easier to understand but uses extra space
    */
    public static void main(String[] args) {
        int[] nums1 = {3,0,1};
        System.out.println(missingNumber(nums1));
        System.out.println(missingNumber2(nums1));

        int[] nums2 = {0,1};
        System.out.println(missingNumber(nums2));
        System.out.println(missingNumber2(nums2));

        int[] nums3 = {9,6,4,2,3,5,7,0,1};
        System.out.println(missingNumber(nums3));
        System.out.println(missingNumber2(nums3));
    }
}

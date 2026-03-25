package Arrays;

import java.util.Arrays;

public class Leetcode283_MoveZeroes {
    /*
    Problem: Move all zeroes to the end while maintaining the relative order of non-zero elements

    Algorithm:
    - Use two pointers i and j
    - j tracks the position to place next non-zero element
    - Traverse array using i from 0 to n-1
    - If nums[i] != 0:
        → swap nums[i] with nums[j]
        → increment j
    - Continue till end

    Key Idea:
    - Push all non-zero elements forward
    - Zeroes automatically shift to the end

    Pattern:
    - Two Pointers (In-place swap / stable partition)
    */
    public static void moveZeroes(int[] nums) {
        int j = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;

                j = j + 1;
            }
        }
    }
    public static void main(String[] args) {
        int[] nums1 = {0,1,0,3,12};
        moveZeroes(nums1);
        System.out.println(Arrays.toString(nums1));

        int[] nums2 = {0};
        moveZeroes(nums2);
        System.out.println(Arrays.toString(nums2));
    }
}

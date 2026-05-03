package TwoPointers;

import java.util.Arrays;

public class Leetcode75_SortColor {
    static void sortColors(int[] nums) {
        int start = 0, end = nums.length - 1, mid = 0;
        while(mid <= end) {
            if(nums[mid] == 1) mid++;
            else if(nums[mid] == 2) {
                int temp = nums[mid];
                nums[mid] = nums[end];
                nums[end] = temp;
                end--;
            } else {
                int temp = nums[mid];
                nums[mid] = nums[start];
                nums[start] = temp;
                start++;
                mid++;
            }
        }
    }
    public static void main(String[] args) {
        int[] nums = {2,0,1};
        sortColors(nums);
        System.out.println(Arrays.toString(nums));
    }
}

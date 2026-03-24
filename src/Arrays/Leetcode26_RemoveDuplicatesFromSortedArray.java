package Arrays;

public class Leetcode26_RemoveDuplicatesFromSortedArray {
    /*
    Problem: Remove duplicates from a sorted array in-place and return new length

    Algorithm:
    - Use two pointers i and k
    - k tracks the index of last unique element
    - Start i from index 1 (since first element is always unique)
    - Traverse array:
    → if nums[i] != nums[k]:
        - increment k
        - assign nums[k] = nums[i]
    - Continue till end
    - Return k + 1 as the count of unique elements

    Key Idea:
    - Since array is sorted, duplicates are adjacent
    - Compare with last unique element to filter duplicates

    Pattern:
    - Two Pointers (In-place overwrite)
    */
    public static int removeDuplicates(int[] nums) {
        int k = 0;
        for(int i = 1; i < nums.length; i++) {
            if(nums[i] != nums[k]) {
                k = k + 1;
                nums[k] = nums[i];
            }
        }
        return k + 1;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 1, 2};
        System.out.println(removeDuplicates(nums1));

        int[] nums2 = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(nums2));
    }
}

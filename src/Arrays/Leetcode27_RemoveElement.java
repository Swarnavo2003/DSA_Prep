package Arrays;

public class Leetcode27_RemoveElement {
    /*
    Problem: Remove all occurrences of 'val' in-place and return new length

    Algorithm:
    - Use two pointers approach
    - Pointer k keeps track of position to place next valid element
    - Traverse array using i from 0 to n-1
    - If nums[i] != val:
        → copy nums[i] to nums[k]
        → increment k
    - Ignore elements equal to val
    - Return k as new length

    Key Idea:
    - Overwrite unwanted elements while maintaining order
    - No extra space used (in-place)

    Pattern:
    - Two Pointers (In-place filtering / overwrite)
    */
    public static int removeElement(int[] nums, int val) {
        int k = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != val) {
                nums[k] = nums[i];
                k = k + 1;
            }
        }
        return k;
    }
    public static void main(String[] args) {
        int[] nums1 = {3,2,2,3};
        int val1 = 2;
        System.out.println(removeElement(nums1, val1));

        int[] nums2 = {0,1,2,2,3,0,4,2};
        int val2 = 2;
        System.out.println(removeElement(nums2, val2));
    }
}

package Arrays;

public class Leetcode485_MaxConsecutiveOnes {
    /*
    Problem: Find the maximum number of consecutive 1s in the array

    Algorithm:
    - Initialize count = 0 and maxCount = 0
    - Traverse each element in the array
    - If current element is 1:
        → increment count
    - Else:
        → reset count to 0
    - After each step, update maxCount with maximum of maxCount and count
    - Return maxCount

    Key Idea:
    - Keep counting consecutive 1s
    - Reset the count whenever a 0 appears
    - Track the highest count seen so far

    Pattern:
    - Linear Traversal / Counting
    */
    public static int findMaxConsecutiveOnes(int[] nums) {
        int count = 0, maxCount = 0;
        for(int num : nums) {
            if(num == 1) {
                count = count + 1;
            } else {
                count = 0;
            }
            maxCount = Math.max(maxCount, count);
        }
        return maxCount;
    }
    public static void main(String[] args) {
        int[] nums1 = {1,1,0,1,1,1};
        System.out.println(findMaxConsecutiveOnes(nums1));

        int[] nums2 = {1,0,1,1,0,1};
        System.out.println(findMaxConsecutiveOnes(nums2));
    }
}

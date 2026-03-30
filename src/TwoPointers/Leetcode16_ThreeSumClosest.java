package TwoPointers;

import java.util.*;

public class Leetcode16_ThreeSumClosest {
    /*
    Problem: Find sum of 3 numbers closest to target

    Method: Sorting + Two Pointers

    Algorithm:
    - Sort array
    - Initialize res with any 3 elements
    - For each i:
        → left = i+1, right = n-1
        → while left < right:
            → compute sum
            → update res if closer to target
            → if sum < target → left++
            → else → right--
    - Return res

    Key Idea:
    - Track closest sum using difference
    - Use two pointers to reduce search

    Complexity:
    - Time: O(n²)
    - Space: O(1)

    Pattern:
    - Two Pointers
    - Sorting

    Interview Note:
    - No need to store all triplets
    - Focus on minimizing |sum - target|
    */
    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int res = nums[0] + nums[1] + nums[nums.length - 1];
        for(int i = 0; i < nums.length - 2; i++) {
            int left = i + 1;
            int right = nums.length - 1;

            while(left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if(sum < target) left++;
                else right--;
                if(Math.abs(sum - target) < Math.abs(res - target)) {
                    res = sum;
                }
            }
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }

        int target = sc.nextInt();
        System.out.println(threeSumClosest(nums, target));
    }
}

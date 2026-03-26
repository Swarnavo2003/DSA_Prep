package TwoPointers;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Leetcode1_TwoSum {
    /*
    Problem: Find two indices such that nums[i] + nums[j] = target

    Method: HashMap

    Algorithm:
    - Create a map to store number → index
    - Traverse array:
        → complement = target - nums[i]
        → if complement exists in map → return indices
        → else store nums[i] in map
    - If no pair found → return [-1, -1]

    Key Idea:
    - Store visited numbers for quick lookup
    - Check complement before inserting current element

    Complexity:
    - Time: O(n)
    - Space: O(n)

    Pattern:
    - Hashing

    Interview Note:
    - Avoid brute force (O(n²))
    - HashMap gives O(1) lookup
    */
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            int compliment = target - nums[i];
            if(map.containsKey(compliment)) {
                return new int[]{map.get(compliment), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{-1, -1};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        int[] res = twoSum(nums, target);
        System.out.println(Arrays.toString(res));
        sc.close();
    }
}

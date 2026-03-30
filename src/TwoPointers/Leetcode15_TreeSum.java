package TwoPointers;

import java.util.*;

public class Leetcode15_TreeSum {
    /*
    Problem: Find all unique triplets such that nums[i] + nums[j] + nums[k] = 0

    Method: Sorting + Two Pointers

    Algorithm:
    - Sort the array
    - Traverse with index i:
        → fix nums[i]
        → use two pointers:
            → left = i + 1
            → right = n - 1
        → while left < right:
            → calculate sum
            → if sum == 0 → store triplet, move both pointers
            → if sum < 0 → left++
            → if sum > 0 → right--
    - Use a Set to avoid duplicate triplets
    - Return result list

    Key Idea:
    - Reduce 3Sum to 2Sum using sorting
    - Two pointers help find pairs efficiently

    Complexity:
    - Time: O(n²)
    - Space: O(n) (for storing results)

    Pattern:
    - Two Pointers
    - Sorting

    Interview Note:
    - Sorting is required for two-pointer approach
    - Better approach avoids Set by skipping duplicates directly
    */
    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);

        Set<List<Integer>> set = new HashSet<>();

        for(int i = 0; i < nums.length - 2; i++) {
            int left = i + 1;
            int right = nums.length - 1;

            while(left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if(sum == 0) {
                    set.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    right--;
                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return new ArrayList<>(set);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i = 0; i < nums.length; i++)  {
            nums[i] = sc.nextInt();
        }

        List<List<Integer>> res = threeSum(nums);
        System.out.println(res);

        sc.close();
    }
}

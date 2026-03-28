package Arrays;

import java.util.*;

public class Leetcode229_MajorityElement2 {
    /*
    Problem: Find all elements that appear more than n/3 times

    Method: HashMap

    Algorithm:
    - Create a map to store frequency of elements
    - Traverse array and count occurrences
    - Traverse map:
        → if count > n/3 → add to result list
    - Return result list

    Key Idea:
    - At most 2 elements can appear more than n/3 times
    - Use frequency counting to identify them

    Complexity:
    - Time: O(n)
    - Space: O(n)

    ---

    Pattern:
    - Hashing

    Interview Note:
    - Optimal solution uses extended Moore’s Voting (O(1) space)
    - HashMap is simpler but uses extra space
    */
    public static List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        List<Integer> ans = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        for(int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for(int i : map.keySet()) {
            if(map.get(i) > n / 3) {
                ans.add(i);
            }
        }
        return  ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }
        List<Integer> ans = majorityElement(nums);
        System.out.println(ans);
    }
}

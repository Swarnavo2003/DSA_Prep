package Arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Leetcode169_MajorityElement {
    /*
    Problem: Find the element that appears more than n/2 times

    Method: Moore’s Voting Algorithm (Optimal)

    Algorithm:
    - Initialize:
        → candidate = nums[0]
        → vote = 0
    - Traverse array:
        → if vote == 0 → set candidate = current element
        → if current == candidate → vote++
        → else → vote--
    - Return candidate

    Key Idea:
    - Majority element dominates and cancels out others
    - Final candidate is guaranteed majority

    Complexity:
    - Time: O(n)
    - Space: O(1)
     */
    public static int majorityElement(int[] nums) {
        int candidate = nums[0];
        int vote = 0;
        for(int num : nums) {
            if(num == candidate) {
                vote = vote + 1;
            } else {
                vote = vote - 1;
                if(vote == 0) {
                    candidate = num;
                    vote = vote + 1;
                }
            }
        }
        return candidate;
    }

    /*
    Alternate Method: HashMap

    Algorithm:
    - Count frequency of each element using map
    - Return element with count > n/2

    Complexity:
    - Time: O(n)
    - Space: O(n)

    Pattern:
    - Greedy
    - Voting Algorithm

    Interview Note:
    - Moore’s Voting is optimal (no extra space)
    - Works only when majority element is guaranteed
     */
    public static int majorityElement2(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int res = 0;
        for(int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for(int num : map.keySet()) {
            if(map.get(num) > nums.length / 2) {
                return num;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println(majorityElement(nums));
        sc.close();
    }
}

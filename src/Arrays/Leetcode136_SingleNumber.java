package Arrays;

import java.util.HashMap;
import java.util.Map;

public class Leetcode136_SingleNumber {
    /*
    Problem: Find the element that appears only once, while all others appear twice

    Method 1: XOR

    Algorithm:
    - Initialize result = 0
    - Traverse array:
        → result = result ^ num
    - Return result

    Key Idea:
    - XOR properties:
        → a ^ a = 0 (duplicates cancel out)
        → a ^ 0 = a
    - All duplicate elements cancel each other
    - Only unique element remains

    Complexity:
    - Time: O(n)
    - Space: O(1)
    */
    public static int singleNumber(int[] nums) {
        int res = 0;
        for(int num : nums) {
            res ^= num;
        }
        return res;
    }

    /*
    Method 2: HashMap

    Algorithm:
    - Create a HashMap to store frequency
    - Traverse array:
        → update count of each element
    - Traverse map:
        → return element with frequency = 1

    Key Idea:
    - Store occurrence count
    - Unique element has frequency 1

    Complexity:
    - Time: O(n)
    - Space: O(n)

    ---

    Pattern:
    - XOR → Bit Manipulation (optimal)
    - HashMap → Hashing / Frequency Count

    Interview Note:
    - Prefer XOR when asked for optimal solution
    - HashMap is easier but uses extra space
    */
    public static int singleNumber2(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1 );
        }

        for(int key : map.keySet()) {
            if(map.get(key) == 1) {
                return key;
            }
        }

        return -1;
    }

    /*
    Pattern:
    - XOR → Bit Manipulation (optimal)
    - HashMap → Hashing / Frequency Count

    Interview Note:
    - Prefer XOR when asked for optimal solution
    - HashMap is easier but uses extra space
     */
    public static void main(String[] args) {
        int[] nums1 = {2,2,1};
        System.out.println(singleNumber(nums1));
        System.out.println(singleNumber2(nums1));

        int[] nums2 = {4,1,2,1,2};
        System.out.println(singleNumber(nums2));
        System.out.println(singleNumber2(nums2));

        int[] nums3 = {1};
        System.out.println(singleNumber(nums3));
        System.out.println(singleNumber2(nums3));
    }
}

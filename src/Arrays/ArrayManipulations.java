package Arrays;

import java.util.*;

public class ArrayManipulations {
    static void reverseArray(int[] nums) {
        int left = 0, right = nums.length - 1;
        while(left <= right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;

            left++;
            right--;
        }
    }
    static void rightShiftByOnePos(int[] nums) {
        int temp = nums[nums.length - 1];
        for(int i = nums.length - 2; i >= 0; i--) {
            nums[i + 1] = nums[i];
        }
        nums[0] = temp;
    }
    static int findMod(int[] nums) {
        Map<Integer, Integer> freq = new HashMap<>();
        for(int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        int maxFreq = -1;
        int maxFreqKey = -1;
        for(int key : freq.keySet()) {
            int currentKeyFreq = freq.get(key);

            if(currentKeyFreq > maxFreq) {
                maxFreqKey = key;
                maxFreq = currentKeyFreq;
            }
        }
        return maxFreqKey;
    }
    static int[] findHighestAndLowestFreq(int[] nums) {
        Map<Integer, Integer> freq = new HashMap<>();
        for(int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        int maxFreq = Integer.MIN_VALUE, minFreq = Integer.MAX_VALUE;
        int maxFreqKey = -1, minFreqKey = -1;
        for(int key : freq.keySet()) {
            int currentKeyFreq = freq.get(key);

            if(currentKeyFreq > maxFreq) {
                maxFreqKey = key;
                maxFreq = currentKeyFreq;
            }
            if(currentKeyFreq < minFreq) {
                minFreqKey = key;
                minFreq = currentKeyFreq;
            }
        }
//        List<Integer> list = new ArrayList<>();
//        list.add(maxFreqKey);
//        list.add(minFreqKey);

        int[] res = {maxFreqKey, minFreqKey};
        return res;
    }
    static void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        reverseArray(nums, 0, n - 1);
        reverseArray(nums, 0, k - 1);
        reverseArray(nums, k, n - 1);
    }
    static void reverseArray(int[] nums, int start, int end) {
        while(start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
    static int[] union(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();

        for(int x : nums1) set.add(x);
        for(int x : nums2) set.add(x);

        int[] result = new int[set.size()];
        int i = 0;
        for(int x : set) {
            result[i++] = x;
        }
        return result;
    }
    public static void main(String[] args) {
//        int[] nums = {1, 2, 3, 4, 5};
//        reverseArray(nums);
//        System.out.println(Arrays.toString(nums));

//        int[] nums = {1, 2, 3, 4, 5};
//        rightShiftByOnePos(nums);
//        System.out.println(Arrays.toString(nums));

//        int[] nums = {1, 2, 2, 3, 3, 3, 4, 5, 5};
//        System.out.println(findMod(nums));
//        int[] res = findHighestAndLowestFreq(nums);
//        System.out.println(Arrays.toString(res));

//        int[] nums = { 1, 2, 3, 4, 5, 6, 7};
//        rotate(nums, 3);
//        System.out.println(Arrays.toString(nums));

        int[] nums1 = {1, 2, 3, 4, 5};
        int[] nums2 = {2, 5, 6, 7};
        int[] res = union(nums1, nums2);
        System.out.println(Arrays.toString(res));
    }
}

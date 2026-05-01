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
    public static void main(String[] args) {
//        int[] nums = {1, 2, 3, 4, 5};
//        reverseArray(nums);
//        System.out.println(Arrays.toString(nums));

//        int[] nums = {1, 2, 3, 4, 5};
//        rightShiftByOnePos(nums);
//        System.out.println(Arrays.toString(nums));

        int[] nums = {1, 2, 2, 3, 3, 3, 4, 5, 5};
        System.out.println(findMod(nums));
        int[] res = findHighestAndLowestFreq(nums);
        System.out.println(Arrays.toString(res));
    }
}

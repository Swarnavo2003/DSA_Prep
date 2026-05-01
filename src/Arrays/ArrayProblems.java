package Arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ArrayProblems {
    public static int average(int[] nums) {
        int sum = 0;
        for(int num : nums) {
            sum += num;
        }
        return sum / nums.length;
    }
    public static int[] multiplyBy10(int[] nums) {
        for(int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * 10;
        }
        return nums;
    }
    public static int linearSearch(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == target) {
                return i;
            }
        }
        return -1;
    }
    public static int maxNumber(int[] nums) {
        int maxi = Integer.MIN_VALUE;
        for(int num : nums) {
            maxi = Math.max(num, maxi);
        }
        return maxi;
    }
    public static int sumOfPositiveNegative(int[] nums) {
        int posSum = 0, negSum = 0;
        for(int num : nums) {
            if(num < 0) negSum += num;
            else posSum += num;
        }
        return posSum + negSum;
    }
    public static int[] countZeroAndOne(int[] nums) {
        int zeroCnt = 0, oneCnt = 0;
        for(int num : nums) {
            if(num == 0) zeroCnt++;
            else oneCnt++;
        }
        return new int[]{oneCnt, zeroCnt};
    }
    public static int getUnsortedArray(int[] nums) {
        for(int i = 0; i < nums.length - 1; i++) {
            if(nums[i + 1] <= nums[i]) {
                return nums[i + 1];
            }
        }
        return -1;
    }
    public static void swap(int num1, int num2) {
        int temp = num1;
        num1 = num2;
        num2 = temp;
    }
    public static void swapAlternate(int[] nums) {
        if(nums.length % 2 == 0) {
            for (int i = 0; i < nums.length; i = i + 2) {
                int temp = nums[i];
                nums[i] = nums[i + 1];
                nums[i + 1] = temp;
            }
        } else {
            for (int i = 0; i < nums.length - 1; i = i + 2) {
                int temp = nums[i];
                nums[i] = nums[i + 1];
                nums[i + 1] = temp;
            }
        }
    }
    public static boolean arrayIntersection(int[] nums1, int[] nums2) {
        int n = nums1.length, m = nums2.length;
        int i = 0, j = 0;
        while(i < n && j < m) {
            if(nums1[i] == nums2[j]) {
                i++;
                j++;
            } else if(nums1[i] < nums2[j]) {
                i++;
            } else {
                j++;
            }
        }
        return i == n;
    }
    static int[] alternateExtreme(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        int left = 0, right = n - 1;

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                result[i] = nums[left++];
            } else {
                result[i] = nums[right--];
            }
        }

        return result;
    }
    public static void main(String[] args) {
//        int[] nums = {19, 21, 33, 47, 52, 69};
//        System.out.println(average(nums));
//
//        int[] result = multiplyBy10(nums);
//        System.out.println(Arrays.toString(result));
//
//        nums = new int[]{1, 2, 3, 4, 5};
//
//        System.out.println(linearSearch(nums, 4));
//
//        System.out.println(maxNumber(nums));
//
//        System.out.println(
//                sumOfPositiveNegative(
//                        new int[]{19, -2, 24, -99, 198, -35}
//                )
//        );
//
//        int[] res = countZeroAndOne(new int[]{0, 1, 0, 0, 1, 1, 1});
//        System.out.println(Arrays.toString(res));
//
//        System.out.println(getUnsortedArray(new int[]{1, 3, 5, 2, 7, 8, 10}));

//        int[] nums = {19, 21, 33, 47, 52};
//        swapAlternate(nums);
//        System.out.println(Arrays.toString(nums));

//        int[] nums1 = {1, 2, 3, 4, 5};
//        int[] nums2 = {2, 5, 6, 7, 8};
//        System.out.println(arrayIntersection(nums1, nums2));
//
//        int[] nums = {1, 2, 3, 4, 5, 6, 7};
//        System.out.println(Arrays.toString(alternateExtreme(nums)));

    }
}

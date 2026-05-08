package TwoPointers;

import java.util.*;

public class Leetcode15_TreeSum {
    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);

        Set<List<Integer>> set = new HashSet<>();

        for(int i = 0; i < nums.length - 2; i++) {
            int left = i + 1, right = nums.length - 1;

            while(left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if(sum == 0) {
                    set.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left = left + 1;
                    right = right - 1;
                } else if (sum <= 0) {
                    left = left + 1;
                } else {
                    right = right - 1;
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

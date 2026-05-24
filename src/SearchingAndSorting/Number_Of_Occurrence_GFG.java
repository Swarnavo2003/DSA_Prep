package SearchingAndSorting;

import java.util.Scanner;

public class Number_Of_Occurrence_GFG {
    public static int lowerBound(int[] nums, int target) {
        int s = 0, e = nums.length - 1;
        int ans = nums.length;
        while(s <= e) {
            int mid = s + (e - s) / 2;
            if(nums[mid] >= target) {
                ans = mid;
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }
        return ans;
    }
    public static int upperBound(int[] nums, int target) {
        int s = 0, e = nums.length - 1;
        int ans = nums.length;
        while(s <= e) {
            int mid = s + (e - s) / 2;
            if(nums[mid] > target) {
                ans = mid;
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }
        return ans;
    }
    public static int countFreq(int[] arr, int target) {
        int lowerBoundValue = lowerBound(arr, target);
        int upperBoundValue = upperBound(arr, target);
        return upperBoundValue - lowerBoundValue;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] nums = new int[n];
        for(int i = 0; i < n; i ++) {
            nums[i] = sc.nextInt();
        }

        int target = sc.nextInt();
        // int lowerBoundValue = lowerBound(nums, target);
        // int upperBoundValue = upperBound(nums, target);

        System.out.println(countFreq(nums, target));

        sc.close();
    }
}

package SearchingAndSorting;

import java.util.Scanner;

public class Leetcode33_SearchInRotatedSortedArray {
    public static int binarySearch(int[] nums, int start, int end,int target) {
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if(nums[mid] == target) {
                return mid;
            }
            else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
    public static int findPivotIndex(int[] nums) {
        int s = 0, e = nums.length - 1;
        int ans = -1;
        while(s <= e) {
            int mid = s + (e - s) / 2;
            if(nums[mid] < nums[nums.length - 1]) {
                e = mid - 1;
            } else {
                ans = mid;
                s = mid + 1;
            }
        }
        return ans;
    }
    public static int search(int[] nums, int target) {
        int pivotIndex = findPivotIndex(nums);
        if(pivotIndex == -1) {
            int ans = binarySearch(nums, 0, nums.length - 1, target);
            return ans;
        }

        int s1 = 0, e1 = pivotIndex;
        int s2 = pivotIndex + 1, e2 = nums.length - 1;

        if(target >= nums[s1] && target <= nums[e1]) {
            int ans = binarySearch(nums, s1, e1, target);
            return ans;
        } else {
            int ans = binarySearch(nums, s2, e2, target);
            return ans;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] nums = new int[n];

        for(int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }

        int target = sc.nextInt();

        int searchedIndex = search(nums, target);
        System.out.println(searchedIndex);

        sc.close();
    }
}

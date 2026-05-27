package SearchingAndSorting;

import java.util.Scanner;

public class PivotIndexInSortedRotatedArray {
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
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] nums = new int[n];

        for(int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }

        int pivotIndex = findPivotIndex(nums);
        System.out.println(pivotIndex);

        sc.close();
    }
}

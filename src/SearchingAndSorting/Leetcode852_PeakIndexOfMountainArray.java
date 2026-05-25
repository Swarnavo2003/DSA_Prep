package SearchingAndSorting;

import java.util.Scanner;

public class Leetcode852_PeakIndexOfMountainArray {
    public static int peakIndexInMountainArray(int[] arr) {
        int peak = 0;
        int s = 0, e = arr.length - 1;
        while(s <= e) {
            int mid = s + (e - s) / 2;
            if(arr[mid] >= arr[mid + 1]) {
                peak = mid;
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }
        return peak;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] nums = new int[n];
        for(int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }

        int peak = peakIndexInMountainArray(nums);
        System.out.println(peak);

        sc.close();
    }
}

package SearchingAndSorting;

import java.util.Scanner;

public class LinearSearch {
    public static int linearSearch(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == target) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] nums = new int[n];
        for(int i = 0; i < n; i ++) {
            nums[i] = sc.nextInt();
        }

        int target = sc.nextInt();
        int index = linearSearch(nums, target);
        System.out.println(index);

        sc.close();
    }
}

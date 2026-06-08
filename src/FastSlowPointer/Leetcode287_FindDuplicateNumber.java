package FastSlowPointer;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Leetcode287_FindDuplicateNumber {
    public static int findDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for(int num : nums) {
            if(set.contains(num)) {
                return num;
            }
            set.add(num);
        }

        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int ans = findDuplicate(nums);
        System.out.println(ans);
    }
}

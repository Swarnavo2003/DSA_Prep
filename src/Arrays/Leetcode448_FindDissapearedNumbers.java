package Arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Leetcode448_FindDissapearedNumbers {
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> res = new ArrayList<>();

        for(int i = 0; i < nums.length; i++) {
            int absolute = Math.abs(nums[i]);
            if(nums[absolute - 1] > 0) {
                nums[absolute - 1] *= (-1);
            }
        }

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] > 0) {
                res.add(i + 1);
            }
        }

        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] nums = new int[n];
        for(int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }

        List<Integer> res = findDisappearedNumbers(nums);
        System.out.println(res);
    }
}

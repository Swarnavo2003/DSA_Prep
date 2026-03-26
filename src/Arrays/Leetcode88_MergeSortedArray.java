package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Leetcode88_MergeSortedArray {
    /*
    Problem: Merge two sorted arrays nums1 and nums2 into nums1 as one sorted array

    Method: Extra Array (Brute Force Merge)

    Algorithm:
    - Create a new array and of size m + n
    - Use three pointers:
        → i for nums1 (0 to m-1)
        → j for nums2 (0 to n-1)
        → k for ans (0 to m+n-1)
    - Compare elements of nums1 and nums2:
        → place smaller element into ans[k]
        → move corresponding pointer
    - If any elements remain in nums1:
        → copy them into ans
    - If any elements remain in nums2:
        → copy them into ans
    - Copy all elements from and back to nums1

    Key Idea:
    - Classic merge step of Merge Sort
    - Use extra space to simplify merging logic

    Complexity:
    - Time: O(m + n)
    - Space: O(m + n)

    ---

    Pattern:
    - Two Pointers (Merge / Merge Sort pattern)

    Interview Note:
    - This is simple but not optimal due to extra space
    - Optimal solution uses reverse merging in-place from the end
    */
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] ans = new int[m + n];
        int i = 0, j = 0, k = 0;
        while(i < m && j < n) {
            if(nums1[i] < nums2[j]) {
                ans[k++] = nums1[i++];
            } else {
                ans[k++] = nums2[j++];
            }
        }

        while(i < m) {
            ans[k++] = nums1[i++];
        }

        while(j < n) {
            ans[k++] = nums2[j++];
        }


        for(int x = 0; x < ans.length; x++) {
            nums1[x] = ans[x];
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();

        int[] nums1 = new int[m + n];
        for(int i = 0; i < m; i++) {
            nums1[i] = sc.nextInt();
        }

        int[] nums2 = new int[n];
        for(int i = 0; i < n; i++) {
            nums2[i] = sc.nextInt();
        }

        merge(nums1, m, nums2, n);

        System.out.println(Arrays.toString(nums1));

        sc.close();
    }
}

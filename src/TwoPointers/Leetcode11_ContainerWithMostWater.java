package TwoPointers;

import java.util.Scanner;

public class Leetcode11_ContainerWithMostWater {
    /*
    Problem: Find maximum water that can be contained between two lines

    Method: Two Pointers

    Algorithm:
    - Initialize two pointers:
        → i = 0 (start)
        → j = n - 1 (end)
    - While i < j:
        → calculate area = (j - i) * min(height[i], height[j])
        → update maxArea
        → move pointer with smaller height:
            → if height[i] < height[j] → i++
            → else → j--
    - Return maxArea

    Key Idea:
    - Area depends on shorter line
    - Move smaller height to try for a better area

    Complexity:
    - Time: O(n)
    - Space: O(1)

    Pattern:
    - Two Pointers
    - Greedy

    Interview Note:
    - Brute force is O(n²)
    - Optimal uses shrinking window from both ends
    */
    public static int maxArea(int[] height) {
        int i = 0, j = height.length - 1;
        int maxArea = -1;
        while (i < j) {
            int area = (j - i) * Math.min(height[i], height[j]);
            maxArea = Math.max(maxArea, area);

            if (height[i] < height[j]) {
                i++;
            } else {
                j--;
            }
        }
        return maxArea;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] heights = new int[n];
        for(int i = 0; i < heights.length; i++) {
            heights[i] = sc.nextInt();
        }
        System.out.println(maxArea(heights));

        sc.close();
    }
}

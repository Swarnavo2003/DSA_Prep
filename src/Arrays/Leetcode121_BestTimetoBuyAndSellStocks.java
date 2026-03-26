package Arrays;

import java.util.Scanner;

public class Leetcode121_BestTimetoBuyAndSellStocks {
    /*
    Problem: Find the maximum profit from buying and selling a stock once

    Method: Two Pointers (Sliding Window / Greedy)

    Algorithm:
    - Use two pointers:
        → left for buying day (minimum price so far)
        → right for selling day (current day)
    - Initialize:
        → left = 0
        → right = 1
        → maxProfit = 0
    - Traverse the array:
        → If prices[right] > prices[left]
            → calculate profit = prices[right] - prices[left]
            → update maxProfit
        → Else
            → update buying day → left = right (new minimum price found)
        → Move right pointer forward
    - Return maxProfit

    Key Idea:
    - Always track the minimum price so far
    - Sell only when profitable
    - Greedy approach: update buy point whenever a lower price appears

    Complexity:
    - Time: O(n)
    - Space: O(1)

    Pattern:
    - Two Pointers
    - Sliding Window
    - Greedy

    Interview Note:
    - Do NOT use brute force (O(n²))
    - Important insight: track minimum instead of checking all pairs
    - Equivalent approach:
        → minPrice = min(minPrice, currentPrice)
        → profit = currentPrice - minPrice
    */
    public static int maxProfit(int[] prices) {
        int left = 0, right = 1, maxProfit = 0;
        while(right < prices.length) {
            if(prices[right] > prices[left]) {
                int profit = prices[right] - prices[left];
                maxProfit = Math.max(maxProfit, profit);
            } else {
                left = right;
            }
            right++;
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] prices = new int[n];
        for(int i = 0; i < n; i++) {
            prices[i] = sc.nextInt();
        }
        System.out.println(maxProfit(prices));
        sc.close();
    }
}

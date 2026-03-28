package TwoPointers;

import java.util.Scanner;

public class Leetcode392_IsSubsequence {
    /*
    Problem: Check if string s is a subsequence of string t

    Method: Two Pointers

    Algorithm:
    - Initialize two pointers:
        → i = 0 (for s)
        → j = 0 (for t)
    - Traverse t:
        → if s[i] == t[j] → move i++
        → always move j++
    - If i reaches end of s → return true
    - Else → return false

    Key Idea:
    - Match characters in order without rearranging
    - Skip characters in t if not matching

    Complexity:
    - Time: O(m)
    - Space: O(1)

    Pattern:
    - Two Pointers

    Interview Note:
    - Subsequence ≠ Substring
    - Order matters, continuity not required
    */
    public static boolean isSubsequence(String s, String t) {
        int n = s.length(), m = t.length();

        int i = 0, j = 0;
        while(j < m && i < n) {
            if(s.charAt(i) == t.charAt(j)) {
                i = i + 1;
            }
            j = j + 1;
        }
        return (i == n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        System.out.println(isSubsequence(s, t));
    }
}

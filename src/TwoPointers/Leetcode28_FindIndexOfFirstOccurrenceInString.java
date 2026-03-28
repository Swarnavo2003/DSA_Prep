package TwoPointers;

import java.util.Scanner;

public class Leetcode28_FindIndexOfFirstOccurrenceInString {
    /*
    Problem: Find the first index of needle in haystack

    Method: Brute Force (Substring Matching)

    Algorithm:
    - Traverse haystack from i = 0 to n - m:
        → for each i, check characters of needle
        → if mismatch → break
        → if all characters match → return i
    - If no match found → return -1

    Key Idea:
    - Try matching needle at every possible starting index
    - Stop early on mismatch

    Complexity:
    - Time: O(n * m)
    - Space: O(1)

    Pattern:
    - String Matching

    Interview Note:
    - Not optimal for large inputs
    - Better approaches: KMP, Rabin-Karp
    */
    public static int strStr(String haystack, String needle) {
        int n = haystack.length(), m = needle.length();
        for(int i = 0; i <= n - m; i++) {
            int j = 0;
            for(j = 0; j < m; j++) {
                if(haystack.charAt(i + j) != needle.charAt(j)) {
                    break;
                }
            }
            if(j == m) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String haystack = sc.next();
        String needle = sc.next();
        System.out.println(strStr(haystack, needle));
    }
}

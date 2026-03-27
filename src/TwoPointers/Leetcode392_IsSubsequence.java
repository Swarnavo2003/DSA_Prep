package TwoPointers;

import java.util.Scanner;

public class Leetcode392_IsSubsequence {
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

package Strings;

import java.util.Scanner;

public class Leetcode58_LengthOfLastWord {
    public static int lengthOfLastWord(String s) {
        String temp = s.strip();
        int count = 0;
        for(char c : temp.toCharArray()) {
            if(c == ' ') {
                count = 0;
            } else {
                count++;
            }
        }
        return count;
    }
    public static int lengthOfLastWord2(String s) {
        int n = s.length() - 1;

        while(n >= 0) {
            if(s.charAt(n) == ' ') {
                n--;
            } else {
                break;
            }
        }

        int count = 0;
        while(n >= 0) {
            if(s.charAt(n) != ' ') {
                count++;
            } else {
                break;
            }
            n--;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int count = lengthOfLastWord2(s);
        System.out.println(count);
    }
}

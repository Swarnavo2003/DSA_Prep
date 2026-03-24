package Arrays;

public class Leetcode344_ReverseString {
    /*
    Problem: Reverse a character array in-place

    Algorithm:
    - Use two pointers i and j
    - Initialize i = 0 (start), j = n-1 (end)
    - While i < j:
        → swap s[i] and s[j]
        → increment i
        → decrement j
    - Continue until both pointers meet

    Key Idea:
    - Swap elements from both ends moving towards center
    - No extra space required (in-place reversal)

    Pattern:
    - Two Pointers (Opposite direction)
    */
    public static void reverseString(char[] s) {
        int i = 0, j = s.length - 1;
        while(i < j) {
            char temp = s[j];
            s[j] = s[i];
            s[i] = temp;
            i = i + 1;
            j = j - 1;
        }
    }

    public static void main(String[] args) {
        char[] s1 = {'h','e','l','l','o'};
        reverseString(s1);
        System.out.println(s1);

        char[] s2 = {'H','a','n','n','a','h'};
        reverseString(s2);
        System.out.println(s2);
    }
}

package FastSlowPointer;

import java.util.Scanner;

public class Leetcode202_HappyNumber {
    public static int happy(int num) {
        int sum = 0;
        while(num > 0) {
            int digit = num % 10;
            sum += digit * digit;
            num = num / 10;
        }
        return sum;
    }
    public static boolean isHappy(int n) {
        int slow = n,  fast = n;

        do {
            slow = happy(slow);
            fast = happy(fast);
            fast = happy(fast);
        } while (slow != fast);

        return slow == 1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        System.out.println(isHappy(num));
    }
}

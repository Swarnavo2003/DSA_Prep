package SearchingAndSorting;

import java.util.Scanner;

public class Leetcode69_Sqrt {
    public static int mySqrt(int x) {
        if(x == 0) {
            return 0;
        }
        int s = 1, e = x;
        int ans = -1;
        while(s <= e) {
            int mid = s + (e - s) / 2;
            if(mid == x / mid) {
                return mid;
            }
            else if(mid > x / mid) {
                e = mid - 1;
            } else {
                ans = mid;
                s = mid + 1;
            }
        }
        return ans;
    }
    public static double mySqrtPrecise(int x) {
        double factor = 1;
        int totalPrecision = 3;
        double ans = mySqrt(x); // Start from integer sqrt
        for(int round = 1; round <= totalPrecision; round++) {
            factor /= 10;
            for(int i = 1; i <= 9; i++) {
                double newAns = ans + i * factor;
                if(newAns * newAns <= x) {
                    ans = newAns;
                } else {
                    break;
                }
            }
            System.out.println("Answer of round " + round + " : " +
                    Math.round(ans * 1000.0) / 1000.0);
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        int sqrt = mySqrt(x);

        System.out.println(sqrt);

        double sqrtPrecise = mySqrtPrecise(x);

        System.out.println(sqrtPrecise);

        sc.close();
    }
}

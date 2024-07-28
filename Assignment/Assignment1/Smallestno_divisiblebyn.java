package Assignment.Assignment1;

import java.util.*;

public class Smallestno_divisiblebyn {
    /*
     * Two integers n and k are given. Our task is to print K-rounding of n.
     * K-rounding is the minimum positive integer X, such that x ends with k or more
     * zeros and is divisible by n.
     * 
     * Input : n = 30, k = 3.
     * Output : 3000
     * 3000 is the smallest number that has at-least k 0s and is divisible by n.
     * 
     * Input : n = 375, k = 4.
     * Output : 30000
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long k = sc.nextLong();
        long ans = smallestNo(n, k);
        System.out.println(ans);
        sc.close();
    }

    public static long smallestNo(long n, long k) {
        long x = (long) Math.pow(10, k);
        long lcm = (x > n) ? x : n;
        while (true) {
            if (lcm % x == 0 && lcm % n == 0) {
                return lcm;
            }
            lcm++;
        }
    }
}

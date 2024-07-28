package Assignment.Assignment1;

import java.util.*;

public class LCM_GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        Long[] res = lcmAndGcd(a, b);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
        sc.close();
    }

    public static Long[] lcmAndGcd(Long a, Long b) {
        // code here
        Long[] res = new Long[2];

        long lcm = calculateLCM(a, b);
        res[0] = lcm;

        long gcd = calculateGCD(a, b);
        res[1] = gcd;
        return res;
    }

    public static long calculateGCD(long a, long b) {
        while (a > 0 && b > 0) {
            if (a > b) {
                a = a % b;
            } else {
                b = b % a;
            }
        }
        if (a == 0) {
            return b;
        }
        return a;
    }

    public static long calculateLCM(long a, long b) {
        return (a * b) / calculateGCD(a, b);
    }
}

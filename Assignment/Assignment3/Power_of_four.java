package Assignment.Assignment3;

import java.util.*;

public class Power_of_four {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean ans = isPowerofFour(n);
        System.out.println(ans);
        sc.close();
    }

    public static boolean isPowerofFour(int n) {
        if (n == 1)
            return true;
        if (n % 4 != 0 || n == 0)
            return false;
        return isPowerofFour(n / 4);
    }
}
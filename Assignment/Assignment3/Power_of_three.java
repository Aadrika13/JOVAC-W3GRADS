package Assignment.Assignment3;

import java.util.*;

public class Power_of_three {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean ans = isPowerofThree(n);
        System.out.println(ans);
        sc.close();
    }

    public static boolean isPowerofThree(int n) {
        if (n == 1)
            return true;
        if (n % 3 != 0 || n == 0)
            return false;
        return isPowerofThree(n / 3);
    }
}

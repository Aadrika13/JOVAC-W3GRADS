package Assignment.Assignment3;

import java.util.*;

public class Power_of_two {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean ans = isPowerOfTwo(n);
        System.out.println(ans);
        sc.close();
    }

    public static boolean isPowerOfTwo(int n) {
        if (n == 1)
            return true;
        if (n % 2 != 0 || n == 0)
            return false;
        return isPowerOfTwo(n / 2);
    }
}

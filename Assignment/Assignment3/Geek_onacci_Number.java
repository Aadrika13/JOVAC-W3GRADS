package Assignment.Assignment3;

import java.util.*;

public class Geek_onacci_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int n = sc.nextInt();
            int ans = geekonacci(a, b, c, n);
            System.out.println(ans);
        }
        sc.close();
    }

    public static int geekonacci(int a, int b, int c, int n) {
        if (n == 1)
            return a;
        if (n == 2)
            return b;
        if (n == 3)
            return c;
        return geekonacci(a, b, c, n - 1) + geekonacci(a, b, c, n - 2) + geekonacci(a, b, c, n - 3);
    }
}

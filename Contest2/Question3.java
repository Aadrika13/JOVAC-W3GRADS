package Contest2;

import java.util.*;

public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            minLcm(n);
        }
        sc.close();
    }

    public static void minLcm(int n) {
        int x = 1, y = n - 1;
        int minLcm = lcm(x, y);

        for (int i = 2; i <= n / 2; i++) {
            int a = i;
            int b = n - i;
            int currentLcm = lcm(a, b);
            if (currentLcm < minLcm) {
                x = a;
                y = b;
                minLcm = currentLcm;
            }
        }

        System.out.println(x + " " + y);
    }

    public static int gcd(int a, int b) {
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

    public static int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }

}

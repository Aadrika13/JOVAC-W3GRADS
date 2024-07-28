package Assignment.Assignment1;

import java.util.*;

public class Make_coprime_Array {
    int countCoPrime(int a[], int n) {
        // Complete the function
        int c = 0;
        for (int i = 0; i < n - 1; i++) {
            if (gcd(a[i], a[i + 1]) == 1) {

            } else {
                c++;
            }
        }
        return c;

    }

    static int gcd(int a, int b) {
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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Make_coprime_Array res = new Make_coprime_Array();
        int ans = res.countCoPrime(a, n);
        System.out.println(ans);
        sc.close();

    }
}

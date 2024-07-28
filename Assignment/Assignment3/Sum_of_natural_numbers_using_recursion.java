package Assignment.Assignment3;

import java.util.Scanner;

public class Sum_of_natural_numbers_using_recursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = recur_Sum(n);
        System.out.println(ans);
        sc.close();
    }

    public static int recur_Sum(int n) {
        if (n == 0) {
            return 0;
        }
        return n + recur_Sum(n - 1);
    }
}
package Assignment.Assignment1;

import java.util.*;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String ans = armstrongNumber(n);
        System.out.println(ans);
        sc.close();
    }

    public static String armstrongNumber(int n) {
        int temp = n;
        int ans = 0;

        while (n != 0) {
            int rem = n % 10;
            ans = ans + (int) Math.pow(rem, 3);
            n /= 10;
        }
        if (ans == temp) {
            return "true";
        }
        return "false";

    }

}

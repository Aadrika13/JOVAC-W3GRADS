package Assignment.Assignment1;

import java.util.*;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        isPalindrome(x);
        sc.close();
    }

    public static boolean isPalindrome(int x) {
        int temp = x;
        int ans = 0;
        while (temp != 0) {
            int rem = temp % 10;
            ans = ans * 10 + rem;
            temp /= 10;
        }
        if (ans == x) {
            if (ans < 0) {
                return false;
            }
            return true;
        }
        return false;
    }
}

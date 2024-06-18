package DAY5;

import java.util.*;
public class Sum_of_digits_using_recursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = sumOfDigits(n);
        System.out.println(sum);
        sc.close();
    }
    public static int sumOfDigits(int n){
        if(n==0){
            return 0;
        }
        int rem = n%10;
        int ans = rem + sumOfDigits(n/10);
        return ans;
    }
}

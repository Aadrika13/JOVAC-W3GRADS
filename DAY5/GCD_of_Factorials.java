package DAY5;

import java.util.*;
public class GCD_of_Factorials {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int ans = gcdofFact(n,m);
        System.out.println(ans);
        sc.close();
    }
    public static int gcdofFact(int n,int m){
        if(n==0||m==0){
            return 1;
        }
        if(n>m){
            return m*gcdofFact(n, m-1);
        }
        return n*gcdofFact(n-1, m);
    }
}

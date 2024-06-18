package DAY5;

import java.util.*;
public class Expo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        int ans = expo(x,n);
        System.out.println(ans);
        sc.close();
    }
    public static int expo(int x,int n){
        
        if(n==0){
            return 1;
        }
        // time complixity O(n)
        // int ans = x*expo(x,n-1);
        // return ans; 

        // time complixity O(log(n))
        //binary expo
        int ans = expo(x,n/2);
        if(n%2==0){
            return ans*ans;
        }
        return x*ans*ans;
        
    }
}

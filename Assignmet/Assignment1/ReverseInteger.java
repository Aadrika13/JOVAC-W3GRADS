package Assignmet.Assignment1;
import java.util.*;
public class ReverseInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int ans = reverse(x);
        System.out.println(ans);
        sc.close();
    }

    public static int reverse(int x) {
        long ans =0;
        while(x != 0){
            int rem = x%10;
            ans = ans*10 + rem;
            x = x/10;
        }
        
        if(ans>Integer.MAX_VALUE || ans<Integer.MIN_VALUE){
            return 0;  
    
        }

        return (int)ans;
    }
}

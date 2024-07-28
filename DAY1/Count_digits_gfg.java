package DAY1;
import java.util.*;
public class Count_digits_gfg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = evenlyDivides(n);
        System.out.println(ans);
        sc.close();
    }
    public static int evenlyDivides(int n){
        // code here
        int temp = n;
        int c=0;
        while(n!=0){
            int d = n%10;
            if(d!=0 && temp%d==0){
                c++;
            }
            n=n/10;
        }
        return c;
    }
}

// write a java code to print numbrs from 1 to 100 without using loops


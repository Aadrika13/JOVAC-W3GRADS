package DAY1;
import java.util.*;
public class gcd_of_two_numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int ans = gcd(a,b);
        System.out.println(ans);
        scanner.close();
    }
    // public static int gcd(int a, int b) {
    //     int ans = 1;
    //     int min = Math.min(a,b);
    //     for(int i=min;i>=1;i--){
    //         if(a%i==0 && b%i==0){
    //             ans = i;
    //             break;
    //         }
    //     }
    //     return ans;
    // }
    //optimal solution
    public static int gcd(int a, int b) {
        while(a>0 && b>0){
            if(a>b){
                a = a%b;
            }else{
                b = b%a;
            }
        }
        if(a==0){
            return b;
        }else{
            return a;
        }
    }
}

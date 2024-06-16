package Contest1;
import java.util.*;
public class inverse {
    public static void main(String [] agrs){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = Inverse(n);
        System.out.println(ans);
        sc.close();
    }

    public static int Inverse(int n) {
        int place = 1;
        int ans = 0;
        while(n != 0){
            int rem = n%10;
            ans = ans + place * (int)Math.pow(10, rem-1);
            n /= 10;
            place++;
        }
        return ans;
    }
}

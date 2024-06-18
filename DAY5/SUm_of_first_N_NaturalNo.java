package DAY5;

import java.util.*;
public class SUm_of_first_N_NaturalNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = sumOfNaturalno(n);
        System.out.println(ans);
        sc.close();
    }

    public static int sumOfNaturalno(int n) {
        if(n==1){
            return 1;
        }
        int ans = n+sumOfNaturalno(n-1);
        return ans;
    }
}

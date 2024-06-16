package DAY1;
import java.util.*;

public class pascal_triangle {
    // public static void main(String[] args) {
    //     //time complixity n^3
    //     Scanner sc =  new Scanner(System.in);
    //     int N = sc.nextInt();
    //     for(int n=0;n<N;n++){
    //         for(int r=0;r<=n;r++){
    //             int nCr = factorial(n)/(factorial(r) * factorial(n-r));
    //             System.out.print(nCr+" ");
    //         }
    //         System.out.println();
    //     }

    //     sc.close();
    // }
    // public static int factorial(int n){
    //     //time complexity n
    //     int fact = 1;
    //     while(n > 0){
    //         fact = fact * n;
    //         n--;
    //     }
    //     return fact;
    // }

    // optimal solution
    public static void main(String[] args) {
        //time complexity n^2 
        Scanner sc =  new Scanner(System.in);
        int N = sc.nextInt();
        for(int n=0;n<N;n++){
            int nCr = 1;
            for(int r=0;r<=n;r++){
                System.out.print(nCr+" ");
                nCr = ((n-r)*nCr)/(r+1);
            }
            System.out.println();
        }
        sc.close();
    }
}
package Assignment.Assignment1;

import java.util.*;

public class Game_with_Integers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t != 0) {
            t--;
            int n = sc.nextInt();
            int n1 = n - 1;
            int n2 = n + 1;

            if (n1 % 3 == 0 || n2 % 3 == 0) {
                System.out.println("First");
            } else {
                System.out.println("Second");
            }
        }
        sc.close();
    }

}

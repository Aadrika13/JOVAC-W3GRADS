package Assignment.Assignment1;

import java.util.*;

public class JumpMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int ans = minJumps(arr, n);
        System.out.println(ans);
        sc.close();
    }

    public static int minJumps(int[] arr, int n) {
        // your code here
        if (n <= 1) {
            return 0;
        }
        if (arr[0] >= n - 1) {
            return 1;
        }
        if (arr[0] == 0) {
            return -1;
        }
        int maxDis = arr[0];
        int no_of_steps = arr[0];
        int count = 1;

        for (int i = 1; i < n; i++) {
            if (i == n - 1) {
                return count;
            }
            if (arr[i] >= (n - 1) - i) {
                return count + 1;
            }
            maxDis = Math.max(maxDis, i + arr[i]);
            no_of_steps--;
            if (no_of_steps == 0) {
                count++;
                if (i >= maxDis) {
                    return -1;
                }
                no_of_steps = maxDis - i;
            }

        }
        return -1;
    }
}

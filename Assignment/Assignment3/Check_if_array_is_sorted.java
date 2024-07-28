package Assignment.Assignment3;

import java.util.*;

public class Check_if_array_is_sorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        if (arraySortedOrNot(arr, n)) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
        sc.close();
    }

    public static boolean arraySortedOrNot(int[] arr, int n) {
        // code here
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }
}

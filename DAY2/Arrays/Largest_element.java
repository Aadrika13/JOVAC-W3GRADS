package DAY2.Arrays;

import java.util.*;
public class Largest_element{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        //time complexity O(n)
        int max = arr[0];
        for(int i = 0; i < n; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println(max);
        sc.close();

        //time complexity nlog(n)
        // Arrays.sort(arr);
        // System.out.println(arr[n-1]);
        // sc.close();
    }
}
package DAY2.Arrays;

import java.util.*;
public class Rotate_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int [] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        rotate(arr,k,n);
        for(int i = 0; i < n; i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
    public static void rotate(int [] arr, int k,int n){
        //time complexity O(n^2)
        // while(k != 0){
        //     int temp = arr[n-1];
        //     for(int i = n-1; i > 0; i--){
        //         arr[i] = arr[i-1];
        //     }
        //     arr[0] = temp;
        //     k--;
        // }
        //optimal approach 
        //time complexity O(n)
        k = k%n;
        reverse(arr,0,n-1);
        reverse(arr,0,k-1);
        reverse(arr,k,n-1);
    }
    public static void reverse(int [] arr,int p1,int p2){
        while(p1<p2){
            int temp = arr[p1];
            arr[p1] = arr[p2];
            arr[p2] = temp;
            p1++;
            p2--;
        }
    }
}

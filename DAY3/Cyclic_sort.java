package DAY3;

import java.util.*;
public class Cyclic_sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        cyclicSort(arr,n);
        System.out.println(Arrays.toString(arr));

        sc.close();
    }

    public static void cyclicSort(int[] arr, int n) {
        for(int i=0;i<n;i++){
            while(arr[i] != i+1){
                int idx = arr[i]+1;
                swap(arr,i,idx);
            }
        }
    }

    public static void swap(int[] arr,int i,int idx){
        int temp = arr[i];
        arr[i]=arr[idx];
        arr[idx]=temp;
    }
}

package Contest1;

import java.util.*;
public class duplicate{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        List<Integer> result = Duplicate(arr,n);
        for(int i=0;i<result.size();i++){
            System.out.print(result.get(i)+" ");
        }
        sc.close();
    
    }
    public static List<Integer> Duplicate(int arr[], int n){
        List <Integer> ans = new ArrayList<>();
        for(int i = 0; i < n; i++){
            int idx = Math.abs(arr[i]) - 1;
            if(arr[idx]<0){
                ans.add((int)Math.abs(arr[i]));
            }
            else{
                arr[idx] *= -1;
            }
        }
        return ans;
    }
}
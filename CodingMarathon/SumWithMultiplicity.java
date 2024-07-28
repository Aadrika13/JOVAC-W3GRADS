package CodingMarathon;

import java.util.Arrays;

public class SumWithMultiplicity {
    public static void main(String[] args) {
        int[] arr = {2,1,3};
        int target = 6;
        System.out.println(threeSumMulti(arr, target));
    }
    public static int threeSumMulti(int[] arr, int target) {
        Arrays.sort(arr);
        long count = 0 ;
        
        for(int i=0;i<arr.length;i++){
            int sum = target - arr[i];
            int j = i+1;
            int k = arr.length-1;
            while(j<k){
                if(arr[j]+arr[k]<sum){
                    j++;
                }
                else if(arr[j]+arr[k]>sum){
                    k--;
                }
                else{
                    if(arr[j]!=arr[k]){
                        int left = 1;
                        int right = 1;
                        while(j+1<k && arr[j]==arr[j+1]){
                            left++;
                            j++;
                        }
                        while(k-1>j && arr[k]==arr[k-1]){
                            right++;
                            k--;
                        }
                        count += left*right;
                        j++;
                        k--;
                    }
                    else{
                        count += (k-j+1)*(k-j)/2;
                        break;
                    }
                }
            }
        }
        return (int)(count%1000000007);
    }
}

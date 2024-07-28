package CodingMarathon;

public class LongestMountainInArray {
    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4,5,4,3,2,1,0};
        System.out.println(longestMountain(arr));    }
    public static int longestMountain(int[] arr) {
        int[] left = new int[arr.length];
        int[] right = new int[arr.length];
        for(int i=1;i<arr.length-1;i++){
            if(arr[i]>arr[i-1]){
                left[i]=left[i-1]+1;
            }
        }
        for(int i=arr.length-2;i>0;i--){
            if(arr[i]>arr[i+1]){
                right[i]=right[i+1]+1;//error here 
                
            }
        }
        int max = 0;
        for(int i=1;i<arr.length-1;i++){
            if(left[i]>0 && right[i]>0){
                max = Math.max(max,left[i]+right[i]+1);
            }
        }
        return max;
    }
}

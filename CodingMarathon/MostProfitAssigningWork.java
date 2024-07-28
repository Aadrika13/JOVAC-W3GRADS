package CodingMarathon;

import java.util.Arrays;

public class MostProfitAssigningWork {
    public static void main(String[] args) {
        int[] difficulty = {85,47,57};
        int[] profit = {24,66,99};
        int[] worker = {40,25,25};
        System.out.println(maxProfitAssignment(difficulty, profit, worker));
    }
    public static int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        int n = difficulty.length;
        int[][] jobs = new int[n][2];
        for(int i=0;i<n;i++){
            jobs[i][0] = difficulty[i];
            jobs[i][1] = profit[i];
        }
        Arrays.sort(jobs,(a,b)->a[0]-b[0]);
        Arrays.sort(worker);
        int ans = 0;
        int maxProfit = 0;
        int i=0;
        for(int w:worker){
            while(i<n && jobs[i][0]<=w){
                maxProfit = Math.max(maxProfit,jobs[i][1]);
                i++;
            }
            ans += maxProfit;
        }
        return ans;
    }
}

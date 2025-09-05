package DynamicProgramming.Lecture_1;

import java.lang.annotation.Target;
import java.util.Arrays;

public class Min_Stair {
    public static void main(String[] args) {
        int[] arr = {1,100,1,1,1,100,1,1,100,1};
        int[] dp = new int[arr.length+1];
        Arrays.fill(dp,-1);
        int leftx = TotalCost(arr,arr.length-1,dp);
        int rightX = TotalCost(arr,arr.length-2,dp);
        System.out.println(Math.min(leftx,rightX));
        System.out.println(TotalCostDP(arr));
    }
    public static int TotalCost(int[] arr,int i,int[] dp){
        if(i<0){
            return 0;
        }
        if(dp[i]!=-1){
            return dp[i];
        }
        int f = TotalCost(arr,i-1,dp);
        int s = TotalCost(arr,i-2,dp);
        return dp[i] = Math.min(f,s) + arr[i];
    }

    public static int TotalCostDP(int[] arr){
        if(arr.length==1){
            return arr[0];
        }
        int[] dp = new int[arr.length];
        dp[0] = arr[0];
        dp[1] = Math.min(arr[0],arr[1]);
        for(int i=2;i<arr.length;i++){
            int f = dp[i-1];
            int s = dp[i-2];
            dp[i] = Math.min(f,s) + arr[i];
        }
        return dp[dp.length-1];
    }

}

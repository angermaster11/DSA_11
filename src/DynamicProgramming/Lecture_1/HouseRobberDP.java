package DynamicProgramming.Lecture_1;

import java.util.Arrays;

public class HouseRobberDP {
    public static void main(String[] args) {
        int[] arr = {2,7,9,3,1};
        int[] dp = new int[arr.length+1];
        Arrays.fill(dp,-1);
//        System.out.println(robbed(arr,0,dp));
//        System.out.println(robbed2(arr,arr.length-1,dp));
        System.out.println(robbedBU(arr));
    }
    public static int robbed(int[] arr,int i,int[] dp){
        if(i >= arr.length){
            return 0;
        }
        if(dp[i]!=-1){
            return dp[i];
        }
        int leftX = arr[i] + robbed(arr,i+2,dp);
        int rightX = robbed(arr,i+1,dp);
        return dp[i] = Math.max(leftX,rightX);
    }
    public static int robbed2(int[] arr,int i,int[] dp){
        if(i<0){
            return 0;
        }
        if(dp[i]!=-1){
            return dp[i];
        }
        int leftX = arr[i] + robbed2(arr,i-2,dp);
        int rightX = robbed2(arr,i-1,dp);
        return dp[i] = Math.max(leftX,rightX);
    }
    public static int robbedBU(int[] arr){
        if(arr.length==1){
            return arr[0];
        }
        int[] dp = new int[arr.length];
        dp[0] = arr[0];
        dp[1] = Math.max(arr[0],arr[1]);
        for(int i=2;i<arr.length;i++){
            int leftX = arr[i]+dp[i-2];
            int rightX = dp[i-1];
            dp[i] = Math.max(leftX,rightX);
        }
        return dp[dp.length-1];
    }
}

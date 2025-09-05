package DynamicProgramming.Lecture_2;

import java.util.*;

public class KnapSnap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] values = new int[n];
        int [] weights = new int[n];
        for (int i=0;i<n;i++){
            values[i] = sc.nextInt();
        }
        for (int i=0;i<n;i++){
            weights[i] = sc.nextInt();
        }
        int Threshold = sc.nextInt();
        int[][] dp = new int[Threshold+1][weights.length];
        for (int[] a: dp){
            Arrays.fill(a,-1);
        }
        System.out.println(MaxValue(values,weights,Threshold,0,dp));
    }
    public static int MaxValue(int[] values,int[] weights, int Threshold, int idx, int[][] dp){
        if(Threshold == 0 || idx == weights.length){
            return 0;
        }
        if(dp[Threshold][idx]!=-1){
            return dp[Threshold][idx];
        }
        int inc = 0,exe = 0;
        if(Threshold>=weights[idx]){
            inc = values[idx] + MaxValue(values,weights,Threshold - weights[idx],idx+1,dp);
        }
        exe = MaxValue(values,weights,Threshold,idx+1,dp);
        return dp[Threshold][idx] = Math.max(inc,exe);
    }
}

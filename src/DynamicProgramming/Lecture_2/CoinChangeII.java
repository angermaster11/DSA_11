package DynamicProgramming.Lecture_2;

import java.util.Arrays;

public class CoinChangeII {
    public static void main(String[] args) {
        int[] coins = {1,2,5};
        int amount = 5;
        int[][] dp = new int[amount+1][coins.length];
        for(int[] a: dp ){
            Arrays.fill(a,-1);
        }
        System.out.println(CatchTheCoin(coins,amount,0,dp));

    }
    public static int CatchCoin(int[] coins,int amount,int idx){
        if(amount==0){
            return 1;
        }
        if(idx==coins.length){
            return 0;
        }
        int inc=0, exe=0;
        if(coins[idx]<=amount){
            inc = CatchCoin(coins,amount-coins[idx],idx);
        }
        exe = CatchCoin(coins,amount,idx+1);

        return inc+exe;
    }
    public static int CatchTheCoin(int[] coins,int amount,int idx,int[][] dp){
        if(amount==0){
            return 1;
        }
        if(idx==coins.length){
            return 0;
        }
        if(dp[amount][idx]!=-1){
            return dp[amount][idx];
        }
        int inc=0,exe=0;
        if(coins[idx]<=amount){
            inc = CatchTheCoin(coins,amount-coins[idx],idx,dp);
        }
        exe = CatchTheCoin(coins,amount,idx+1,dp);
        return dp[amount][idx] = inc+exe;
    }


}

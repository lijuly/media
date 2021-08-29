package com.test;

import java.util.Arrays;

public class CoinTest {
    public static void main(String[] args) {
        int [] coins = {1, 2, 5, 7, 10};
        int amount=14;
        System.out.println(coinChange(coins, amount));
    }

    private static int coinChange(int[] coins, int amount) {
        // 初始化dp数组，大小为amount+1,全部元素初始化为-1
        int [] dp = new int[amount+1];
        Arrays.fill(dp, -1);
        dp[0]=0; // 金额0的最优解为0
        // 从变量1开始循环到amount,依次计算1到amount金额的最优解
        for (int i=1;i<=amount;i++) {
            // 对于每个金额i,使用变量j遍历面值coins数组
            for(int j=0;j< coins.length;j++) {
                // 所有小于等于i的面值coins[j]，如果金额i-coins[j]有最优解
                if (i >= coins[j] && dp[i-coins[j]] != -1) {
                    // 如果dp[i]还没有最优解，或者dp[i]比正在计算的最优解大
                    if (dp[i]==-1 || dp[i] > dp[i-coins[j]] + 1){
                        // 更新dp[i]
                        dp[i] = dp[i-coins[j]] + 1;
                    }
                }
            }
        }
        return dp[amount];
    }
}

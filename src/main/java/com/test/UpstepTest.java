package com.test;

import java.util.Arrays;
import java.util.Scanner;

public class UpstepTest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            stepDp(n);
        }
    }

    private static void stepDp(int n){
        if (n <=1){
            System.out.println(n);
            return;
        }
        int [] dp = new int[n+1];
        Arrays.fill(dp, -1);
        dp[1] = 1;
        dp[2] = 2;
        for (int i=3;i<=n;i++){
            if (dp[i] == -1){
                dp[i]=dp[i-1]+dp[i-2];
            }
        }
        System.out.println(dp[n]);
    }
}

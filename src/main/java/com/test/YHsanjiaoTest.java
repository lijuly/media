package com.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class YHsanjiaoTest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<List<Integer>> res = generate(n);

        System.out.println(res);
    }

    private static List<List<Integer>> generate(int n){
        List<List<Integer>> result = new  ArrayList<>();
        int[][] tmpRes = new  int[n+1][n+1];
        if (n >= 1) {
            tmpRes[1][1]=1;
            result.add(Arrays.asList(1));
        }
        if (n >= 2){
            tmpRes[2][1]=1;
            tmpRes[2][2]=1;
            result.add(Arrays.asList(1,1));
        }
        if(n >= 3) {
            for (int i=3;i<n+1;i++) {
                int[] tmp= new int[n+1];
                tmp[1]=1;
                tmp[i-1]=1;
                for(int j=1;j<i;j++){
                    tmp[j+1] = tmpRes[i-1][j]+tmpRes[i-1][j+1];
                }
                tmpRes[i]=tmp;
                List<Integer> t = new ArrayList<>();
                for (Integer elem : tmp){
                    if(elem != 0){
                        t.add(elem);
                    }
                }
                result.add(t);
            }
        }
        return result;
    }
}

package com.test;

public class MaxsubTest {
    public static void main(String[] args) {
        // int [] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int [] nums = {-2, -1};

        int count=0;
        int result=Integer.MIN_VALUE;
        for (int i=0;i < nums.length;i++) {
            count+=nums[i];
            if (count > result){
                result = count;
            }
            if (count < 0) {
                count=0;
            }
        }
        System.out.println(result);
    }
}

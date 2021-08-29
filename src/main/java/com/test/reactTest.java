package com.test;

import java.util.ArrayList;
import java.util.List;

public class reactTest {

    public static void main(String[] args) {
       /* char [] s  = {'a', 'c', 'o', 'w', 'q' };
        reverseString(s);

        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            String s = sc.nextLine();
            System.out.println(longestPalindrome(s));
        }*/

       //int [] nums = {1, 3 , 4, 6 ,7 ,9};
       int [] nums = {1, 3};
       int target = 3;
       System.out.println(searchInsert(nums,target));
    }

    private static void reverseString(char[] s) {
        int len = s.length;
        if (len % 2 == 0) {
            for (int i=0; i < len / 2; i++) {
                char c = s[i];
                s[i]=s[len -1 -i];
                s[len -1 -i] = c;
            }
        } else {
            for (int i=0; i < (len-1) / 2; i++) {
                char c = s[i];
                s[i]=s[len -1 -i];
                s[len -1 -i] = c;
            }
        }
    }

    private static int longestPalindrome(String s) {
        int len = s.length();
        List<String> nes = new ArrayList<>();
        String str = null;
        for (char c : s.toCharArray()) {
            str = String.valueOf(c);
            if (!nes.contains(str)) {
                nes.add(str);
            } else {
                nes.remove(str);
            }
        }

        return nes.size() == 0 ? len: len - nes.size()+1;
    }

    public static int searchInsert(int[] nums, int target) {
        int len = nums.length;
        if (target <= nums[0]) {
            return 0;
        }
        if (target > nums[len-1]) {
            return len;
        }
        if (target == nums[len-1]){
            return len -1;
        }
        int low=0;
        int high=len-1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (target < nums[mid]) {
                high = mid - 1;
            } else if (target > nums[mid]) {
                low = mid + 1;
            } else {
                return mid;
            }
        }
        return low;
    }
}

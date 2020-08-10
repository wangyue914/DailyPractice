package com.leetcode.string;

/**
 * @author wangyue
 * @date 2019/6/13 19:59
 **/
public class test5 {
    public static String longestPalindrome(String s) {

        if (s == null || s.isEmpty()) {
            return "";
        }
        char[] str = s.toCharArray();
        int[][] dp = new int[s.length()][s.length()];
        int max = 1;
        int start = 0;
        int end = 0;

        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < i; j ++) {
                if (str[i] == str[j] && (i - j <= 2 || dp[j+1][i-1] == 1)){
                    dp[j][i] = 1;
                }
                if (max < i - j + 1 && dp[j][i] == 1) {
                    max = i - j + 1;
                    start = j;
                    end = i;
                }
            }
        }

        return s.substring(start, end + 1);
    }

    public static void main(String[] args) {
        System.out.println(longestPalindrome("babad"));
    }
}

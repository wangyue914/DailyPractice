package com.leetcode.string;

import java.util.HashMap;
import java.util.Map;

/**
 * @author wangyue
 * @date 2019/6/12 17:51
 **/
public class test3 {
    public static int lengthOfLongestSubstring(String s) {

        if (s == null || s.isEmpty()) {
            return 0;
        }
        char[] str = s.toCharArray();
        int result = 1;
        for (int i = 0; i < str.length; i++) {
            Map<Character, Character> map = new HashMap<>();
            map.put(str[i], str[i]);
            int tempResult = 1;
            for (int j = i + 1; j < str.length; j++) {
                if (map.get(str[j]) != null) {
                    break;
                }
                tempResult ++;
                map.put(str[j], str[j]);
            }
            if (tempResult > result) {
                result = tempResult;
            }
            map.clear();

        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("pwwkew"));
    }
}

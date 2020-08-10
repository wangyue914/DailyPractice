package com.leetcode.string;

/**
 * @author wangyue
 * @date 2019/6/14 10:40
 **/
public class test6 {
    public static String convert(String s, int numRows) {

        if (numRows == 0 || numRows == 1) {
            return s;
        }

        int zigNum = numRows - 2;
        int group = s.length() / (numRows + numRows -2) + 1;
        int extra = s.length()%(numRows + numRows - 2) - numRows > 0 ? s.length()%(numRows + numRows - 2) - numRows + 1 : 1;
        int col = (group - 1 > 0 ? (group - 1) * (numRows - 1) : 1) + extra;
        char[] str = s.toCharArray();
        int index = 0;
        char[][] result = new char[numRows][col];
        int wide = numRows - 1;

        for (int i = 0; i < group; i++) {
            for (int j = 0; j < numRows && index < s.length(); j++) {
                result[j][i*wide] = str[index];
                index++;
            }
            for (int k = 1; k <= zigNum && index < s.length(); k++) {
                result[numRows - k -1][i*wide + k] = str[index];
                index++;
            }
        }

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < col; j++) {
                if (result[i][j] != '\0'){
                    stringBuilder.append(result[i][j]);
                }
            }
        }
        return stringBuilder.toString();
    }


    public static void main(String[] args) {
        System.out.println(convert("PAYPALISHIRING", 3));
    }
}

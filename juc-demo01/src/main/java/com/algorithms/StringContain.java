package com.algorithms;

public class StringContain {
    public static void main(String[] args) {

    }

    /**
     * str1 = "abc2erthelloyuiodefabcdef", str2 = "cvhellobnm"
     * str1 和 str2 中最长共同包含的最长字符串
     */

    public static String test(String str1, String str2) {
        String maxStr = str1.length() >= str2.length() ? str1: str2;
        String minStr = str1.length() < str2.length() ? str1: str2;

        int length = minStr.length();

        for (int i = 0; i < length; i++) {
            for (int x = 0, y = length; x < 0; x++) {

            }

            if(maxStr.contains(minStr)){
                return minStr;
            }
        }
        return null;
    }
}

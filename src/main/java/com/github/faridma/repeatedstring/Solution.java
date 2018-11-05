package com.github.faridma.repeatedstring;

/**
 * @author Farid F. Mammadov
 * My solution for:
 * <a href="https://www.hackerrank.com/challenges/repeated-string">Repeated String</a>
 */
public class Solution {
    // Complete the repeatedString function below.
    static long repeatedString(String s, long n) {
        if ("a".equals(s)) return n;

        char[] chars = s.toCharArray();
        int aCountInString = 0;
        for (char c : chars) {
            if ('a' == c) {
                aCountInString++;
            }
        }
        if (aCountInString == 0) return 0;

        long fullRepeatCount = n / chars.length;
        long total = fullRepeatCount * aCountInString;

        if (n % chars.length != 0) {
            long i = n % chars.length;
            for (int j = 0; j < i; j++) {
                if (chars[j] == 'a') total++;
            }
        }
        return total;
    }


    public static void main(String[] args) {
        String s = "aba";
        long n = 10L;
        System.out.println(repeatedString(s, n));
    }
}

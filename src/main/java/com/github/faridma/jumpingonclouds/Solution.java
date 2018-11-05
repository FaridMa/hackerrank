package com.github.faridma.jumpingonclouds;

/**
 * @author Farid F. Mammadov
 * My solution for:
 * <a href="https://www.hackerrank.com/challenges/jumping-on-the-clouds">Jumping On Clouds</a>
 */
public class Solution {
    private static final int THUNDERHEAD = 1;

    // Complete the jumpingOnClouds function below.
    static int jumpingOnClouds(int[] c) {
        int steps = 0;
        int i = 0;
        while (i < c.length - 1) {
            if (i + 2 < c.length && c[i + 2] != THUNDERHEAD) {
                i += 2;
            } else {
                i++;
            }
            steps++;
        }
        return steps;
    }


    public static void main(String[] args) {
        int[] c = {0, 0, 0, 0, 1, 0};
        System.out.println(jumpingOnClouds(c));
    }
}


package com.github.faridma.countingvalleys;

/**
 * @author Farid F. Mammadov
 * My solution for:
 * <a href="https://www.hackerrank.com/challenges/counting-valleys">Counting Valleys</a>
 */
public class Solution {
    private static final char DOWN = 'D';
    private static final int SEA_LEVEL = 0;

    static int countingValleys(int n, String s) {
        char[] steps = s.toCharArray();
        int counter = 0;
        boolean valleyStarted = false;
        boolean valleyEnd = false;
        int currentLevel = SEA_LEVEL;
        for (char step : steps) {
            if (step == DOWN) {
                currentLevel--;
            } else {
                currentLevel++;
            }
            if (currentLevel < SEA_LEVEL) {
                valleyStarted = true;
            } else {
                if (valleyStarted) {
                    valleyEnd = true;
                }
            }

            if (valleyStarted && valleyEnd) {
                valleyStarted = false;
                valleyEnd = false;
                counter++;
            }
        }
        return counter;
    }


    public static void main(String[] args) {
        String path = "UDDDUDUU";
        System.out.println(countingValleys(path.length(), path));
    }
}

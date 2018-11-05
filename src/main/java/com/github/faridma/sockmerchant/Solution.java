package com.github.faridma.sockmerchant;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Farid F. Mammadov
 * My solution for:
 * <a href="https://www.hackerrank.com/challenges/sock-merchant">Sock Merchant</a>
 */
public class Solution {
    static int sockMerchant(int n, int[] ar) {
        int pairs = 0;
        Map<Integer, Integer> colors = new HashMap<>();
        for (int i = 0; i < n; i++) {
            Integer quantity = colors.getOrDefault(ar[i], 0);
            quantity++;
            colors.put(ar[i], quantity);
            if (quantity % 2 == 0) pairs++;
        }
        return pairs;
    }


    public static void main(String[] args) {
        int[] arr = {10, 20, 20, 10, 10, 30, 50, 10, 20};
        System.out.println(sockMerchant(arr.length, arr));
    }
}

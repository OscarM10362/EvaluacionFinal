/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.umg.fibonacci;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci {

     public static List<Integer> fibonacci(int[] signature, int n) {
        List<Integer> result = new ArrayList<>();

        if (n == 0) return result;

        for (int i = 0; i < Math.min(2, n); i++) {
            result.add(signature[i]);
        }

        for (int i = 2; i < n; i++) {
            int next = result.get(i - 1) + result.get(i - 2);
            result.add(next);
        }

        return result;
    }
}


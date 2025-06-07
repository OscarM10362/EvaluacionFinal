/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.umg.fibonacci.Test;

import com.umg.fibonacci.Fibonacci;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 *
 * @author Oscar
 */
public class TestFibonacci {
    
    @Test
    public void testFibonacci9Elements() {
        int[] signature = {0, 1};
        List<Integer> expected = List.of(0, 1, 1, 2, 3, 5, 8, 13, 21);
        assertEquals(expected, Fibonacci.fibonacci(signature, 9));
    }

    @Test
    public void testFibonacci5ElementsCustomStart() {
        int[] signature = {2, 3};
        List<Integer> expected = List.of(2, 3, 5, 8, 13);
        assertEquals(expected, Fibonacci.fibonacci(signature, 5));
    }
}

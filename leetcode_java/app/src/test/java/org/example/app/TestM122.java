package org.example.app;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestM122 {
    @Test
    void case1() {
        Medium122 inst = new Medium122();
        int[] prices = { 7, 1, 5, 3, 6, 4 };
        int k = inst.maxProfit(prices);
        assertEquals(7, k);
    }

    @Test
    void case2() {
        Medium122 inst = new Medium122();
        int[] prices = { 1, 2, 3, 4, 5 };
        int k = inst.maxProfit(prices);
        assertEquals(4, k);
    }

    @Test
    void case3() {
        Medium122 inst = new Medium122();
        int[] prices = { 7, 6, 4, 3, 1 };
        int k = inst.maxProfit(prices);
        assertEquals(0, k);
    }

    @Test
    void case4() {
        Medium122 inst = new Medium122();
        int[] prices = { 1,2 };
        int k = inst.maxProfit(prices);
        assertEquals(1, k);
    }
}

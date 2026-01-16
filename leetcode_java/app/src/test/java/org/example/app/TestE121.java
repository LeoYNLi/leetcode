package org.example.app;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestE121 {
    @Test
    void case1() {
        Easy121 inst = new Easy121();
        int[] prices = { 7, 1, 5, 3, 6, 4 };
        int k = inst.maxProfit(prices);
        assertEquals(5, k);
    }

    @Test
    void case2() {
        Easy121 inst = new Easy121();
        int[] prices = { 7, 6, 4, 3, 1 };
        int k = inst.maxProfit(prices);
        assertEquals(0, k);
    }

}

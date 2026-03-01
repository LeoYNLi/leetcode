package org.example.app;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.example.app.arrayOrString.Medium274;
import org.junit.jupiter.api.Test;

public class TestM274 {
    @Test
    void case1() {
        int[] citations = { 3, 0, 6, 1, 5 };
        Medium274 inst = new Medium274();
        int k = inst.hIndex(citations);
        assertEquals(3, k);
    }

    @Test
    void case2() {
        int[] citations = { 1, 3, 1 };
        Medium274 inst = new Medium274();
        int k = inst.hIndex(citations);
        assertEquals(1, k);
    }

    @Test
    void case3() {
        int[] citations = { 100 };
        Medium274 inst = new Medium274();
        int k = inst.hIndex(citations);
        assertEquals(1, k);
    }
}

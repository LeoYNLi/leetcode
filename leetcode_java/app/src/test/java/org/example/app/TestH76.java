package org.example.app;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestH76 {
    @Test
    void case1() {
        String s = "ADOBECODEBANC";
        String t = "ABC";
        Hard76 inst = new Hard76();
        String res = inst.minWindow(s, t);
        assertEquals("BANC", res);
    }
}

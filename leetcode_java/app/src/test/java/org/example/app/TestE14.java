package org.example.app;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestE14 {
    @Test
    void case1() {
        String[] strs = { "flower", "flow", "flight" };
        Easy14 inst = new Easy14();
        String res = inst.longestCommonPrefix(strs);
        assertEquals("fl", res);
    }

    @Test
    void case2() {
        String[] strs = { "dog", "racecar", "car" };
        Easy14 inst = new Easy14();
        String res = inst.longestCommonPrefix(strs);
        assertEquals("", res);
    }

    @Test
    void case3() {
        String[] strs = { "a", "b", };
        Easy14 inst = new Easy14();
        String res = inst.longestCommonPrefix(strs);
        assertEquals("", res);
    }

    @Test
    void case4() {
        String[] strs = { "ab", "a", };
        Easy14 inst = new Easy14();
        String res = inst.longestCommonPrefix(strs);
        assertEquals("a", res);
    }

    @Test
    void case5() {
        String[] strs = { "abab", "aba", "" };
        Easy14 inst = new Easy14();
        String res = inst.longestCommonPrefix(strs);
        assertEquals("", res);
    }
}

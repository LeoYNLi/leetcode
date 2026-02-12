package org.example.app;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestM3 {
    @Test
    void case1() {
        String s = "abcabcbb";
        Medium3 inst = new Medium3();
        int k = inst.lengthOfLongestSubstring(s);
        assertEquals(3, k);
    }

    @Test
    void case2() {
        String s = "bbbbb";
        Medium3 inst = new Medium3();
        int k = inst.lengthOfLongestSubstring(s);
        assertEquals(1, k);
    }

    @Test
    void case3() {
        String s = "pwwkew";
        Medium3 inst = new Medium3();
        int k = inst.lengthOfLongestSubstring(s);
        assertEquals(3, k);
    }

    @Test
    void case4() {
        String s = "aab";
        Medium3 inst = new Medium3();
        int k = inst.lengthOfLongestSubstring(s);
        assertEquals(2, k);
    }

    @Test
    void case5() {
        String s = "dvdf";
        Medium3 inst = new Medium3();
        int k = inst.lengthOfLongestSubstring(s);
        assertEquals(3, k);
    }

    @Test
    void case6() {
        String s = "au";
        Medium3 inst = new Medium3();
        int k = inst.lengthOfLongestSubstring(s);
        assertEquals(2, k);
    }

}

package org.example.app;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.example.app.arrayOrString.Easy28;
import org.junit.jupiter.api.Test;

public class TestE28 {
    @Test
    void case1() {
        String haystack = "sadbutsad";
        String needle = "sad";
        Easy28 inst = new Easy28();
        int k = inst.strStr(haystack, needle);
        assertEquals(0, k);
    }

    @Test
    void case2() {
        String haystack = "leetcode";
        String needle = "leeto";
        Easy28 inst = new Easy28();
        int k = inst.strStr(haystack, needle);
        assertEquals(-1, k);
    }

    @Test
    void case3() {
        String haystack = "a";
        String needle = "a";
        Easy28 inst = new Easy28();
        int k = inst.strStr(haystack, needle);
        assertEquals(0, k);
    }

    @Test
    void case4() {
        String haystack = "hello";
        String needle = "ll";
        Easy28 inst = new Easy28();
        int k = inst.strStr(haystack, needle);
        assertEquals(2, k);
    }
}

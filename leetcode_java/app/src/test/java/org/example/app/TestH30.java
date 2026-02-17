package org.example.app;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

public class TestH30 {
    @Test
    void case1() {
        String s = "barfoothefoobarman";
        String[] words = { "foo", "bar" };
        Hard30 inst = new Hard30();
        List<Integer> res = inst.findSubstring(s, words);
        List<Integer> expected = new ArrayList<>();
        expected.add(0);
        expected.add(9);

        assertEquals(expected, res);

    }

    @Test
    void case2() {
        String s = "wordgoodgoodgoodbestword";
        String[] words = { "word", "good", "best", "word" };
        Hard30 inst = new Hard30();
        List<Integer> res = inst.findSubstring(s, words);
        List<Integer> expected = new ArrayList<>();

        assertEquals(expected, res);

    }

    @Test
    void case3() {
        String s = "barfoofoobarthefoobarman";
        String[] words = { "bar", "foo", "the" };
        Hard30 inst = new Hard30();
        List<Integer> res = inst.findSubstring(s, words);
        List<Integer> expected = new ArrayList<>();
        expected.add(6);
        expected.add(9);
        expected.add(12);

        assertEquals(expected, res);

    }

    @Test
    void case4() {
        String s = "barfoobarxfoobarx";
        String[] words = { "foo", "bar" };
        Hard30 inst = new Hard30();
        List<Integer> res = inst.findSubstring(s, words);
        List<Integer> expected = new ArrayList<>();
        expected.add(0);
        expected.add(3);
        expected.add(10);

        assertEquals(expected, res);

    }
}

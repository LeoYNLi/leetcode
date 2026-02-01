package org.example.app;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestE151 {
    @Test
    void case1() {
        String s = "a good   example";
        Easy151 inst = new Easy151();
        String res = inst.reverseWords(s);
        assertEquals("example good a", res);
    }
}

package org.example.app;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestE58 {
    @Test
    void case1() {
        String s = "   fly me   to   the moon  ";
        Easy58 inst = new Easy58();
        int k = inst.lengthOfLastWord(s);
        assertEquals(4, k);
    }

    @Test
    void case2() {
        String s = "Hello World";
        Easy58 inst = new Easy58();
        int k = inst.lengthOfLastWord(s);
        assertEquals(5, k);
    }

    @Test
    void case3() {
        String s = "luffy is still joyboy";
        Easy58 inst = new Easy58();
        int k = inst.lengthOfLastWord(s);
        assertEquals(6, k);
    }
}

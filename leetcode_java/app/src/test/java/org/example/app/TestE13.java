package org.example.app;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestE13 {
    @Test
    void case1() {
        Easy13 inst = new Easy13();
        String s = "III";
        int k = inst.romanToInt(s);
        assertEquals(3, k);
    }

    @Test
    void case2() {
        Easy13 inst = new Easy13();
        String s = "LVIII";
        int k = inst.romanToInt(s);
        assertEquals(58, k);
    }

    @Test
    void case3() {
        Easy13 inst = new Easy13();
        String s = "MCMXCIV";
        int k = inst.romanToInt(s);
        assertEquals(1994, k);
    }
}

package org.example.app;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.example.app.arrayOrString.Medium12;
import org.junit.jupiter.api.Test;

public class TestM12 {
    @Test
    void case1() {
        Medium12 inst = new Medium12();
        int num = 3749;
        String s = inst.intToRoman(num);
        assertEquals("MMMDCCXLIX", s);
    }

    @Test
    void case2() {
        Medium12 inst = new Medium12();
        int num = 58;
        String s = inst.intToRoman(num);
        assertEquals("LVIII", s);
    }

    @Test
    void case3() {
        Medium12 inst = new Medium12();
        int num = 1994;
        String s = inst.intToRoman(num);
        assertEquals("MCMXCIV", s);
    }

}

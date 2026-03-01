package org.example.app;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.example.app.arrayOrString.Medium6;
import org.junit.jupiter.api.Test;

public class TestM6 {

    @Test
    void case1() {
        String s = "PAYPALISHIRING";
        Medium6 inst = new Medium6();
        String res = inst.convert(s, 3);
        String expext = "PAHNAPLSIIGYIR";
        assertEquals(expext, res);
    }

    @Test
    void case2() {
        String s = "PAYPALISHIRING";
        Medium6 inst = new Medium6();
        String res = inst.convert(s, 4);
        String expext = "PINALSIGYAHRPI";
        assertEquals(expext, res);
    }
}

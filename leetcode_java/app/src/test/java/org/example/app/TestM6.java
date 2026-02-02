package org.example.app;

import org.junit.jupiter.api.Test;

public class TestM6 {

    @Test
    void case1() {
        String s = "PAYPALISHIRING";
        Medium6 inst = new Medium6();
        String res = inst.convert(s, 3);
        String expext = "PAHNAPLSIIGYIR";
    }

    @Test
    void case2() {
        String s = "PAYPALISHIRING";
        Medium6 inst = new Medium6();
        String res = inst.convert(s, 4);
        String expext = "PINALSIGYAHRPI";
    }
}

package org.example.app;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.example.app.twoPointer.Easy392;
import org.junit.jupiter.api.Test;

public class TestE392 {
    @Test
    void case1() {
        String s = "abc";
        String t = "ahbgdc";
        Easy392 inst = new Easy392();
        boolean res = inst.isSubsequence(s, t);
        assertEquals(true, res);
    }

    @Test
    void case2() {
        String s = "axc";
        String t = "ahbgdc";
        Easy392 inst = new Easy392();
        boolean res = inst.isSubsequence(s, t);
        assertEquals(false, res);
    }

    @Test
    void case3() {
        String s = "b";
        String t = "c";
        Easy392 inst = new Easy392();
        boolean res = inst.isSubsequence(s, t);
        assertEquals(false, res);
    }

    @Test
    void case4() {
        String s = "";
        String t = "ahbgdc";
        Easy392 inst = new Easy392();
        boolean res = inst.isSubsequence(s, t);
        assertEquals(true, res);
    }

    @Test
    void case5() {
        String s = "acb";
        String t = "ahbgdc";
        Easy392 inst = new Easy392();
        boolean res = inst.isSubsequence(s, t);
        assertEquals(false, res);
    }
}

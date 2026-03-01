package org.example.app;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.example.app.twoPointer.Easy125;
import org.junit.jupiter.api.Test;

public class TestE125 {
    @Test
    void case1() {
        String s = "A man, a plan, a canal: Panama";
        Easy125 inst = new Easy125();
        boolean res = inst.isPalindrome(s);
        assertEquals(true, res);

    }

    @Test
    void case2() {
        String s = "0P";
        Easy125 inst = new Easy125();
        boolean res = inst.isPalindrome(s);
        assertEquals(false, res);

    }
}

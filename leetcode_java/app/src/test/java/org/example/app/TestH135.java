package org.example.app;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.example.app.arrayOrString.Hard135;
import org.junit.jupiter.api.Test;

public class TestH135 {
    @Test
    void case1() {
        int[] ratings = new int[] { 1, 0, 2 };
        Hard135 inst = new Hard135();
        int k = inst.candy(ratings);
        assertEquals(5, k);
    }

    @Test
    void case2() {
        int[] ratings = new int[] { 1, 2, 2 };
        Hard135 inst = new Hard135();
        int k = inst.candy(ratings);
        assertEquals(4, k);
    }

    @Test
    void case3() {
        int[] ratings = new int[] { 1, 3, 2, 2, 1 };
        Hard135 inst = new Hard135();
        int k = inst.candy(ratings);
        assertEquals(7, k);
    }

    @Test
    void case4() {
        int[] ratings = new int[] { 1, 3, 4, 5, 2 };
        Hard135 inst = new Hard135();
        int k = inst.candy(ratings);
        assertEquals(11, k);
    }

}

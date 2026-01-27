package org.example.app;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestH42 {
    @Test
    void case1() {
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        Hard42 inst = new Hard42();
        int k = inst.trap(height);
        assertEquals(6, k);
    }

    @Test
    void case2() {
        int[] height = {4,2,0,3,2,5};
        Hard42 inst = new Hard42();
        int k = inst.trap(height);
        assertEquals(9, k);
    }
    
}

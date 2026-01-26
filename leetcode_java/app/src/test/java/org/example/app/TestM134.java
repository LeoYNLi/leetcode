package org.example.app;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestM134 {
    @Test
    public void case1() {
        int[] gas = new int[] { 1, 2, 3, 4, 5 };
        int[] cost = new int[] { 3, 4, 5, 1, 2 };
        Medium134 inst = new Medium134();
        int res = inst.canCompleteCircuit(gas, cost);
        assertEquals(3, res);
    }

    @Test
    public void case2() {
        int[] gas = new int[] { 2, 3, 4 };
        int[] cost = new int[] { 3, 4, 3 };
        Medium134 inst = new Medium134();
        int res = inst.canCompleteCircuit(gas, cost);
        assertEquals(-1, res);
    }

    @Test
    public void case3() {
        int[] gas = new int[] { 5, 1, 2, 3, 4 };
        int[] cost = new int[] { 4, 4, 1, 5, 1 };
        Medium134 inst = new Medium134();
        int res = inst.canCompleteCircuit(gas, cost);
        assertEquals(4, res);
    }
}

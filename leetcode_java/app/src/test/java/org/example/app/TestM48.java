package org.example.app;

import org.example.app.matrix.Medium48;
import org.junit.jupiter.api.Test;

public class TestM48 {
    @Test
    void case1() {
        int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int[][] expect = { { 7, 4, 1 }, { 8, 5, 2 }, { 9, 6, 3 } };
        Medium48 inst = new Medium48();
        inst.rotate(null);
    }

    @Test
    void case2() {
        int[][] matrix = { { 5, 1, 9, 11 }, { 2, 4, 8, 10 }, { 13, 3, 6, 7 }, { 15, 14, 12, 16 } };
        int[][] expect = { { 15, 13, 2, 5 }, { 14, 3, 4, 1 }, { 12, 6, 8, 9 }, { 16, 7, 10, 11 } };
        Medium48 inst = new Medium48();
        inst.rotate(null);
    }
}

package org.example.app;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.example.app.matrix.Medium73;
import org.junit.jupiter.api.Test;

public class TestM73 {
    @Test
    void case1() {
        int[][] matrix = new int[][] { { 1, 1, 1 }, { 1, 0, 1 }, { 1, 1, 1 } };
        int[][] result = new int[][] { { 1, 0, 1 }, { 0, 0, 0 }, { 1, 0, 1 } };
        Medium73 inst = new Medium73();
        inst.setZeroes(matrix);
        assertArrayEquals(matrix, result);
    }

    @Test
    void case2() {
        int[][] matrix = new int[][] { { 0, 1, 2, 0 }, { 3, 4, 5, 2 }, { 1, 3, 1, 5 } };
        int[][] result = new int[][] { { 0, 0, 0, 0 }, { 0, 4, 5, 0 }, { 0, 3, 1, 0 } };
        Medium73 inst = new Medium73();
        inst.setZeroes(matrix);
        assertArrayEquals(matrix, result);
    }
}

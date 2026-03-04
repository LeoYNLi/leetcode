package org.example.app.matrix;

import java.util.HashSet;

public class Medium73 {
    public void setZeroes(int[][] matrix) {
        HashSet<Integer> zeroCol = new HashSet<>();
        HashSet<Integer> zeroRow = new HashSet<>();

        for (int r = 0; r < matrix.length; r++) {

            for (int c = 0; c < matrix[0].length; c++) {
                if (matrix[r][c] == 0) {
                    zeroCol.add(c);
                    zeroRow.add(r);
                }
            }
        }

        int[] newRow = new int[matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            if (zeroRow.contains(i)) {
                matrix[i] = newRow;
            }
            for (int col : zeroCol) {
                matrix[i][col] = 0;
            }
        }
    }

}

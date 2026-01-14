package org.example.app;

public class Easy88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int lastIndex = m + n - 1;
        int mIndex = m - 1;
        int nIndex = n - 1;
        while (mIndex >= 0 & nIndex >= 0) {
            if (nums1[mIndex] > nums2[nIndex]) {
                nums1[lastIndex] = nums1[mIndex];
                mIndex -= 1;
            } else {
                nums1[lastIndex] = nums2[nIndex];
                nIndex -= 1;
            }
            lastIndex -= 1;
        }

        while (nIndex >= 0) {
            nums1[lastIndex] = nums2[nIndex];
            nIndex -= 1;
            lastIndex -= 1;
        }
    }
}
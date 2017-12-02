package com.company.part2;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] a = {1,3,7,8,2,5,6,9};
        System.out.println("   "+ Arrays.toString(a));
//        mergeSort(a, 1, 7);
//        System.out.println("   "+ Arrays.toString(a));
        System.out.println("   "+ Arrays.toString(merge(a, 1, 4, 7)));

    }

    private static void mergeSort(int[] a, int p, int r) {
        if (p < r) {
            int q = r + p / 2;
            mergeSort(a, p, q);
            mergeSort(a, q + 1, r);
//            merge(a, p, q, r);
        }
    }

    private static int[] merge(int[] a, int p, int q, int r) {
        int[] res = new int[r+1];
        int n1 = q - p;
        int n2 = r - q + 1;
        int[] arrLeft = new int[n1];
        int[] arrRight = new int[n2];
        for (int i = 0; i < n1; i++) {
            arrLeft[i] = a[p + i];
        }
        for (int j = 0; j < n2; j++) {
            arrRight[j] = a[q + j];
        }
        int i = 0;
        int j = 0;
        for (int k = p; k <= r; k++) {
            if ((i < arrLeft.length) && (j < arrRight.length) && arrLeft[i] <= arrRight[j]) {
                res[k] = arrLeft[i];
                i = i + 1;
            } else {
                res[k] = arrRight[j];
                j = j + 1;
            }
        }
        return res;
    }
}

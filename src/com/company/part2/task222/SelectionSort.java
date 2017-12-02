package com.company.part2.task222;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] a = {4,3,7,34};
        System.out.println("   "+ Arrays.toString(a));
        System.out.println("   "+Arrays.toString(selectionSort(a)));
    }

    private static int[] selectionSort(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            int left = a[i];
            for (int j = i + 1; j < a.length - 1; j++) {
                if(a[i] > a[j]) {
                    a[i] = a[j];
                    a[j] = left;
                }
            }
        }
        return a;
    }
}

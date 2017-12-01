package com.company.part2;

import java.util.Arrays;

public class BinarySum {
    public static void main(String[] args) {
        int[] a = {1, 0, 1, 0, 1, 0};
        int[] b = {1, 0, 0, 0, 1, 0};
        System.out.println("   "+Arrays.toString(a));
        System.out.println("   "+Arrays.toString(b));
        System.out.println(""+Arrays.toString(binarySum(a, b)));
    }

    private static int[] binarySum(int[] a, int[] b) {
        int length = a.length;
        int[] c = new int[length+1];
        int C = 0;
        for (int i = length - 1; i >= 0; i--) {
            c[i+1] = (a[i] + b[i] + C) % 2;
            C = (a[i] + b[i] + C) / 2;
        }
        c[0] = C;

        return c;
    }
}

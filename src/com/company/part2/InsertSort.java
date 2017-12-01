package com.company.part2;

import java.util.Arrays;

public class InsertSort {
    static int[] insertSort(int[] arr){
        for (int j = 1; j < arr.length; j++) {
            int right = arr[j]; //value=5
            int i = j - 1; // index=0
            while(i>=0 && arr[i] > right){
                arr[i+1] = arr[i];
                i=i-1;
            }
            arr[i+1] = right;
        }
        return arr;
    }

    static int[] reverseInsertSort(int[] arr){
        for (int j = 1; j < arr.length; j++) {
            int right = arr[j];
            int i = j -1;
            while (i >= 0 && arr[i] < right) {
                arr[i+1] = arr[i];
                i = i-1;
            }
            arr[i+1] = right;
        }
        return arr;
    }

    public static void main(String[] args) {
        int [] arr = {3, 5, 1, 7, 8, 6, 2};
        System.out.println(Arrays.toString(arr));
//        System.out.println(Arrays.toString(insertSort(arr)));
        System.out.println(Arrays.toString(reverseInsertSort(arr)));
    }
}

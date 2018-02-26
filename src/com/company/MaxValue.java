package com.company;


import java.util.Arrays;

public class MaxValue {

    private int[] arr;

    static int max;
    private static int index;

    public static int maxValue(int[] arr) {
        max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                index = i;
            }
        }
        return max;
    }

    public static int[] nMaxValue(int[] arr, int n) {
        int[] arrMax = new int[n];
        max = 0;
        for (int j = 0; j < n; j++) {
            maxValue(arr);
            arrMax[j] = max;
            System.arraycopy(arr, index+1, arr, index, arr.length - index - 1);
            int[] arrTmp = Arrays.copyOf(arr, arr.length-1);
            arr = arrTmp;
        }
        return arrMax;
    }

}

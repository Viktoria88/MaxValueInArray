package com.company;

import static com.company.MaxValue.maxValue;
import static com.company.MaxValue.nMaxValue;

public class Main {

    public static void main(String[] args) {

        int[] arr = new int[]{7, 9, 3, 6, 13, 1, 5};
        System.out.println("Max value: " + maxValue(arr));

        int[] arrMax = nMaxValue(arr, 3);
        for (int i = 0; i < arrMax.length; i++) {
            System.out.println(arrMax.length + " max value: " + arrMax[i]);
        }
    }


}

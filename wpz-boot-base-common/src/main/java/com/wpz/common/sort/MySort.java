package com.wpz.common.sort;

public class MySort {

    public static Integer[] bubbleSort(Integer[] arr) {

        int length = arr.length;
        int temp;
        for (int i = 0; i < length - 1; i++) {
            for (int j = 0; j < length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        Integer[] arr = {1, 5, 6, 7, 3, 4, 2, 3};
        Integer[] integers = bubbleSort(arr);
        for (Integer i : integers) {
            System.out.println(i);
        }
    }
}
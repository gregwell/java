package com.agh.p3_algorithms.example1.sorting_algorithms;

import com.agh.p3_algorithms.example1.SortBehaviour;

public class InsertionSort implements SortBehaviour {
    @Override
    public void sort(int[] arr)
    {
        System.out.println("sorting using insertion sort. its good tim to say hello ;)");
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

}

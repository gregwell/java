package com.agh.p3_algorithms.example1.sorting_algorithms;

import com.agh.p3_algorithms.example1.SortBehaviour;

public class BubbleSort implements SortBehaviour {
    @Override
    public void sort(int[] arr) {

        System.out.println("sorting using bubble sort. its good tim to say hello ;)");

        int n = arr.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (arr[j] > arr[j+1])
                {
                    // swap arr[j+1] and arr[j]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }

    }
}

package com.agh.p3_algorithms.example1;

import com.agh.p3_algorithms.example1.sorting_algorithms.InsertionSort;

public class Main {

    public static void main(String[] args) {

        int var[] = {1,2,3,4,5};
        Context a = new Context(new InsertionSort());
        a.performSort(var);

    }
}
package com.agh.p3_algorithms.example1;

public class Context {
    private final SortBehaviour sortBehaviour;

    public Context(SortBehaviour sortBehaviour) {
        this.sortBehaviour = sortBehaviour;
    }

    public void performSort(int[] input) {
        sortBehaviour.sort(input);
    }



}

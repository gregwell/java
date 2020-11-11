package com.agh.p3_algorithms.example1;

import com.agh.p3_algorithms.example1.sorting_algorithms.QuickSort;

public class Main {

    public static void main(String[] args) {

        //przypadek pesymistyczny
        int var_p[] = {13,8,5,3,1};
        //przypadek random
        int var_random[] = {1,8,3,13,5};
        //przypadek optymistyczny
        int var_o[] = {1,3,5,8,13};
        Context a = new Context(new QuickSort());


        long start=System.nanoTime();
        a.performSort(var_p);
        long stop=System.nanoTime();
        System.out.println("Time pes :"+(stop-start)+" nanosec.");

        start=System.nanoTime();
        a.performSort(var_random);
        stop=System.nanoTime();
        System.out.println("Time rand:"+(stop-start)+" nanosec.");

        start=System.nanoTime();
        a.performSort(var_o);
        stop=System.nanoTime();
        System.out.println("Time opt:"+(stop-start)+" nanosec.");

        int n=var_p.length;
        for (int i = 0; i < n; ++i)
            System.out.print(var_p[i] + " ");

        System.out.println();

    }
}
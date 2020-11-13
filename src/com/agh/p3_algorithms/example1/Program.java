package com.agh.p3_algorithms.example1;

import com.agh.p3_algorithms.example1.sorting_algorithms.QuickSort;

import java.util.Arrays;
import java.util.Random;

public class Program {

    public Program() {
    }

    public void execute() {

        //przypadek pesymistyczny
        int var_p[] = {13,8,5,3,1};

        //przypadek random
        Random r = new Random();
        int[] var_random = new int[50];
        for ( int i = 0 ; i <50 ; i++) {
            var_random[i] = r.nextInt((2000001)-1000000);
        }
        int [] var_random_clone = var_random.clone();

        //przypadek optymistyczny
        int var_o[] = {1,3,5,8,13};


        Context a = new Context(new QuickSort());


        long start=System.nanoTime();
        a.performSort(var_p);
        long stop=System.nanoTime();
        System.out.println("TIME PESIMICTIC :"+(stop-start)+" nanosec.");


        start=System.nanoTime();
        a.performSort(var_random);
        stop=System.nanoTime();
        System.out.println("TIME RANDOM:"+(stop-start)+" nanosec.");

        start=System.nanoTime();
        Arrays.sort(var_random_clone);
        stop=System.nanoTime();
        System.out.println("TIME RANDOM CLONE(ARRAY.SORT()):"+(stop-start)+" nanosec.");




        start=System.nanoTime();
        a.performSort(var_o);
        stop=System.nanoTime();
        System.out.println("TIME OPTIMISTIC:"+(stop-start)+" nanosec.");

        int n=var_random.length;
        for (int i = 0; i < n; ++i)
            System.out.print(var_random[i] + " ");

        System.out.println();
    }

}

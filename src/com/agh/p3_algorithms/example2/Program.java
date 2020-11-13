package com.agh.p3_algorithms.example2;

import java.util.Arrays;
import java.util.HashMap;

public class Program {

    //arr[] - ARRAY OF ELEMENTS
    //target - RESULT OF MULTIPLICATION
    //n - ARRAY LENGTH
    public int[]spot(int arr[], int target) throws NoSolutionException {

        int n = arr.length;
        //VALUE , INDEX
        HashMap<Integer,Integer> map = new HashMap<>();

            for (int i = 0; i < n; i++) {
                // ASSUMPTIONS:
                // 1) I CAN'T DIVIDE BY 0
                // 2) THE REST OF DIVISION MUST BE 0 TO CONSIDER THIS ELEMENT
                if ((arr[i] != 0) && (target % arr[i] == 0)) {
                    // IF I'M INSIDE THIS LOOP CURRENT ARR[i] MAY BE ONE OF DESIRED NUMBERS
                    // BUT I HAVE TO FIND OUT IF THERE IS THE OTHER ONE TO CREATE PAIR
                    int findThisNumber = target / arr[i];

                    // IF THERE IS THE NUMBER THAT I AM LOOKING FOR IN THE MAP
                    if (map.get(findThisNumber) != null) {
                        // RETURN {INDEX OF CONSIDERED NUMBER, INDEX OF DESIRED NUMBER}
                        return new int[]{i, map.get(findThisNumber)};
                    }
                    //IF THERE ISN'T PUT IN THE MAP {NUMBER, INDEX OF THE NUMBER} WHICH CAN BE USED FOR FURTHER SEARCHES
                    map.put(arr[i], i);
                }
            }
            throw new NoSolutionException("no solution");
    }

    public void execute() throws NoSolutionException {

        int arr[] = {-34,-56,1,3,3,5,6,29,71};

       System.out.println("Return ..: " + Arrays.toString(spot(arr,9)));

    }
}

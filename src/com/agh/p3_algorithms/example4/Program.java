package com.agh.p3_algorithms.example4;

public class Program {

    public int[] maxTriplet(int arr[]) throws Exception
    {
        // CASE: TOO SHORT ARRAY
        if(arr.length<3)
            throw new Exception("Sorry, provided array is too short");
        // CASE: ARRAY CONSISTING OF 3 ELEMENTS
        if(arr.length==3)
            return arr;
        // CASE: PROPER ARRAY
        
        //FIRSTLY: I FIL THE BIGGEST ARR WITH FIRST 3 ELEMENTS
        int biggest[]=new int[] {arr[0],arr[1],arr[2]};
        for(int i=3;i<arr.length;i++)
        {
            replaceMin(biggest,arr[i]);
        }
        return biggest;
    }

    public void replaceMin(int [] arrBiggest, int iElementValue)
    {
        int tempIndex=0;
        // IF ARR[i] ELEMENTS IS BIGGER THAN ANY OF BIGGER ARR ELEMENTS, THEN REPLACE
        for (int i=0;i<arrBiggest.length;i++)
        {
            if(arrBiggest[tempIndex]>arrBiggest[i])
                tempIndex=i;
        }
        arrBiggest[tempIndex]=iElementValue;
    }

    public void execute() {
        int arr[]={-5,-7,10,1};
        try {
            int[] p = maxTriplet(arr);
            int sum = p[0]+p[1]+p[2];
            System.out.println(p[0]+" + "+p[1]+" + "+p[2]+" = "+sum);
        } catch (Exception e) {

        }
    }

}

package com.agh.p3_algorithms.example3;

public class Program {

    public int substring(String a, String b) {

        String a_temp = a;
        int counter = 1;

        while (!a_temp.contains(b))
        {
            a_temp += a;
            counter++;

            if (counter == 100)
                return -1;
            //IF AFTER 100 EXECUTIONS A WILL NOT BE INCLUDED IN B - HOLD OFF
        }
        return counter;


    }

    public void execute(){

        String a="abcd";
        String b = "cdabcdab";

        System.out.println("The number of repetitions: " + substring(a,b));

    }
}

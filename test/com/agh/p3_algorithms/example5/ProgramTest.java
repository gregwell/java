package com.agh.p3_algorithms.example5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProgramTest {

    @Test
    public void testprintSpiralMatrix() {
        String str= "5 4 3 2 1 6 11 16 21 22 23 24 25 20 15 10 9 8 7 12 17 18 19 14 13 ";
        try{
            Program p=new Program();

            int[][] matrix = {
                    { 1,  2,  3,  4,  5},
                    { 6,  7,  8,  9, 10},
                    {11, 12, 13, 14, 15},
                    {16, 17, 18, 19, 20},
                    {21, 22, 23, 24, 25}
            };

            assertEquals(str,p.printSpiralMatrix(matrix));
        }catch(Exception e){

        }
    }



}
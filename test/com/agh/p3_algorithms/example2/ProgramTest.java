package com.agh.p3_algorithms.example2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProgramTest {

    @Test
    void testSpotThrows(){
        Program a=new Program();
        int arr[]={0,0,0,0,0,0,0,0};
        assertThrows(NoSolutionException.class, ()->a.spot(arr,1));
    }

    @Test
    void testSpotCorrectness(){
        Program a=new Program();
        int arr[]={1,0,2,3,6};
        int expected[]={4,3};
        int result[];
        try{
            result=a.spot(arr,18);
            assertArrayEquals(expected, result);
        }catch(Exception e){

        }
    }

    @Test
    void testSpotCorrectness2(){
        Program a=new Program();
        int arr[]={1,0,2,3,5};
        int expected[]={3,2};
        int result[];
        try{
            result=a.spot(arr,6);
            assertArrayEquals(expected, result);
        }catch(Exception e){

        }
    }

    @Test
    void testSpotCorrectness3(){
        Program a=new Program();
        int arr[]={1,0,-8,3,2};
        int expected[]={4,2};
        int result[]=new int[2];
        try{
            result=a.spot(arr,-16);
            assertArrayEquals(expected, result);
        }catch(Exception e){

        }
    }

    @Test
    void testSpotCorrectness4(){
        Program a=new Program();
        int arr[]={1,0,2,10,5};
        int expected[]={3,0};
        int result[]=new int[2];
        try{
            result=a.spot(arr,10);
            assertArrayEquals(expected, result);
        }catch(Exception e){

        }
    }
    
    
}
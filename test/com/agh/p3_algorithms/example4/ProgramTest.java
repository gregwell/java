package com.agh.p3_algorithms.example4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProgramTest {

    @Test
    public void testmaxTripletCorrectness1(){
        Program a=new Program();
        int tab[]={0,1,2,3,4,5,6,7,8,10,11,12,13,14};
        int expected[]=new int []{13,14,12};
        try {
            int result[] = a.maxTriplet(tab);
            assertArrayEquals(expected,result);
        }catch (Exception e){

        }
    }

    @Test
    public void testmaxTripletCorrectness2(){
        Program a=new Program();
        int tab[]={14,1,2,3,4,5,6,7,8,10,11,12,13,14};
        int expected[]=new int []{14,14,13};
        try {
            int result[] = a.maxTriplet(tab);
            assertArrayEquals(expected,result);
        }catch (Exception e){

        }
    }

    @Test
    public void testmaxTripletCorrectness3(){
        Program a=new Program();
        int tab[]={0,0,0};
        int expected[]=new int []{0,0,0};
        try {
            int result[] = a.maxTriplet(tab);
            assertArrayEquals(expected,result);
        }catch (Exception e){

        }
    }

    public void testmaxTripletCorrectness4(){
        Program a=new Program();
        int tab[]={0,-1,2,-5};
        int expected[]=new int []{0,-1,2};
        try {
            int result[] = a.maxTriplet(tab);
            assertArrayEquals(expected,result);
        }catch (Exception e){

        }
    }

    @Test
    public void testmaxTripletSize(){
        Program a=new Program();
        int tab[]={0,-1};
        try {
            int result[] = a.maxTriplet(tab);
            assertThrows(Exception.class, ()->a.maxTriplet(tab));
        }catch (Exception e){

        }
    }

    @Test
    public void testReplace(){
        Program a=new Program();
        int tab[]={2,3,4};
        a.replaceMin(tab,1);
        int expected[]={1,3,4};
        assertArrayEquals(expected,tab);
    }

    @Test
    public void testReplace2(){
        Program a=new Program();
        int tab[]={3,3,3};
        a.replaceMin(tab,1);
        int expected[]={1,3,3};
        assertArrayEquals(expected,tab);
    }

}
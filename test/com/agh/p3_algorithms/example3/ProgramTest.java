package com.agh.p3_algorithms.example3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProgramTest {

    @Test
    public void testsubstringCorrectness1(){
        String a="abcd";
        String b = "cdabcdab";
        Program aa=new Program();
        int c=0;
        try {
            c = aa.substring(a, b);
            assertEquals(3,c);
        }catch (Exception e){

        }
    }

    @Test
    public void testsubstringCorrectness2(){
        String a="xyzx";
        String b="zxyzxyzz";
        Program aa=new Program();
        int c=0;
        try {
            c = aa.substring(a, b);
            assertEquals(-1,c);
        }catch (Exception e){

        }
    }

    
}
package com.proyecto.demo;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;


import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void bowlingScoreTest(){
        assertEquals(20, App.bowling_score("11 11 11 11 11 11 11 11 11 11"));
    }

    @Test
    public void bowlingScoreTest1(){
        assertEquals(28, App.bowling_score("X 54"));
    }

    @Test
    public void bowlingScoreTest2(){
        assertEquals(300, App.bowling_score("X X X X X X X X X XXX"));
    }

    @Test
    public void bowlingScoreTest3(){
        assertEquals(24, App.bowling_score("9/ 54"));
    }

    @Test
    public void bowlingScoreTest4(){
        assertEquals(150, App.bowling_score("5/ 5/ 5/ 5/ 5/ 5/ 5/ 5/ 5/ 5/5"));
    }
     
    @Test
    public void bowlingScoreTest5(){
        assertEquals(90, App.bowling_score("90 90 90 90 90 90 90 90 90 90"));
    }

    @Test
    public void bowlingScoreTest6(){
        assertEquals(127, App.bowling_score("43 5/ 36 42 4/ X 62 4/ 72 X5/"));
    }

    @Test
    public void bowlingScoreTest7(){
        assertEquals(90, App.bowling_score("90 90 90 90 90 90 90 90 90 90"));
    }
    
    @Test
    public void bowlingScoreTest8(){
        assertEquals(106, App.bowling_score("45 45 23 43 54 X X 54 34 61"));
    }

    @Test
    public void bowlingScoreTest9(){
        assertEquals(142, App.bowling_score("42 5/ 5/ 5/ 5/ 5/ 5/ 5/ 5/ 5/6"));
    }

    @Test
    public void bowlingScoreTest10(){
        assertEquals(218, App.bowling_score("33 X X X X X X X 71 45"));
    }

    @Test
    public void bowlingScoreTest11(){
        assertEquals(150, App.bowling_score("5/ 4/ 3/ 2/ 1/ 0/ X 9/ 4/ 8/8"));
    }

    @Test
    public void bowlingScoreTest12(){
        assertEquals(20, App.bowling_score("00 00 00 00 00 00 00 00 00 0/X"));
    }

    @Test
    public void bowlingScoreTest13(){
        assertEquals(40, App.bowling_score("00 00 00 00 00 00 00 00 X 0/X"));
    }

    @Test
    public void bowlingScoreTest14(){
        assertEquals(92, App.bowling_score("3/ 31 3/ 03 16 12 9/ 7/ 12 XX1"));
    }

      

    

}


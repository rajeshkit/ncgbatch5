package com.altimteriko;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class GpaCalculatorTest { //Test class testing GpaCalculator
    @BeforeAll
    public static void beforeAllSetup(){
        System.out.println("Before all test case");
    }
    @AfterAll
    public static void afterAllTearDown(){
        System.out.println("After all test case");
    }
    @BeforeEach
    public void beforeEachSetup(){
        System.out.println("Before each test case");
    }
    @AfterEach
    public void beforeEachTearDown(){
        System.out.println("After each test case");
    }
    @Test
    public void testCalcuateGpa(){//Method Under Test
        System.out.println("Test case 1");
        GpaCalculator gp=new GpaCalculator();
        assertEquals(10.0,gp.calcuateGpa(100));
    }
    @Test
    public void testCalcuateGpaWithNegativeScore(){//Method Under Test
        System.out.println("Test case 2");
        GpaCalculator gp=new GpaCalculator();
        assertThrows(InvalidScoreException.class,()->{
               gp.calcuateGpa(-394);
        });
    }
    @Test
    public void testAdd(){
        System.out.println("Test case 3");
        GpaCalculator gp=new GpaCalculator();
        assertEquals(30,gp.add(10,20));
    }
}

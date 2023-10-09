package com.alexandr.test.day6_testing_intro_dropdowns;

import org.testng.annotations.*;

public class TestNG_Intro {

    @BeforeClass
    public void setupClass(){
        System.out.println("-----> Before CLASS is running...");
    }

    @AfterClass
    public void tearDownClass(){
        System.out.println("-----> After CLASS is running...");
    }

    @BeforeMethod
    public void setup_Method(){
        System.out.println("---> Before method is running...");
    }

    @AfterMethod
    public void teardownMethod(){
        System.out.println("---> After method is running...");
    }

    @Test
    public void test1(){
        System.out.println("Running test 1...");
    }

    @Test
    public void test2(){
        System.out.println("Running test 2...");

    }
}

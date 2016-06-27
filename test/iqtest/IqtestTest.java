/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iqtest;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author avalon
 */
public class IqtestTest {
    
    public IqtestTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
 

    /**
     * Test of calculateweight method, of class Iqtest.
     */
    @Test
    public void testCalculateweight() {
        System.out.println("calculateweight");
        int[] nos = {1,2,3,4,5};
        int expResult = 140;
        int result = Iqtest.calculateweight(nos);
        assertEquals(expResult, result);
        
    }
    @Test
    public void testCalculateweight1() {
        System.out.println("calculateweight");
        int[] nos = {1,1,1,2,2};
        int expResult = 1000;
        int result = Iqtest.calculateweight(nos);
        assertEquals(expResult, result);
    }
    @Test
    public void testCalculateweight2() {
        System.out.println("calculateweight");
        int[] nos = {5,4,5,4,5};
        int expResult = 580;
        int result = Iqtest.calculateweight(nos);
        assertEquals(expResult, result);
    }
    @Test
    public void testCalculateweight3() {
        System.out.println("calculateweight");
        int[] nos = {4,4,4,4,4};
        int expResult = 480;
        int result = Iqtest.calculateweight(nos);
        assertEquals(expResult, result);
    }
    @Test
    public void testCalculateweight4() {
        System.out.println("calculateweight");
        int[] nos = {1,5,5,5,1};
        int expResult = 700;
        int result = Iqtest.calculateweight(nos);
        assertEquals(expResult, result);
    }
}

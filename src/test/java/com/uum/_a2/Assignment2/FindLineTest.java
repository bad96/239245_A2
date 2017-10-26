/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uum._a2.Assignment2;

import org.json.JSONObject;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Badrul
 */
public class FindLineTest {
    
    public FindLineTest() {
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
     * Test of Hawau method, of class FindLine.
     */
    @Test
    public void testHawau() {
        System.out.println("Hawau");
        String[] listJavaFile = {};
        FindLine instance = new FindLine();
        JSONObject expResult = instance.json;
        JSONObject result = instance.Hawau(listJavaFile);
        assertEquals(expResult, result);
    }
    
}

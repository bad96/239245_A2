/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uum._a2.Assignment2;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
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
public class FindTest {
    
    public FindTest() {
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
     * Test of addTree method, of class Find.
     */
    @Test
    public void testAddTree() {
        System.out.println("addTree");
        File file = new File("C:\\Users\\Badrul\\Documents\\NetBeansProjects\\Assignment2\\test");
        Collection<File> all = new ArrayList<>();
        Find.addTree(file, all);
    }

    /**
     * Test of filterJava method, of class Find.
     */
    @Test
    public void testFilterJava() {
        System.out.println("filterJava");
        Collection<File> listAllFileName = new ArrayList<>();
        String[] expResult = {};
        String[] result = Find.filterJava(listAllFileName);
        assertArrayEquals(expResult, result);
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package travistest;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author st52572
 */
public class TravistestTest {
    
    public TravistestTest() {
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
     * Test of vrat5 method, of class Travistest.
     */
    @Test
    public void testVrat5() {
        System.out.println("vrat5");
        int expResult = 5;
        int result = Travistest.vrat5();
        assertEquals(expResult, result);
    }
    
}

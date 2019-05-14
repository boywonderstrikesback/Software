/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package randomarraysearch;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author mikeross
 */
public class RandomarraysearchIT {
    
    public RandomarraysearchIT() {
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

    @Test
    public void testGenRandom() {
        System.out.println("genRandom");
        int expResult = 0;
        int result = Randomarraysearch.genRandom();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testContainsDuplicates() {
        System.out.println("containsDuplicates");
        int[] arr = null;
        boolean expResult = false;
        boolean result = Randomarraysearch.containsDuplicates(arr);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testShuffle() {
        System.out.println("shuffle");
        int[] arr = null;
        Randomarraysearch.shuffle(arr);
        fail("The test case is a prototype.");
    }

    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Randomarraysearch.main(args);
        fail("The test case is a prototype.");
    }
    
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cse;

import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author Farazath Ahamed
 */
public class NICinterpreterNGTest {
    NICinterpreter n;
    NICinfo test;
    public NICinterpreterNGTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
        n=new NICinterpreter("913061829V");
        test = n.interpretID();
        int birthday[] = test.getDOB();
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    /**
     * Test of interpretID method, of class NICinterpreter.
     */
   @Test
   public void testInterpretIDYear() {
        System.out.println("interpretID test year");
        int birthday[] = test.getDOB();
        int expResult = 1991;
        int result = birthday[0];
        assertEquals(result, expResult);     
    }
   
   @Test
   public void testInterpretIDMonth() {
        System.out.println("interpretID test Month");
        int birthday[] = test.getDOB();
        int expResult = 11;
        int result = birthday[1];
        assertEquals(result, expResult);     
    }
   
   @Test
   public void testInterpretIDDay() {
        System.out.println("interpretID test Day");
        int birthday[] = test.getDOB();
        int expResult = 1;
        int result = birthday[2];
        assertEquals(result, expResult);   
    }
   
   @Test
   public void testInterpretIDVoter() {
        System.out.println("interpretID test Voter");
        boolean expResult = true;
        boolean result = test.getIsVoter();
        assertEquals(result, expResult);     
    }
   
   @Test
   public void testInterpretIDSex() {
        System.out.println("interpretID test Sex");
        String expResult = "Maley";
        String result = test.getSex();
        assertEquals(result, expResult);     
    }
}
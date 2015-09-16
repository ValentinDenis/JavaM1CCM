/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.insset.ccm.m1.pkg01_mardi;

import java.util.Collection;
import java.util.Iterator;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author valentindenis
 */
public class SimpleBagTest {
    
    public SimpleBagTest() {
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
     * Test of getNbElementsDistincts method, of class SimpleBag.
     */
    @Test
    public void testGetNbElementsDistincts() {
        System.out.println("getNbElementsDistincts");
        SimpleBag instance = new SimpleBag();
        int expResult = 0;
        int result = instance.getNbElementsDistincts();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNbOccurrences method, of class SimpleBag.
     */
    @Test
    public void testGetNbOccurrences() {
        System.out.println("getNbOccurrences");
        Object inObjet = null;
        SimpleBag instance = new SimpleBag();
        int expResult = 0;
        int result = instance.getNbOccurrences(inObjet);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIteratorDistints method, of class SimpleBag.
     */
    @Test
    public void testGetIteratorDistints() {
        System.out.println("getIteratorDistints");
        SimpleBag instance = new SimpleBag();
        Iterator expResult = null;
        Iterator result = instance.getIteratorDistints();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of size method, of class SimpleBag.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        SimpleBag instance = new SimpleBag();
        int expResult = 0;
        int result = instance.size();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isEmpty method, of class SimpleBag.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        SimpleBag instance = new SimpleBag();
        boolean expResult = false;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of contains method, of class SimpleBag.
     */
    @Test
    public void testContains() {
        System.out.println("contains");
        Object o = null;
        SimpleBag instance = new SimpleBag();
        boolean expResult = false;
        boolean result = instance.contains(o);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of iterator method, of class SimpleBag.
     */
    @Test
    public void testIterator() {
        System.out.println("iterator");
        SimpleBag instance = new SimpleBag();
        Iterator expResult = null;
        Iterator result = instance.iterator();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toArray method, of class SimpleBag.
     */
    @Test
    public void testToArray_0args() {
        System.out.println("toArray");
        SimpleBag instance = new SimpleBag();
        Object[] expResult = null;
        Object[] result = instance.toArray();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toArray method, of class SimpleBag.
     */
    @Test
    public void testToArray_GenericType() {
        System.out.println("toArray");
        Object[] a = null;
        SimpleBag instance = new SimpleBag();
        Object[] expResult = null;
        Object[] result = instance.toArray(a);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of add method, of class SimpleBag.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        Object e = null;
        SimpleBag instance = new SimpleBag();
        boolean expResult = false;
        boolean result = instance.add(e);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of remove method, of class SimpleBag.
     */
    @Test
    public void testRemove() {
        System.out.println("remove");
        Object o = null;
        SimpleBag instance = new SimpleBag();
        boolean expResult = false;
        boolean result = instance.remove(o);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of containsAll method, of class SimpleBag.
     */
    @Test
    public void testContainsAll() {
        System.out.println("containsAll");
        Collection c = null;
        SimpleBag instance = new SimpleBag();
        boolean expResult = false;
        boolean result = instance.containsAll(c);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addAll method, of class SimpleBag.
     */
    @Test
    public void testAddAll() {
        System.out.println("addAll");
        Collection c = null;
        SimpleBag instance = new SimpleBag();
        boolean expResult = false;
        boolean result = instance.addAll(c);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeAll method, of class SimpleBag.
     */
    @Test
    public void testRemoveAll() {
        System.out.println("removeAll");
        Collection c = null;
        SimpleBag instance = new SimpleBag();
        boolean expResult = false;
        boolean result = instance.removeAll(c);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of retainAll method, of class SimpleBag.
     */
    @Test
    public void testRetainAll() {
        System.out.println("retainAll");
        Collection c = null;
        SimpleBag instance = new SimpleBag();
        boolean expResult = false;
        boolean result = instance.retainAll(c);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of clear method, of class SimpleBag.
     */
    @Test
    public void testClear() {
        System.out.println("clear");
        SimpleBag instance = new SimpleBag();
        instance.clear();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

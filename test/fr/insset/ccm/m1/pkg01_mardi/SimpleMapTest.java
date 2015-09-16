/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.insset.ccm.m1.pkg01_mardi;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
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
public class SimpleMapTest {
    
    public SimpleMapTest() {
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
     * Test of size method, of class SimpleMap.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        SimpleMap instance = new SimpleMap();
        int expResult = 0;
        int result = instance.size();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isEmpty method, of class SimpleMap.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        SimpleMap instance = new SimpleMap();
        boolean expResult = false;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of containsKey method, of class SimpleMap.
     */
    @Test
    public void testContainsKey() {
        System.out.println("containsKey");
        Object key = null;
        SimpleMap instance = new SimpleMap();
        boolean expResult = false;
        boolean result = instance.containsKey(key);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of containsValue method, of class SimpleMap.
     */
    @Test
    public void testContainsValue() {
        System.out.println("containsValue");
        Object value = null;
        SimpleMap instance = new SimpleMap();
        boolean expResult = false;
        boolean result = instance.containsValue(value);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get method, of class SimpleMap.
     */
    @Test
    public void testGet() {
        System.out.println("get");
        Object key = null;
        SimpleMap instance = new SimpleMap();
        Object expResult = null;
        Object result = instance.get(key);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Vérification qu'une invocation de put donne une map de taille 1
     */
    @Test
    public void testPut() {
        System.out.println("put");
        Object key = "Hello";
        Object value = "world";
        SimpleMap instance = new SimpleMap();
        Object result = instance.put(key,value);
        assertEquals(1,instance.size());
    }

    /**
     * 
     */
    @Test
    public void testPut2() {
        System.out.println("put2");
        Object key = "Hello";
        Object value = "world";
        SimpleMap instance = new SimpleMap();
        Object result = instance.put(key,value);
        assertEquals(1,instance.size());
    }
    
    @Test
    public void testPut3() {
        System.out.println("put2");
    }
    /**
     * Test of remove method, of class SimpleMap.
     */
    @Test
    public void testRemove() {
        System.out.println("remove");
        Object key = null;
        SimpleMap instance = new SimpleMap();
        Object expResult = null;
        Object result = instance.remove(key);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of putAll method, of class SimpleMap.
     */
    @Test
    public void testPutAll() {
        System.out.println("putAll");
        Map m = null;
        SimpleMap instance = new SimpleMap();
        instance.putAll(m);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of clear method, of class SimpleMap.
     */
    @Test
    public void testClear() {
        System.out.println("clear");
        SimpleMap instance = new SimpleMap();
        instance.clear();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of keySet method, of class SimpleMap.
     */
    @Test
    public void testKeySet() {
        System.out.println("keySet");
        SimpleMap instance = new SimpleMap();
        Set expResult = null;
        Set result = instance.keySet();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of values method, of class SimpleMap.
     */
    @Test
    public void testValues() {
        System.out.println("values");
        SimpleMap instance = new SimpleMap();
        Collection expResult = null;
        Collection result = instance.values();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of entrySet method, of class SimpleMap.
     */
    @Test
    public void testEntrySet() {
        
    }

    /**
     * Test of getIndice method, of class SimpleMap.
     */
    @Test
    public void testGetIndice() {
        System.out.println("getIndice");
        Object key = null;
        SimpleMap instance = new SimpleMap();
        int expResult = 0;
        int result = instance.getIndice(key);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

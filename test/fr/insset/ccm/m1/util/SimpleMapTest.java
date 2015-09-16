/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fr.insset.ccm.m1.util;

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
 * @author jldeleage
 */
public class SimpleMapTest {
    
    private Map<String,String>  maMap;

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
        maMap = new SimpleMap<>();
        maMap.put("Coucou", "1");
        maMap.put("Hello", "2");
        maMap.put("Salut", "3");
        String he = "He";
        String llo = "llo";
        maMap.put(he + llo, "4");
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
    }

    /**
     * Test of isEmpty method, of class SimpleMap.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        Map instance = new SimpleMap();
        boolean expResult = true;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);
        instance.put("hello", 10);
        expResult = false;
        result = instance.isEmpty();
        assertEquals(expResult, result);
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
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
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
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
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
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * V&eacute;rifie qu'une invocation de put donne une map de taille 1.
     */
    @Test
    public void testPut() {
        System.out.println("put");
        Object key = "Hello";
        Object value = "world";
        SimpleMap instance = new SimpleMap();
        Object result = instance.put(key, value);
        assertEquals(1, instance.size());
    }

    /**
     * V&eacute;rifie que le remplacement d'une entr&eacute;e ne change pas
     * la taille de la map et que la valeur renvoy&eacute;e est bien 
     * l'ancienne qui a &eacute;t&eacute; &eacute;cras&eacute;e.
     */
    @Test
    public void testPut2() {
        System.out.println("put");
        Object key = "Hello";
        Object value = "world";
        SimpleMap instance = new SimpleMap();

        
        Object result = instance.put(key, value);
        assertEquals(1, instance.size());

        Object expResult = value;
        result = instance.put(key, "le monde");
        assertEquals(expResult, result);
        assertEquals(1, instance.size());
    }


    /**
     * V&eacute;rifie qu'on utilise bien l'&eacute;galit&eacute; et non
     * l'identit&eacute; des clefs.
     */
    @Test
    public void testPut3() {
        System.out.println("put");
        assertEquals(3, maMap.size());
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
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of putAll method, of class SimpleMap.
     */
    @Test
    public void testPutAll() {
        System.out.println("putAll");
//        Map m = null;
        SimpleMap instance = new SimpleMap();
//        instance.putAll(m);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
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
//        fail("The test case is a prototype.");
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
//        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
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
//        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
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
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fr.insset.ccm.m1.util;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
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
public class SimpleBagTest {
    

    private SimpleBag<String>   monBag;
    public final static String  UN = "un",
                                DEUX = "deux", 
                                TROIS = "trois";

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
        monBag = new SimpleBag<>();
        monBag.add(UN);
        monBag.add(DEUX);
        monBag.add(TROIS);
        monBag.add(DEUX);
        monBag.add(TROIS);
        monBag.add(TROIS);
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
        int expResult = 3;
        int result = monBag.getNbElementsDistincts();
        assertEquals(expResult, result);
    }

    /**
     * Test of getNbOccurrences method, of class SimpleBag.
     */
    @Test
    public void testGetNbOccurrences() {
        System.out.println("getNbOccurrences");
        int expResult = 3;
        int result = monBag.getNbOccurrences(TROIS);
        assertEquals(expResult, result);
        expResult = 2;
        result = monBag.getNbOccurrences(DEUX);
        assertEquals(expResult, result);
        expResult = 1;
        result = monBag.getNbOccurrences(UN);
        assertEquals(expResult, result);
    }

    /**
     * Test of getIteratorDistincts method, of class SimpleBag.
     */
    @Test
    public void testGetIteratorDistints() {
        System.out.println("getIteratorDistints");
        SimpleBag instance = new SimpleBag();
        Iterator expResult = null;
        Iterator result = instance.getIteratorDistincts();
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
    }


    @Test
    public void testSize2() {
        System.out.println("size 2");
        int expResult = 6;
        int result = monBag.size();
        assertEquals(expResult, result);
    }

    /**
     * Test of isEmpty method, of class SimpleBag.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        SimpleBag instance = new SimpleBag();
        boolean expResult = true;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);
    }


    @Test
    public void testAdd1() {
        System.out.println("add 1");
        SimpleBag<String> instance = new SimpleBag<>();
        instance.add("Hello");
        assertEquals(1, instance.size());
        instance.add("Hello");
        assertEquals(2, instance.size());
        instance.add("Salut");
        assertEquals(3, instance.size());        
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
        Map<String, Integer> resultat = new HashMap<String, Integer>();
        Iterator<String> it = monBag.iterator();
        while (it.hasNext()) {
            String suivante = it.next();
            // Incrémenter le compteur correspondant :
            Integer nbDejaComptes = resultat.get(suivante);
            if (null == nbDejaComptes) {
                resultat.put(suivante, 1);
            }
            else {
                resultat.put(suivante, nbDejaComptes + 1);
            }
        }       // parcours
        assertEquals(new Integer(1), resultat.get(UN));
        assertEquals(new Integer(2), resultat.get(DEUX));
        assertEquals(new Integer(3), resultat.get(TROIS));
    }       // testIterator

    /**
     * Test of iterator method, of class SimpleBag.
     */
    @Test
    public void testIteratorFor() {
        System.out.println("iterator");
        Map<String, Integer> resultat = new HashMap<String, Integer>();
        for (String suivante : monBag) {
            // Incrémenter le compteur correspondant :
            Integer nbDejaComptes = resultat.get(suivante);
            if (null == nbDejaComptes) {
                resultat.put(suivante, 1);
            }
            else {
                resultat.put(suivante, nbDejaComptes + 1);
            }
        }       // parcours
        assertEquals(new Integer(1), resultat.get(UN));
        assertEquals(new Integer(2), resultat.get(DEUX));
        assertEquals(new Integer(3), resultat.get(TROIS));
    }       // testIterator

    /**
     * Test of iterator method, of class SimpleBag.
     */
    @Test
    public void testIteratorTropLoin() {
        System.out.println("iterator");
        Iterator<String> it = monBag.iterator();
        while (it.hasNext()) {
            String suivante = it.next();
        }       // parcours
        // Ce serait bien si ca plantait
        try {
            String next = it.next();
            fail("next va trop loin");
        }
        catch (Exception e) {
            
        }
    }       // testIterator


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
     * Suppression d'un objet existant
     */
    @Test
    public void testRemove() {
        System.out.println("remove 1");
        Object o = null;
        boolean expResult = true;
        boolean result = monBag.remove(UN);
        assertEquals(expResult, result);
        int  nbOcc = monBag.getNbOccurrences(UN);
        assertEquals(0, nbOcc);
        int nbDistincts = monBag.getNbElementsDistincts();
        assertEquals(2, nbDistincts);
    }

    /**
     * Test of remove method, of class SimpleBag.
     * Suppression d'un objet existant
     */
    @Test
    public void testRemove2() {
        System.out.println("remove 2");
        Object o = null;
        boolean expResult = false;
        boolean result = monBag.remove(UN);
        // On le retire encore mais il n'y en a plus
        result = monBag.remove(UN);
        assertEquals(expResult, result);
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

    /**
     * Test of clone method, of class SimpleBag.
     */
    @Test
    public void testClone() {
        System.out.println("clone");
        SimpleBag instance = new SimpleBag();
        Bag expResult = null;
        Bag result = instance.clone();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

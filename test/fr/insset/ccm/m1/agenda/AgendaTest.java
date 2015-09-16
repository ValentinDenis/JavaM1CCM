/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.insset.ccm.m1.agenda;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
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
public class AgendaTest {
    
    public AgendaTest() {
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
     * Test of getTachesImportantes method, of class Agenda.
     */
    @Test
    public void testGetTachesImportantes() {
        System.out.println("getTachesImportantes");
        int inImportance = 0;
        Agenda instance = null;
        List<Tache> expResult = null;
        List<Tache> result = instance.getTachesImportantes(inImportance);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of size method, of class Agenda.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        Agenda instance = null;
        int expResult = 0;
        int result = instance.size();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isEmpty method, of class Agenda.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        Agenda instance = null;
        boolean expResult = false;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of contains method, of class Agenda.
     */
    @Test
    public void testContains() {
        System.out.println("contains");
        Object o = null;
        Agenda instance = null;
        boolean expResult = false;
        boolean result = instance.contains(o);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of iterator method, of class Agenda.
     */
    @Test
    public void testIterator() {
        System.out.println("iterator");
        Agenda instance = null;
        Iterator<Tache> expResult = null;
        Iterator<Tache> result = instance.iterator();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toArray method, of class Agenda.
     */
    @Test
    public void testToArray_0args() {
        System.out.println("toArray");
        Agenda instance = null;
        Object[] expResult = null;
        Object[] result = instance.toArray();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toArray method, of class Agenda.
     */
    @Test
    public void testToArray_GenericType() {
        System.out.println("toArray");
        Object[] a = null;
        Agenda instance = null;
        Object[] expResult = null;
        Object[] result = instance.toArray(a);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of add method, of class Agenda.
     */
    @Test
    public void testAdd_Tache() {
        System.out.println("add");
        Tache e = null;
        Agenda instance = null;
        boolean expResult = false;
        boolean result = instance.add(e);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of remove method, of class Agenda.
     */
    @Test
    public void testRemove_Object() {
        System.out.println("remove");
        Object o = null;
        Agenda instance = null;
        boolean expResult = false;
        boolean result = instance.remove(o);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of containsAll method, of class Agenda.
     */
    @Test
    public void testContainsAll() {
        System.out.println("containsAll");
        Collection c = null;
        Agenda instance = null;
        boolean expResult = false;
        boolean result = instance.containsAll(c);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addAll method, of class Agenda.
     */
    @Test
    public void testAddAll_Collection() {
        System.out.println("addAll");
        Collection<? extends Tache> c = null;
        Agenda instance = null;
        boolean expResult = false;
        boolean result = instance.addAll(c);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addAll method, of class Agenda.
     */
    @Test
    public void testAddAll_int_Collection() {
        System.out.println("addAll");
        int index = 0;
        Collection<? extends Tache> c = null;
        Agenda instance = null;
        boolean expResult = false;
        boolean result = instance.addAll(index, c);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeAll method, of class Agenda.
     */
    @Test
    public void testRemoveAll() {
        System.out.println("removeAll");
        Collection c = null;
        Agenda instance = null;
        boolean expResult = false;
        boolean result = instance.removeAll(c);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of retainAll method, of class Agenda.
     */
    @Test
    public void testRetainAll() {
        System.out.println("retainAll");
        Collection c = null;
        Agenda instance = null;
        boolean expResult = false;
        boolean result = instance.retainAll(c);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of clear method, of class Agenda.
     */
    @Test
    public void testClear() {
        System.out.println("clear");
        Agenda instance = null;
        instance.clear();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get method, of class Agenda.
     */
    @Test
    public void testGet() {
        System.out.println("get");
        int index = 0;
        Agenda instance = null;
        Tache expResult = null;
        Tache result = instance.get(index);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of set method, of class Agenda.
     */
    @Test
    public void testSet() {
        System.out.println("set");
        int index = 0;
        Tache element = null;
        Agenda instance = null;
        Tache expResult = null;
        Tache result = instance.set(index, element);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of add method, of class Agenda.
     */
    @Test
    public void testAdd_int_Tache() {
        System.out.println("add");
        int index = 0;
        Tache element = null;
        Agenda instance = null;
        instance.add(index, element);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of remove method, of class Agenda.
     */
    @Test
    public void testRemove_int() {
        System.out.println("remove");
        int index = 0;
        Agenda instance = null;
        Tache expResult = null;
        Tache result = instance.remove(index);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of indexOf method, of class Agenda.
     */
    @Test
    public void testIndexOf() {
        System.out.println("indexOf");
        Object o = null;
        Agenda instance = null;
        int expResult = 0;
        int result = instance.indexOf(o);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of lastIndexOf method, of class Agenda.
     */
    @Test
    public void testLastIndexOf() {
        System.out.println("lastIndexOf");
        Object o = null;
        Agenda instance = null;
        int expResult = 0;
        int result = instance.lastIndexOf(o);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listIterator method, of class Agenda.
     */
    @Test
    public void testListIterator_0args() {
        System.out.println("listIterator");
        Agenda instance = null;
        ListIterator<Tache> expResult = null;
        ListIterator<Tache> result = instance.listIterator();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listIterator method, of class Agenda.
     */
    @Test
    public void testListIterator_int() {
        System.out.println("listIterator");
        int index = 0;
        Agenda instance = null;
        ListIterator<Tache> expResult = null;
        ListIterator<Tache> result = instance.listIterator(index);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of subList method, of class Agenda.
     */
    @Test
    public void testSubList() {
        System.out.println("subList");
        int fromIndex = 0;
        int toIndex = 0;
        Agenda instance = null;
        List<Tache> expResult = null;
        List<Tache> result = instance.subList(fromIndex, toIndex);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

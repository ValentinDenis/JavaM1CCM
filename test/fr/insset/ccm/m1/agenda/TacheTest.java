/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fr.insset.ccm.m1.agenda;

import java.util.Date;
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
public class TacheTest {
    
    public TacheTest() {
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
     * Test of getTitre method, of class Tache.
     */
    @Test
    public void testGetTitre() {
        System.out.println("getTitre");
        Tache instance = new Tache();
        String expResult = "Toto";
        instance.setTitre("Toto");
        System.out.println(instance);
        String result = instance.getTitre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setTitre method, of class Tache.
     */
    @Test
    public void testSetTitre() {
        System.out.println("setTitre");
        String titre = "";
        Tache instance = new Tache();
        instance.setTitre(titre);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getDescription method, of class Tache.
     */
    @Test
    public void testGetDescription() {
        System.out.println("getDescription");
        Tache instance = new Tache();
        String expResult = "";
        String result = instance.getDescription();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDescription method, of class Tache.
     */
    @Test
    public void testSetDescription() {
        System.out.println("setDescription");
        String description = "";
        Tache instance = new Tache();
        instance.setDescription(description);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getImportance method, of class Tache.
     */
    @Test
    public void testGetImportance() {
        System.out.println("getImportance");
        Tache instance = new Tache();
        Priorite expResult = Priorite.BASSE;
        instance.setImportance(Priorite.BASSE);
        Priorite result = instance.getImportance();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setImportance method, of class Tache.
     */
    @Test
    public void testSetImportance() {
        System.out.println("setImportance");
        int importance = 0;
        Tache instance = new Tache();
//        instance.setImportance(importance);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isTerminee method, of class Tache.
     */
    @Test
    public void testIsTerminee() {
        System.out.println("isTerminee");
        Tache instance = new Tache();
        boolean expResult = false;
        boolean result = instance.isTerminee();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTerminee method, of class Tache.
     */
    @Test
    public void testSetTerminee() {
        System.out.println("setTerminee");
        boolean terminee = false;
        Tache instance = new Tache();
        instance.setTerminee(terminee);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDateTache method, of class Tache.
     */
    @Test
    public void testGetDateTache() {
        System.out.println("getDateTache");
        Tache instance = new Tache();
        Date expResult = null;
        Date result = instance.getDateTache();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDateTache method, of class Tache.
     */
    @Test
    public void testSetDateTache() {
        System.out.println("setDateTache");
        Date dateTache = null;
        Tache instance = new Tache();
        instance.setDateTache(dateTache);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

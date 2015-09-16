/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fr.insset.ccm.m1.agenda;

import static fr.insset.ccm.m1.agenda.Priorite.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author jldeleage
 */
public class AgendaTest {
    
    private Agenda  monAgenda = new Agenda(new ArrayList<Tache>());
    private Tache[] taches = {
        nouvelleTache("Cours Java M1 - 1", null, "15/09/15:08:30", MOYENNE),
        nouvelleTache("Vérifier EdT", null, "14/09/15", HAUTE),
        nouvelleTache("Cours Java M1 - 4", null, "16/09/15:13:45", MOYENNE),
        nouvelleTache("Cours Java M1 - 2", null, "15/09/15:13:45", MOYENNE),
        nouvelleTache("Boire un pot", null, "15/09/15", HAUTE)
    };
    private int[]  ordreNaturel = {
        1, 4, 0, 3, 2 
    };
    private int[] ordreAlphabetique = {
        4, 0, 3, 2, 1
    };

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
        for (Tache t : taches) {
            monAgenda.add(t);
        }
    }
    
    @After
    public void tearDown() {
    }


    protected Tache nouvelleTache(String inTitre, String inDescription, String inDate, Priorite inPriorite) {
        Tache resultat = new Tache();
        resultat.setTitre(inTitre);
        resultat.setDescription(inDescription);
        if (inDate != null) {
            SimpleDateFormat format;
            switch (inDate.length()) {
                case 8 :
                    format = new SimpleDateFormat("dd/MM/yy");
                    break;
                case 10:
                    format = new SimpleDateFormat("dd/MM/yyyy");
                    break;
                case 14 :
                    format = new SimpleDateFormat("dd/MM/yy:hh:mm");
                    break;
                case 16 :
                    format = new SimpleDateFormat("dd/MM/yyyy:hh:mm");
                    break;
                default:
                    format = new SimpleDateFormat("dd/MM/yy");
                    break;
            }
            try {
                Date d;
                d = format.parse(inDate);
                resultat.setDateTache(d);
            } catch (ParseException ex) {
                Logger.getLogger(AgendaTest.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return resultat;
    }

    /**
     * Test of getTachesImportantes method, of class Agenda.
     */
    @Test
    public void testGetTachesImportantes() {
        System.out.println("getTachesImportantes");
        int inImportance = 0;
        Agenda instance = new Agenda(new LinkedList<>());
        Tache t = new Tache();
        t.setImportance(BASSE);
        t.setImportance(MOYENNE);
        instance.add(t);
        ArrayList result = instance.getTachesImportantes(1);
        assertEquals(1, result.size());
        result = instance.getTachesImportantes(3);
        assertEquals(0, result.size());
        result = instance.getTachesImportantes(2);
        assertEquals(1, result.size());
        // TODO review the generated test code and remove the default call to fail.
    }
    

    @Test
    public void testTriNaturel() {
        // Verification avant le tri
        System.out.println("   ------");
        System.out.println("Tri par ordre chronologique (ordre naturel)");
        int indice = 0;
        for (Tache t : monAgenda) {
            System.out.println(t);
            assertEquals(t, taches[indice++]);
        }
        System.out.println("   ------");
        Collections.sort(monAgenda);
        indice = 0;
        for (Tache t : monAgenda) {
            System.out.println(t);
            assertEquals(t, taches[ordreNaturel[indice++]]);
        }
    }

    @Test
    public void testTriParOrdreAlphabetique() {
        System.out.println("   ------");
        System.out.println("Tri par ordre alphabétique");
        Collections.sort(monAgenda, new ComparateurAlphabetique());
        int indice = 0;
        for (Tache t : monAgenda) {
            System.out.println(t);
            assertEquals(t, taches[ordreAlphabetique[indice++]]);
        }
    }

    private static class ComparateurAlphabetique implements Comparator<Tache> {
        @Override
        public int compare(Tache o1, Tache o2) {
            return o1.getTitre().compareTo(o2.getTitre());
        }
    }       // ComparateurAlphabetique

}       // AgendaTest

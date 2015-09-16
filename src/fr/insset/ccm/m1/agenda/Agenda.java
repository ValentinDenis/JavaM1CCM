/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fr.insset.ccm.m1.agenda;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;
import java.util.Spliterator;
import java.util.function.UnaryOperator;

/**
 *
 * @author jldeleage
 */
public class Agenda implements List<Tache> {

    public Agenda(List<Tache> taches) {
        this.taches = taches;
    }

    public int size() {
        return taches.size();
    }

    public boolean isEmpty() {
        return taches.isEmpty();
    }

    public boolean contains(Object o) {
        return taches.contains(o);
    }

    public Iterator<Tache> iterator() {
        return taches.iterator();
    }

    public Object[] toArray() {
        return taches.toArray();
    }

    public <T> T[] toArray(T[] a) {
        return taches.toArray(a);
    }

    public boolean add(Tache e) {
        return taches.add(e);
    }

    public boolean remove(Object o) {
        return taches.remove(o);
    }

    public boolean containsAll(Collection<?> c) {
        return taches.containsAll(c);
    }

    public boolean addAll(Collection<? extends Tache> c) {
        return taches.addAll(c);
    }

    public boolean addAll(int index, Collection<? extends Tache> c) {
        return taches.addAll(index, c);
    }

    public boolean removeAll(Collection<?> c) {
        return taches.removeAll(c);
    }

    public boolean retainAll(Collection<?> c) {
        return taches.retainAll(c);
    }

    public void replaceAll(UnaryOperator<Tache> operator) {
        taches.replaceAll(operator);
    }

    public void sort(Comparator<? super Tache> c) {
        taches.sort(c);
    }

    public void clear() {
        taches.clear();
    }

    public boolean equals(Object o) {
        return taches.equals(o);
    }

    public int hashCode() {
        return taches.hashCode();
    }

    public Tache get(int index) {
        return taches.get(index);
    }

    public Tache set(int index, Tache element) {
        return taches.set(index, element);
    }

    public void add(int index, Tache element) {
        taches.add(index, element);
    }

    public Tache remove(int index) {
        return taches.remove(index);
    }

    public int indexOf(Object o) {
        return taches.indexOf(o);
    }

    public int lastIndexOf(Object o) {
        return taches.lastIndexOf(o);
    }

    public ListIterator<Tache> listIterator() {
        return taches.listIterator();
    }

    public ListIterator<Tache> listIterator(int index) {
        return taches.listIterator(index);
    }

    public List<Tache> subList(int fromIndex, int toIndex) {
        return taches.subList(fromIndex, toIndex);
    }

    public Spliterator<Tache> spliterator() {
        return taches.spliterator();
    }


    //========================================================================//


    public interface Critere {
        public boolean test(Tache t);
    };

    public ArrayList getTachesTellesQue(Critere c) {
        ArrayList resultat = new ArrayList();
        for (Tache t : taches) {
            if (c.test(t)) {
                resultat.add(t);
            }
        }
        return resultat;
    }

    public ArrayList getTachesTellesQue2(Critere c) {
        ArrayList resultat = new ArrayList();
        for (Tache t : taches) {
            if (c.test(t)) {
                resultat.add(t);
            }
        }
        return resultat;
    }

    public ArrayList getTachesImportantes(int inImportance) {
        ArrayList   resultat = new ArrayList();
        taches.stream().filter((suivante) -> (suivante.getImportance().getValeur() >= inImportance))
                .forEach((suivante) -> {
            resultat.add(suivante);
        });
        return resultat;
    }


    private class CritereTachesImportantes implements Critere {
        private int importance;
        public CritereTachesImportantes(int importance) {
            this.importance = importance;
        }
        @Override
        public boolean test(Tache t) {
            return t.getImportance().getValeur() >= importance; //To change body of generated methods, choose Tools | Templates.
        }
    }

    public ArrayList getTachesImportantesClasseInterne(int inImportance) {
        return getTachesTellesQue(new CritereTachesImportantes(inImportance));
    }

    public ArrayList getTachesImportantesClasseAnonyme(int inImportance) {
        return getTachesTellesQue(new Critere() {
            @Override
            public boolean test(Tache t) {
                return t.getImportance().getValeur() >= inImportance; //To change body of generated methods, choose Tools | Templates.
            }
         });
    }

    public ArrayList getTachesImportantesLambda(int inImportance) {
        return getTachesTellesQue((Tache t) -> t.getImportance().getValeur() >= inImportance);
    }

    /**
     * L'ordre chronologique est le tri "naturel" des t&acirc;ches.
     */
    public void triParOrdreChronologique() {
        Collections.sort(taches);
    }



    public ArrayList getProchainesTaches(int nbTaches) {
        ArrayList resultat = new ArrayList();
        Date aujourdhui = new Date();
        int nb = 0;
        // Retrier par ordre chronologique, au cas où
        Collections.sort(this);
        for (Tache t : this) {
            if (nb >= nbTaches) {
                break;
            }
            Date dateTache = t.getDateTache();
            if (dateTache == null) {
                resultat.add(t);
                nb++;
                continue;
            }
            if (dateTache.after(aujourdhui)) {
                resultat.add(t);
                nb++;
            }
        }
        return resultat;
    }



    private List<Tache>    taches;


}

















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

/**
 *
 * @author jldeleage
 */
public class SimpleBag<T> implements Bag<T> {

    public SimpleBag() {
        comptage = new HashMap<T, Integer>();
    }

    public SimpleBag(Map<T, Integer> comptage) {
        this.comptage = comptage;
    }


    @Override
    public int getNbElementsDistincts() {
        return comptage.keySet().size();
    }

    @Override
    public int getNbOccurrences(T inObjet) {
        Integer nb = comptage.get(inObjet);
        if (nb == null) {
            return 0;
        }
        return nb;
    }

    public Iterator<T> getIteratorDistincts() {
        return comptage.keySet().iterator();
    }

    @Override
    public int size() {
        int resultat = 0;
        for (Integer nb : comptage.values()) {
            resultat += nb;
        }
        return resultat;
    }

    @Override
    public boolean isEmpty() {
        return comptage.isEmpty();
    }

    @Override
    public boolean contains(Object o) {
        return comptage.keySet().contains(o);
    }

    @Override
    public Iterator<T> iterator() {
        Iterator<T> resultat = new IterateurSimpleBag(this);
        return resultat;
    }

    @Override
    public Object[] toArray() {
        Object[] resultat = new Object[size()];
        int indice = 0;
        for (T elt : this) {
            resultat[indice++] = elt;
        }
        return resultat;
    }

    /**
     * 
     * @param <T>
     * @param a
     * @return 
     */
    @Override
    public <T> T[] toArray(T[] a) {
        // Si le tableau n'est pas assez grand, il faut en créer un nouveau.
        int taille = this.size();
        if (a.length < taille) {
            a = (T[])new Object[taille];
        }
        int indice = 0;
        for (Object v : this) {
            a[indice++] = (T)v;
        }
        return a;
    }

    @Override
    public boolean add(T e) {
        Integer nb = comptage.get(e);
        if (nb == null) {
            comptage.put(e, 1);
        }
        else {
            comptage.put(e, nb+1);
        }
        return true;
    }

    @Override
    public boolean remove(Object o) {
        Integer nb = comptage.get(o);
        if (nb == null) {
            return false;
        }
        if (nb == 1) {
            comptage.remove(o);
            return true;
        }
        else {
            comptage.put((T)o, nb-1);
            return true;
        }
    }

    /**
     * 
     * @param c
     * @return 
     */
    @Override
    public boolean containsAll(Collection<?> c) {
        Bag<T> copie = clone();
        for (Object x : c) {
            if (!copie.remove(x)) {
                return false;
            }
        }
        return true;
    }

    
    @Override
    public boolean addAll(Collection<? extends T> c) {
        boolean resultat = false;
        for (T t : c) {
            resultat |= add(t);
        }
        return resultat;
    }

    /**
     * 
     * @param c
     * @return 
     */
    @Override
    public boolean removeAll(Collection<?> c) {
        boolean resultat = false;
        for (Object o : c) {
            resultat |= remove(o);
        }
        return resultat;
    }

    /**
     * 
     * @param c
     * @return 
     */
    @Override
    public boolean retainAll(Collection<?> c) {
        boolean resultat = false;
        Bag<T> copie = this.clone();
        for (Object o : c) {
            if (!copie.remove(o)) {
                resultat |= remove(o);
            }
        }
        return resultat;
    }

    @Override
    public void clear() {
        comptage.clear();
    }
    
    protected Bag<T> clone() {
        SimpleBag<T> resultat = new SimpleBag<>();
        for (T clef : comptage.keySet()) {
            resultat.comptage.put(clef, comptage.get(clef));
        }
        return resultat;
    }
    

    private Map<T, Integer>   comptage;

    @Override
    public Iterator<T> getIteratorDistints() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}


class IterateurSimpleBag<T> implements Iterator<T> {

    public IterateurSimpleBag(SimpleBag<T> simpleBag) {
        this.simpleBag = simpleBag;
        iterateurClefs = simpleBag.getIteratorDistincts();
        nbDejaParcourus = 0;
        if (simpleBag.isEmpty()) {
            elementCourant = null;
        }
        else {
            elementCourant = iterateurClefs.next();
        }
    }

    @Override
    public boolean hasNext() {
        return elementCourant != null;
    }

    @Override
    public T next() {
        if (elementCourant == null) {
            // On nous demande de continuer apres la fin
            throw new ArrayIndexOutOfBoundsException("Trop loin");
        }
        nbDejaParcourus++;
        T resultat = elementCourant;
        if (nbDejaParcourus >= simpleBag.getNbOccurrences(elementCourant)) {
            // On a "fini" cet element, il faut passer au suivant
            if (iterateurClefs.hasNext()) {
                elementCourant = iterateurClefs.next();
                nbDejaParcourus = 0;
            }
            else {
                elementCourant = null;
            }
        }
        return resultat;
    }
    
    private SimpleBag<T>  simpleBag;
    private T             elementCourant;
    private int           nbDejaParcourus;
    private Iterator<T>   iterateurClefs;

}


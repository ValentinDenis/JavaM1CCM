/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fr.insset.ccm.m1.util;

import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/**
 *
 * @author jldeleage
 */
public class SimpleMap<K,V> implements Map<K,V> {

    @Override
    public int size() {
        return clefs.length;
    }

    @Override
    public boolean isEmpty() {
        return clefs.length == 0;
    }

    @Override
    public boolean containsKey(Object key) {
        int indice = getIndice(key);
        return indice >= 0;
    }

    @Override
    public boolean containsValue(Object value) {
        for (int i=0 ; i<valeurs.length ; i++) {
            if (Objects.equals(valeurs[i], value)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public V get(Object key) {
        int indice = getIndice(key);
        if (indice >= 0) {
            return (V)valeurs[indice];
        }
        return null;
    }

    @Override
    public V put(K key, V value) {
        int indice = getIndice(key);
        if (indice < 0) {
            // il n'y avait pas de valeur associee a cette clef
            Object[] aux;
            int longueur = clefs.length;
            aux = new Object[longueur + 1];
            System.arraycopy(clefs, 0, aux, 0, longueur);
            aux[longueur] = key;
            clefs = aux;
            aux = new Object[longueur + 1];
            System.arraycopy(valeurs, 0, aux, 0, longueur);
            aux[longueur] = value;
            valeurs = aux;
            return null;
        }
        else {
            // Il y avait deja une valeur associee a cette clef.
            // Ecraser cette valeur mais il faut la recuperer
            // avant pour pouvoir la renvoyer
            V ancienneValeur = (V) valeurs[indice];
            valeurs[indice] = value;
            return ancienneValeur;
        }
    }       // put

    @Override
    public V remove(Object key) {
        int indice = getIndice(key);
        if (indice < 0) {
            return null;
        }
        else {
            // Il y a bien un couple avec cette clef
            Object[] aux;
            // Il faudra renvoyer la valeur que l'on va ecraser
            // donc on commence par la sauvegarder
            V valeur = (V) valeurs[indice];
            int longueur = clefs.length;
            aux = new Object[longueur-1];
            // Copier les clefs avant l'indice de la clef
            System.arraycopy(clefs, 0, aux, 0, indice);
            // Copier les clefs après l'indice
            System.arraycopy(clefs, indice+1, aux, indice, longueur-indice-1);
            clefs = aux;
            aux = new Object[longueur-1];
            // Copier les valeurs avant l'indice de la clef
            System.arraycopy(valeurs, 0, aux, 0, indice);
            // Copier les valeurs après l'indice
            System.arraycopy(valeurs, indice+1, aux, indice, longueur-indice-1);
            valeurs = aux;
            return valeur;
        }
    }

    @Override
    public void putAll(Map<? extends K, ? extends V> m) {
        for (K k : m.keySet()) {
            put(k, m.get(k));
        }
    }

    @Override
    public void clear() {
        clefs = new Object[0];
        valeurs = new Object[0];
    }

    @Override
    public Set<K> keySet() {
        HashSet<K> resultat = new HashSet<K>();
        for (Object obj : clefs) {
            resultat.add((K)obj);
        }
        return resultat;
    }

    @Override
    public Collection<V> values() {
        List<V> resultat = new LinkedList<>();
        for (Object obj : valeurs) {
            resultat.add((V)obj);
        }
        return resultat;
    }

    @Override
    public Set<Entry<K, V>> entrySet() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * Cherche l'indice de la clef dans le tableau des clefs.
     * Si la clef est absente du tableau, renvoie -1
     * 
     * @param Object key : clef dont on cherche l'indice
     * @return int : indice de la clef ou -1 si elle est absente
     */
    protected int getIndice(Object key) {
        for (int i=0 ; i<clefs.length ; i++) {
            if (Objects.equals(clefs[i], key)) {
                return i;
            }
        }
        return -1;
    }

    private Object[]    clefs = {};
    private Object[]    valeurs = {};


}



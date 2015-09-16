/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.insset.ccm.m1.pkg01_mardi;

import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/**
 *
 * @author valentindenis
 * @param <K>
 * @param <V>
 */
public class SimpleMap<K,V> implements Map<K,V> {

    // Contraintes: 
    // 
    private Object[] clefs = {};
    private Object[] valeurs = {};
    
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
        for (Object valeur : valeurs) {
            if (Objects.equals(valeur, value)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public V get(Object key) {
        int indice = getIndice(key);
        if(indice >= 0){
            return (V)valeurs[indice];
        }
        return null;
        
    }
   
    @Override
    public V put(K key, V value) {
        int indice = getIndice(key);
        if (indice < 0) {
            // Pas de valeur associee a cette clef, inserer dans le tableau
            
            // Key
            Object[] aux;
            int longueur = clefs.length;
            aux = new Object[longueur+1];
            System.arraycopy(clefs, 0, aux, 0, longueur);
            aux[longueur] = key;
            clefs = aux;
            
            // Value
            aux = new Object[longueur+1];
            System.arraycopy(valeurs, 0, aux, 0, longueur);
            aux[longueur] = value;
            valeurs = aux;
            
            return null;
        }else{
            V ancienneValeur = (V)valeurs[indice];
            valeurs[indice] = value;
            return ancienneValeur;
        }
    }

    @Override
    public V remove(Object key) {
        int indice = getIndice(key);
        int longueur = clefs.length -1;
        if (indice >= 0) {
            // la clé existe
            Object[] aux;
            aux = new Object[longueur];
            System.arraycopy(clefs, 0, aux, 0, indice);
            System.arraycopy(clefs, indice+1, aux, indice, longueur-indice);
            clefs = aux;
            
            aux = new Object[longueur];
            System.arraycopy(valeurs, 0, aux, 0, indice);
            System.arraycopy(valeurs, indice+1, aux, indice, longueur-indice);
            valeurs = aux;
            
            return null;
          
            
        }else{
            // la clé n'existe pas
            return null;
        }
    }

    @Override
    public void putAll(Map<? extends K, ? extends V> m) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void clear() {
        valeurs = new Object[0];
        clefs = new Object[0];
    }

    @Override
    public Set<K> keySet() {
        HashSet<K> resultat = new HashSet<K>();
        for(Object obj:clefs){
            resultat.add((K)obj);
        }
        return resultat;
    }

    @Override
    public Collection<V> values() {
        List<V> resultat = new LinkedList<>();
        for(Object obj:valeurs){
            
        }
        return resultat;
    }

    @Override
    public Set<Entry<K, V>> entrySet() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    protected int getIndice(Object key){
        for (int i = 0; i<clefs.length ; i++){
            if(Objects.equals(clefs[i], key)){
                return i;
            }
        }
        return -1;
    }
    
}

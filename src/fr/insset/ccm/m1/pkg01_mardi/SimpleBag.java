/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.insset.ccm.m1.pkg01_mardi;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author valentindenis
 * @param <T>
 */
public class SimpleBag<T> implements Bag<T> {
    private Map<T, Integer> comptage;

    public SimpleBag(Map<T, Integer> comptage) {
        this.comptage = comptage;
    }
    public SimpleBag(){
        comptage = new HashMap<T,Integer>();
    }
    @Override
    public int getNbElementsDistincts() {
       return comptage.keySet().size();
    }

    @Override
    public int getNbOccurrences(T inObjet) {
        Integer nb = comptage.get(inObjet);
        return nb;
    }

    @Override
    public Iterator<T> getIteratorDistints() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int size() {
        int tot = 0;
        for(Integer T:comptage.values()){
           tot = tot + T;
        }
        return tot;
    }

    @Override
    public boolean isEmpty() {
        return comptage.keySet().isEmpty();
    }

    @Override
    public boolean contains(Object o) {
        return comptage.keySet().contains(o);
    }

    @Override
    public Iterator<T> iterator() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object[] toArray() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public <T> T[] toArray(T[] a) {
        int taille = size();
        if(a.length < taille){
            a = (T[])new Object[taille];
        }
        int indice = 0;
        for(Object v : this){
            a[indice++] = (T)v;
        }
        return a;
    }

    @Override
    public boolean add(T e) {
        if(e == null){
            return false;
        }
        if(comptage.containsKey(e)){
            // Contient
            Integer nb = comptage.get(e);
            nb++;
            comptage.put(e, nb);
            return true;
            
        }else{
            comptage.put(e, 1);
            return true;
        }
    }

    @Override
    public boolean remove(Object o) {
        if(comptage.containsKey(o)){
            Integer nb = comptage.get(o);
            nb--;
            comptage.put((T) o,nb);
            return true;
        }else{
            return false;
        }
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void clear() {
        comptage = new HashMap<T,Integer>();
    }
    
}

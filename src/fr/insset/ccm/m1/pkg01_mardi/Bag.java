/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.insset.ccm.m1.pkg01_mardi;

import java.util.Collection;
import java.util.Iterator;

/**
 *
 * @author valentindenis
 * @param <T>
 */
public interface Bag<T> extends Collection<T> {
    public int getNbElementsDistincts(); 
    public int getNbOccurrences(T inObjet); 
    public Iterator<T> getIteratorDistints();
}

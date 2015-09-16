/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.insset.ccm.m1.agenda;

/**
 *
 * @author valentindenis
 */
public class Priorite {
    private int valeur;
    private int description;
    public final static Priorite BASSE = new Priorite(1);
    public final static Priorite MOYENNE = new Priorite(2);
    public final static Priorite HAUTE = new Priorite(3);
    
    private Priorite(int inValeur){
        this.valeur = inValeur;
    }
    
    public void setDescription(int description){
        this.description = description;
    }
    public int getValeur(){
        return valeur;
    }   
    public int getDescription(){
        return description;
    }
    

}

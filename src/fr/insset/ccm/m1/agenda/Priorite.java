/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fr.insset.ccm.m1.agenda;

/**
 *
 * @author jldeleage
 */
public enum Priorite {
    BASSE(1),
    MOYENNE(2),
    HAUTE(3);

    private Priorite(int inValeur) {
            valeur = inValeur;
    }

    public int getValeur() {
            return valeur;
    }

    public int getDescription() {
        return description;
    }

    public void setDescription(int description) {
        this.description = description;
    }

    private int	valeur;
    private int description;
}
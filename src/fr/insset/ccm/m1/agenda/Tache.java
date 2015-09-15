/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.insset.ccm.m1.agenda;

import java.util.Date;

/* Cours */
// variable d'instance toujours private
//

/**
 *
 * @author valentindenis
 */
public class Tache {
    private String titre;
    private String description;
    private int importance;
    private boolean terminée;
    private Date dateTache;

    
    // Getters
    public String getTitre() {
        return titre;
    }

    public String getDescription() {
        return description;
    }

    public int getImportance() {
        return importance;
    }

    public boolean isTerminée() {
        return terminée;
    }

    public Date getDateTache() {
        return dateTache;
    }

    // Setters
    public void setTitre(String titre) {
        this.titre = titre;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setImportance(int importance) {
        this.importance = importance;
    }

    public void setTerminée(boolean terminée) {
        this.terminée = terminée;
    }

    public void setDateTache(Date dateTache) {
        this.dateTache = dateTache;
    }
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.insset.ccm.m1.agenda;

import java.util.Date;
import java.util.Objects;

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


    
    @Override
    public String toString(){
        return getTitre();
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getImportance() {
        return importance;
    }

    public void setImportance(int importance) {
        this.importance = importance;
    }

    public boolean isTerminée() {
        return terminée;
    }

    public void setTerminée(boolean terminée) {
        this.terminée = terminée;
    }

    public Date getDateTache() {
        return dateTache;
    }

    public void setDateTache(Date dateTache) {
        this.dateTache = dateTache;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + Objects.hashCode(this.titre);
        hash = 37 * hash + Objects.hashCode(this.dateTache);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Tache other = (Tache) obj;
        if (!Objects.equals(this.titre, other.titre)) {
            return false;
        }
        if (!Objects.equals(this.dateTache, other.dateTache)) {
            return false;
        }
        return true;
    }

    
    
}

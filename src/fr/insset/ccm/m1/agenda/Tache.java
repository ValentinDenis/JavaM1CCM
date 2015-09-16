/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.insset.ccm.m1.agenda;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

/**
 *
 * @author jldeleage
 */
public class Tache implements Comparable<Tache> {

    private static final SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy hh:mm");

    @Override
    public String toString() {
        StringBuffer buffer = new StringBuffer(getTitre());
        Date d = getDateTache();
        if (d != null) {
            buffer.append(' ');
            buffer.append(format.format(d));
        }
        return buffer.toString();
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

    public Priorite getImportance() {
        return importance;
    }

    public void setImportance(Priorite importance) {
        this.importance = importance;
    }

    public boolean isTerminee() {
        return terminee;
    }

    public void setTerminee(boolean terminee) {
        this.terminee = terminee;
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
        hash = 23 * hash + Objects.hashCode(this.titre);
        hash = 23 * hash + Objects.hashCode(this.dateTache);
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

    @Override
    public int compareTo(Tache o) {
        if (o == null) {
            return -1;
        }
        Date dateAutreTache = o.getDateTache();
        if (dateAutreTache == null && dateTache == null) {
            return 0;
        }
        if (dateAutreTache == null) {
            return -1;
        }
        if (dateTache == null) {
            return 1;
        }
        return dateTache.compareTo(dateAutreTache);
    }


    private String   titre;
    private String   description;
    private Priorite importance;
    private boolean  terminee;
    private Date     dateTache;


}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

/**
 *
 * @author admin
 */
public class History implements Serializable{
    private Sofa sofa;
    private Buyer buyer;
    private Date takeOutSofa;

    public History() {
    }

    public Sofa getSofa() {
        return sofa;
    }

    public void setSofa(Sofa sofa) {
        this.sofa = sofa;
    }

    public Buyer getBuyer() {
        return buyer;
    }

    public void setBuyer(Buyer buyer) {
        this.buyer = buyer;
    }

    public Date getTakeOutSofa() {
        return takeOutSofa;
    }

    public void setTakeOutSofa(Date takeOutSofa) {
        this.takeOutSofa = takeOutSofa;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + Objects.hashCode(this.sofa);
        hash = 83 * hash + Objects.hashCode(this.buyer);
        hash = 83 * hash + Objects.hashCode(this.takeOutSofa);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final History other = (History) obj;
        if (!Objects.equals(this.sofa, other.sofa)) {
            return false;
        }
        if (!Objects.equals(this.buyer, other.buyer)) {
            return false;
        }
        if (!Objects.equals(this.takeOutSofa, other.takeOutSofa)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.YYYY");
        return "History{" 
                + "sofa=" + sofa.getTitle()
                + ", buyer=" + buyer.getFirstname()
                + " " + buyer.getLastname()
                + ", takeOutBook=" + sdf.format(takeOutSofa) 
                + '}';
    }

    public Object getReturnSofa() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

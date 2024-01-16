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
public class Sale implements Serializable{
    private Sofa sofa;
    private Buyer buyer;
    private Date saleDate;
    private int unitsSold;
    private int quantity;

    public Sale() {
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

    public Date getSaleDate() {
        return saleDate;
    }

    public void setSaleDate(Date saleDate) {
        this.saleDate = saleDate;
    }
    public int getUnitsSold() {
        return unitsSold;
    }

    public void setUnitsSold(int unitsSold) {
        this.unitsSold = unitsSold;
    }
    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 43 * hash + Objects.hashCode(this.sofa);
        hash = 43 * hash + Objects.hashCode(this.buyer);
        hash = 43 * hash + Objects.hashCode(this.saleDate);
        hash = 43 * hash + this.unitsSold;
        hash = 43 * hash + this.quantity;
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
        final Sale other = (Sale) obj;
        if (this.unitsSold != other.unitsSold) {
            return false;
        }
        if (this.quantity != other.quantity) {
            return false;
        }
        if (!Objects.equals(this.sofa, other.sofa)) {
            return false;
        }
        if (!Objects.equals(this.buyer, other.buyer)) {
            return false;
        }
        if (!Objects.equals(this.saleDate, other.saleDate)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Sale{" + "sofa=" + sofa + ", buyer=" + buyer + ", saleDate=" + saleDate + ", unitsSold=" + unitsSold + ", quantity=" + quantity + '}';
    }

}    

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Objects;

/**
 *
 * @author admin
 */
public class Sofa implements Serializable{
    private String title;
    private int manufactureYear;
    private Seller[] sellers = new Seller[0];

    public Sofa() {
    }
    
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getManufactureYear() {
        return manufactureYear;
    }

    public void setManufactureYear(int manufactureYear) {
        this.manufactureYear = manufactureYear;
    }
    public Seller[] getSellers() {
        return sellers;
    }

    public void addSeller(Seller seller){
        this.sellers = Arrays.copyOf(sellers, sellers.length+1);
        this.sellers[this.sellers.length-1]=seller;
    }
    public void setSellers(Seller[] sellers) {
        this.sellers = sellers;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + Objects.hashCode(this.title);
        hash = 37 * hash + this.manufactureYear;
        hash = 37 * hash + Arrays.deepHashCode(this.sellers);
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
        final Sofa other = (Sofa) obj;
        if (this.manufactureYear != other.manufactureYear) {
            return false;
        }
        if (!Objects.equals(this.title, other.title)) {
            return false;
        }
        if (!Arrays.deepEquals(this.sellers, other.sellers)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Sofa{" 
                + "title=" + title 
                + ", publishedYear=" + manufactureYear 
                + ", sellers=" + Arrays.toString(sellers) 
                + '}';
    }
    
}
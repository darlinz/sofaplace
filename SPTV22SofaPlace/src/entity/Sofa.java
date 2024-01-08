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
    private int price; 
    

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
    
    public void setPrice(int price) {
        this.price = price;
    }
    
     public int getPrice() {
        return price;
    }
     
    public void setManufactureYear(int manufactureYear) {
        this.manufactureYear = manufactureYear;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 41 * hash + Objects.hashCode(this.title);
        hash = 41 * hash + this.manufactureYear;
        hash = 41 * hash + this.price;
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
        if (this.price != other.price) {
            return false;
        }
        if (!Objects.equals(this.title, other.title)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Sofa{" + "title=" + title + ", manufactureYear=" + manufactureYear + ", price=" + price + '}';
    }

}
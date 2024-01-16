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
    private int stock;
    private int quantity;
     
    

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
    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    public int getStock() {
        return stock;
    }
    public void setStock(int i) {
        this.stock = stock;
    }
    
    private double salesRating;

    public double getSalesRating() {
        return salesRating;
    }

    public void setSalesRating(double salesRating) {
        this.salesRating = salesRating;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.title);
        hash = 29 * hash + this.manufactureYear;
        hash = 29 * hash + this.price;
        hash = 29 * hash + this.stock;
        hash = 29 * hash + this.quantity;
        hash = 29 * hash + (int) (Double.doubleToLongBits(this.salesRating) ^ (Double.doubleToLongBits(this.salesRating) >>> 32));
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
        if (this.stock != other.stock) {
            return false;
        }
        if (this.quantity != other.quantity) {
            return false;
        }
        if (Double.doubleToLongBits(this.salesRating) != Double.doubleToLongBits(other.salesRating)) {
            return false;
        }
        if (!Objects.equals(this.title, other.title)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Sofa{" + "title=" + title + ", manufactureYear=" + manufactureYear + ", price=" + price + ", stock=" + stock + ", quantity=" + quantity + ", salesRating=" + salesRating + '}';
    }

}
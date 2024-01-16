/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.util.Objects;

public class Buyer implements Serializable {
    private String firstname;
    private String lastname;
    private String phoneNum;
    private double balance;

    public Buyer() {
    }

    public Buyer(String firstName, String lastName, String phoneNumber) {
        this.firstname = firstName;
        this.lastname = lastName;
        this.phoneNum = phoneNumber;
        this.balance = balance;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getPhone() {
        return phoneNum;
    }

    public void setPhone(String phoneNumber) {
        this.phoneNum = phoneNumber;
    }
    
     public double getBalance() {
        return balance;
    }

    public void addBalance(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Added " + amount + " to the balance. New balance: " + balance);
        } else {
            System.out.println("Invalid amount. The amount should be greater than 0.");
        }
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + Objects.hashCode(this.firstname);
        hash = 89 * hash + Objects.hashCode(this.lastname);
        hash = 89 * hash + Objects.hashCode(this.phoneNum);
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
        final Buyer other = (Buyer) obj;
        if (!Objects.equals(this.firstname, other.firstname)) {
            return false;
        }
        if (!Objects.equals(this.lastname, other.lastname)) {
            return false;
        }
        if (!Objects.equals(this.phoneNum, other.phoneNum)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Buyer{" 
                + "firstname=" + firstname 
                + ", lastname=" + lastname 
                + ", phone=" + phoneNum 
                + '}';
    }
    
    
}

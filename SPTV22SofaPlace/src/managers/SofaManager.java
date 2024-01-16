/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managers;

import entity.Sale;
import entity.Sofa;
import java.util.List;
import java.util.Scanner;
import tools.InputProtection;


/**
 *
 * @author admin
 */
public class SofaManager {

    private final Scanner scanner;

    public SofaManager(Scanner scanner) {
        this.scanner = scanner;
    }

        public Sofa addSofa(){
        System.out.println("----- Add Sofa -----");
        Sofa sofa = new Sofa();
        System.out.print("Enter Sofa Name: ");
        sofa.setTitle(scanner.nextLine());
        System.out.print("Year of manufacture: ");
        sofa.setManufactureYear(InputProtection.intInput(1000,2030));
        System.out.print("Sofa Price:");
        sofa.setPrice(InputProtection.intInput(0, 4000));
        System.out.println("Added sofa: "+sofa.toString());
        return sofa;
    }
    
  

    public void printListSofa(List<Sofa>sofas) {
        System.out.println("----- List sofas -----");
        for (int i = 0; i < sofas.size(); i++) {
            System.out.printf("%d. %s%n",
                    i+1,
                    sofas.get(i).getTitle()
            );
        }
    }
    
    public void setSalesRating(Sofa sofa, double rating) {
        sofa.setSalesRating(rating);
        System.out.println("Sales rating set successfully for " + sofa.getTitle() + ": " + rating);
    }
    
public void editSofa(List<Sofa> sofas) {
    System.out.println("----- Edit sofa -----");
    printListSofa(sofas);

    System.out.print("Enter the number of the sofa to edit: ");
    int choice = InputProtection.intInput(1, sofas.size()) - 1;
    Sofa sofaToEdit = sofas.get(choice);

    System.out.print("Enter new name: ");
    String newName = scanner.nextLine();
    if (!newName.isEmpty()) {
        sofaToEdit.setTitle(newName);
    }

    /*System.out.print("Enter new price: ");
    double newPrice = InputProtection.doubleInput(-1, Double.MAX_VALUE);
    if (newPrice >= 0) {
        sofaToEdit.setPrice(newPrice);
    }*/

    System.out.print("Enter new quantity: ");
    int newQuantity = InputProtection.intInput(-1, Integer.MAX_VALUE);
    if (newQuantity >= 0) {
        sofaToEdit.setQuantity(newQuantity);
    }

    /*System.out.print("Enter new manufacturer: ");
    String newManufacturer = scanner.nextLine();
    if (!newManufacturer.isEmpty()) {
        medicineToEdit.setManufacturer(new Manufacturer(newManufacturer));
    }*/

    System.out.println("Sofa edited successfully: " + sofaToEdit.toString());
    printListSofa(sofas);
    }
}

   



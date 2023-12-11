/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managers;

import entity.Seller;
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

    public SofaManager(Scanner scanner) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public Sofa addSofa(){
        System.out.println("----- Add Sofa -----");
        Sofa sofa = new Sofa();
        System.out.print("Enter Sofa Name: ");
        sofa.setTitle(scanner.nextLine());
        System.out.print("Year of manufacture: ");
        sofa.setManufactureYear(InputProtection.intInput(1000,2030));
        System.out.println("How many sellers are there at the sofa: ");
        int countSellers = InputProtection.intInput(1,5);//scanner.nextInt(); scanner.nextLine();
        for (int i = 0; i < countSellers; i++) {
            System.out.printf("Enter seller (%d) firstname: ", i+1);
            String sellerFirstname = scanner.nextLine();
            System.out.printf("Enter seller (%d) lastname: ",i+1);
            String sellerLastname = scanner.nextLine();
            sofa.addSeller(new Seller(sellerFirstname, sellerLastname));
        }
        System.out.println("Added book: "+sofa.toString());
        return sofa;
    }

    public void printListSofas(List<sofa> sofas) {
        System.out.println("----- List sofas -----");
        for (int i = 0; i < sofas.size(); i++) {
            System.out.printf("%d. %s%n",
                    i+1,
                    sofas.get(i).getTitle()
            );
        }
    }

    void printListSofas(List<Sofa> sofas) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

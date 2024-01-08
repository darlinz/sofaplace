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

   
}

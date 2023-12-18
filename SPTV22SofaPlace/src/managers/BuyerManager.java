/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managers;

import entity.Buyer;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class BuyerManager {
    private final Scanner scanner;

    public BuyerManager(Scanner scanner) {
        this.scanner = scanner;
    }
    
    public Buyer addBuyer() {
        Buyer buyer = new Buyer();
        System.out.println("----- Add buyer -----");
        System.out.print("Firstname: ");
        buyer.setFirstname(scanner.nextLine());
        System.out.print("Lastname: ");
        buyer.setLastname(scanner.nextLine());
        System.out.print("Phone: ");
        buyer.setPhone(scanner.nextLine());
        System.out.println("New Buyer added!");
        return buyer;
    }

    public void printListBuyers(List<Buyer> buyers) {
        System.out.println("----- List Buyers -----");
        for (int i = 0; i < buyers.size(); i++) {
            System.out.printf("%d. %s %s. (%s)%n",
                    i+1,
                    buyers.get(i).getFirstname(),
                    buyers.get(i).getLastname(),
                    buyers.get(i).getPhone()
            );
        }
    }

    

    
    
}

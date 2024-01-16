/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managers;

import entity.Buyer;
import entity.Sofa;
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
        System.out.println("----- Add buyer -----");
        System.out.print("Firstname: ");
        String firstName = scanner.nextLine();

        System.out.print("Lastname: ");
        String lastName = scanner.nextLine();

        System.out.print("Phone: ");
        String phoneNum = scanner.nextLine();

        Buyer buyer = new Buyer(firstName, lastName, phoneNum);
        System.out.println("New buyer added.");
        return buyer;
    }

    public void printListBuyers(List<Buyer> buyers) {
        System.out.println("----- List of buyers -----");
        for (int i = 0; i < buyers.size(); i++) {
            Buyer customer = buyers.get(i);
            System.out.printf("%d. %s %s. (%s)%n",
                    i + 1,
                    customer.getFirstname(),
                    customer.getLastname(),
                    customer.getPhone()
            );
        }
    }


    public void editBuyer(List<Buyer> buyers) {
        System.out.println("----- Edit buyer -----");
        printListBuyers(buyers);

        System.out.print("Enter the number of the buyer to edit: ");
        int customerIndex = Integer.parseInt(scanner.nextLine()) - 1;

        if (customerIndex < 0 || customerIndex >= buyers.size()) {
            System.out.println("Invalid buyer selection.");
            return;
        }

        Buyer buyer = buyers.get(customerIndex);

        System.out.print("New Firstname: ");
        String newFirstname = scanner.nextLine().trim();
        if (!newFirstname.isEmpty()) {
            buyer.setFirstname(newFirstname);
        }

        System.out.print("New Lastname: ");
        String newLastname = scanner.nextLine().trim();
        if (!newLastname.isEmpty()) {
            buyer.setLastname(newLastname);
        }

        System.out.print("New Phone: ");
        String newPhone = scanner.nextLine().trim();
        if (!newPhone.isEmpty()) {
            buyer.setPhone(newPhone);
        }

        System.out.println("Buyer updated!");
    }
}
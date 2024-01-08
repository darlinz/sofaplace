/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sptv22sofaplace;

import managers.SaveManager;
import managers.HistoryManager;
import managers.BuyerManager;
import entity.Sofa;
import entity.History;
import entity.Buyer;
import java.util.List;
import java.util.Scanner;
import managers.SofaManager;
import tools.InputProtection;
/**
 *
 * @author admin
 */
public class App {
    private final Scanner scanner; 
    private List<Sofa> sofas;
    private List<Buyer> buyers;
    private List<History> histories;
    private final SofaManager sofaManager;
    private final BuyerManager buyerManager;
    private final HistoryManager historyManager;
    private final SaveManager saveManager;

    public App() {
        this.scanner = new Scanner(System.in);
        this.saveManager = new SaveManager();
        this.sofas = saveManager.loadSofas();
        this.buyers = saveManager.loadBuyers();
        this.histories = saveManager.loadHistories();
        this.sofaManager = new SofaManager(scanner);
        this.buyerManager = new BuyerManager(scanner);
        this.historyManager = new HistoryManager(scanner,buyerManager,sofaManager);
    }
    
    
    
    public void run() {
        boolean repeat = true;
        System.out.println("------- Sofa Place -------");
        do{
            System.out.println("List taks:");
            System.out.println("0. Exit");
            System.out.println("1. Add new sofa");
            System.out.println("2. Print list sofas");
            System.out.println("3. Add new buyer");
            System.out.println("4. Print list buyers");
            System.out.println("5. Buy Sofa");
            ///System.out.println("6. Print list of sold sofas");
///            System.out.println("7. Return sofa");///
            System.out.println("6. Sofa rating");
            System.out.print("Enter task number: ");
            int task = InputProtection.intInput(0,6); 
            System.out.printf("You select task %d, for exit press \"0\", to continue press \"1\": ",task);
            int toContinue = InputProtection.intInput(0,1);
            if(toContinue == 0) continue;
            
            switch (task) {
                case 0:
                    repeat = false;
                    break;
                case 1:
                    this.sofas.add(sofaManager.addSofa());
                    saveManager.saveSofas(this.sofas);
                    break;
                case 2:
                    sofaManager.printListSofa(sofas);
                    break;
                case 3:
                    this.buyers.add(buyerManager.addBuyer());
                    saveManager.saveBuyers(buyers);
                    break;
                case 4:
                    buyerManager.printListBuyers(buyers);
                    break;
                case 5:
                    this.histories.add(historyManager.takeOutSofa(sofas, buyers));
                    saveManager.saveHistories(histories);
                    break;
                ///case 6:
                ///  historyManager.printListTakenSofas(histories);
                ///    break;
               
//               case 7:
//                  historyManager.returnBook(histories);
//                  saveManager.saveHistories(histories);
//                  break;
              
                case 6:
                    historyManager.sofaRating(this.histories);
                    break;
                default:
                    System.out.println("Select from list tasks!");
            }
            System.out.println("-----------------------");
        }while(repeat);
        System.out.println("Bye!");
    }
    
}
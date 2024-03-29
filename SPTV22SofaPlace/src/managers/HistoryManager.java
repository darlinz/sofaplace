/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managers;

import entity.Sofa;
import entity.Sale;
import entity.Buyer;
import java.util.Comparator;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;
import tools.InputProtection;

/**
 *
 * @author admin
 */
public class HistoryManager {

    private final Scanner scanner;
    private final SofaManager sofaManager;
    private final BuyerManager buyerManager;

    public HistoryManager(
            Scanner scanner, 
            BuyerManager buyerManager, 
            SofaManager sofaManager) {
        this.scanner = scanner;
        this.sofaManager = sofaManager;
        this.buyerManager = buyerManager;
    }

   
    public Sale takeOutSofa(List<Sofa> sofas, List<Buyer> buyers) {
        Sale history = new Sale();
        sofaManager.printListSofa(sofas);
        System.out.print("Enter number sofa from list: ");
        int numberSofa = InputProtection.intInput(1, sofas.size()); //scanner.nextInt(); scanner.nextLine();
        history.setSofa(sofas.get(numberSofa - 1));
        buyerManager.printListBuyers(buyers);
        System.out.print("Enter number Buyers from list: ");
        int numberBuyer = InputProtection.intInput(1, buyers.size());//scanner.nextInt(); scanner.nextLine();
        history.setBuyer(buyers.get(numberBuyer-1));
        history.setSaleDate(new GregorianCalendar().getTime());
        
        return history;
    }

    public void sofaRating(List<Sale> histories) {
        Map<Sofa,Integer> mapRatingSofa = new HashMap<>();
        for (int i = 0; i < histories.size(); i++) {
            if(mapRatingSofa.containsKey(histories.get(i).getSofa())){
                mapRatingSofa.put(histories.get(i).getSofa(), mapRatingSofa.get(histories.get(i).getSofa())+1);
            }else{
                mapRatingSofa.put(histories.get(i).getSofa(),1);
            }
        }
        Map<Sofa, Integer> sortedMapRatingBook = mapRatingSofa.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1, e2) -> e1,
                        LinkedHashMap::new
                ));
        int n = 1;
        for (Map.Entry<Sofa, Integer> entry : sortedMapRatingBook.entrySet()) {
            System.out.printf("%d. %s: %d%n",
                    n,
                    entry.getKey().getTitle(),
                    entry.getValue()
            );
        }
    }
    
}

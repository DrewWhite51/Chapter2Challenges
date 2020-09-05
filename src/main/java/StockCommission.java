/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Drew
 */

import java.util.Scanner;

public class StockCommission {
    
    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Enter the amount of shares bought: ");
        double sharesBought = keyboard.nextInt();
        
        System.out.println("Enter the price per share: ");
        double pricePerShare = keyboard.nextInt();
       
        double totalPriceBeforeBroker = sharesBought * pricePerShare;
        double brokerCut = .02 * totalPriceBeforeBroker;
        double totalTransaction = totalPriceBeforeBroker + brokerCut;
        
        System.out.println("You bought " + sharesBought + " shares of stock.\n" +
                "You bought it at $" + pricePerShare + " per share.\n" +
                "Your broker will get 2 percent of the sale which is $" + brokerCut + ".\n" +
                "The total amount of the transaction is $" + totalTransaction + ".");
        
    }
    
}

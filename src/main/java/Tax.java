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
public class Tax {
    
        public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        // Input from user for the amount of the purchase
        System.out.println("Enter the amount of your purchase: ");
        double amountOfPurchase = keyboard.nextDouble();
        
        // Calculatin all of the tax amount and totals
        double stateTax = amountOfPurchase * .04;
        double countyTax = amountOfPurchase * .02;
        double taxAmount = countyTax + stateTax;
        double totalTransactionAmount = amountOfPurchase + taxAmount;
       
        
        // Telling us how much all the transactions are
        System.out.println("The initial amount of your purchase was: " + amountOfPurchase
            + "\n . The state tax on the purchase was: " + stateTax +
                "\n . The county tax on the purchase was: " + countyTax +
                "\n . The total amount of tax on your purchase was: " + taxAmount +
                "\n . The total amount of your purhcase including tax is: " +
                totalTransactionAmount);
        
    }
    
}

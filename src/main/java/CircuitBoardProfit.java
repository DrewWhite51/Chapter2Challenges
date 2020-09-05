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
public class CircuitBoardProfit {
    
    public static void main(String[] args) {
                
        Scanner keyboard = new Scanner(System.in);
        double companyProfitPercent = .4;
        

        System.out.println("Enter the retail price fot the circuit board: ");
        double retailPrice = keyboard.nextInt();
        
        double profitCalc = retailPrice * companyProfitPercent;
        System.out.println("The retail price for the circuit board is: $" + retailPrice +
                ".\n the profit earned from the circuit board is: $" + profitCalc);
        
        
    }
    
}

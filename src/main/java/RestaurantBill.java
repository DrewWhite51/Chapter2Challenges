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
public class RestaurantBill {
    
    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
        
        
        System.out.println("Enter amount of your meal: ");
        double mealCharge = keyboard.nextInt();
        
        double percentTax = .0675;
        double percentTip = .2;
        
        double amountTax = mealCharge * percentTax;
        double amountTip = mealCharge * percentTip;
        double totalAmount = mealCharge + amountTax + amountTip;
        
        
        System.out.println("The amout of your meal was $" + mealCharge +
                ".\n The amount of tax is $" + amountTax + 
                ".\n The amount of tip is $" + amountTip +
                ".\n The total amount it $" + totalAmount + ".");
        
    }
    
}

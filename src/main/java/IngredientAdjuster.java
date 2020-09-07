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
public class IngredientAdjuster {
    
    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);

               
        System.out.println("How many cookies do you want to make?");
        double cookieAmounts = keyboard.nextInt();
        double sugarNeeded = (1.5/48) * cookieAmounts;
        double butterNeeded = cookieAmounts / 48;
        double flourNeeded = (2.75/48) *cookieAmounts;
        
        System.out.println("Ok, you will need:\n"
                 + sugarNeeded + " cups of sugar\n"
                 + butterNeeded + " cups of butter\n"
                + flourNeeded + " cups of flour");
        
        

        
        
    }
    
}

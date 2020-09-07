/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Drew
 */
// Imports all packages used
import java.util.Scanner;
import java.text.NumberFormat;





public class CompoundInterestCalculator {
    
    public static void main(String[] args) {
        
        
        // Compound interest equation
        // A = P (1 + (r/n)) ^ n*t
                    
        Scanner keyboard = new Scanner(System.in);
        NumberFormat money = NumberFormat.getCurrencyInstance();
        
        
        //Gathering Infor from user
        System.out.println("Enter the amount of money that was initially depositied.");
        double P = keyboard.nextDouble();
        
        System.out.println("Eneter the annual interest rate in percent.");
        double r = keyboard.nextDouble() / 100;

        System.out.println("Enter the number of times per year the interest is compounded.");
        double n = keyboard.nextDouble();

        System.out.println("Enter the number of years your money will be earning interest.");
        double t = keyboard.nextDouble();
        
        
        double insidePara = (1 + (r/n));
        double nTimesT = n*t;
        double rightOfP = Math.pow(insidePara,nTimesT );
        
        double A = P * rightOfP;
        
                  
        System.out.println(money.format(A));

        


    }
    
}

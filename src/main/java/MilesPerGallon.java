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
public class MilesPerGallon {
    
    
    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);

        
        
        System.out.println("Enter the amount of miles driven: ");
        double milesDriven = keyboard.nextInt();
        
        System.out.println("Enter the amout of gas used in gallons: ");
        double gallonsOfGas = keyboard.nextInt();
        
        double milesPerGallon = milesDriven / gallonsOfGas;
        
        System.out.println("Your car gets around " + milesPerGallon + " miles per gallon of gas.");
        
    }
    
}

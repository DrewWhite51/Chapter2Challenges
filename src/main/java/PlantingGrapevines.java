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

public class PlantingGrapevines {
    
    public static void main(String[] args) {
        
                Scanner keyboard = new Scanner(System.in);
                
                System.out.println("How long is the row in feet? ");
                double R = keyboard.nextDouble();
                System.out.println("How big is the space used by and end post assembly in feet?");
                double E = keyboard.nextDouble();
                System.out.println("What is the amount of space between the vines in feet?");
                double S = keyboard.nextDouble();
                
                double vinesPerRow = (R - (2*E)) / S;
                
                System.out.println("The amout of vines that will fit in a row is " + vinesPerRow + " vines.");
                

                
        
    }
    
}

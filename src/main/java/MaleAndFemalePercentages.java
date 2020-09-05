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

public class MaleAndFemalePercentages {
    
    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Enter the amount of males in the class: ");
        double totalMales = keyboard.nextInt();
        
        System.out.println("Enter the amount of females in the class: ");
        double totalFemales = keyboard.nextInt();
        
        double totalStudents = totalMales + totalFemales;
        double malePercent = (totalMales / totalStudents) * 100;
        double femalePercent = (totalFemales / totalStudents) * 100;
        
        System.out.println("The total amount of male students is: " + totalMales +
                "\n" + "The total amount of female students is: " + totalFemales +
                "\n." + "The class is " + malePercent + "% male, and " + femalePercent + "% female." );
        
        
        
    }
    
}

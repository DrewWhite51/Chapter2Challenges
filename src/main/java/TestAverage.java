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
public class TestAverage {
    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Enter the amount of your first test score: ");
        double firstScore = keyboard.nextInt();
        
        System.out.println("Enter the amount of your second test score: ");
        double secondScore = keyboard.nextInt();
        
        System.out.println("Enter the amount of your third test score: ");
        double thirdScore = keyboard.nextInt();
        
        double calcAverage = (firstScore + secondScore + thirdScore) / 3;
        
        System.out.println("The first test score was " + firstScore +
                "%.\n The second test score was " + secondScore +
                "%.\n The third test score was " + thirdScore +
                "%.\n The average of the scores was " + calcAverage + "%.");
    }
}

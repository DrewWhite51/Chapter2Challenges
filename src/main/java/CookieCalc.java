
import java.util.Scanner;

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
public class CookieCalc {
    
    

        public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
        
        
        // Getting input from user and making variables and equations
        System.out.println("Please enter the amount of cookies you have eaten: ");
        double cookieAmount = keyboard.nextInt();
        double cookieBagSize = 40;
        double cookieServingSize = .25;
        double servingSizeCalories = 300;
        double caloriesConsumedEquation = (cookieAmount / 4) * 300;
        double servingSizeConsumed = cookieServingSize * cookieAmount;
        
        
        // Telling us how many calories we have eaten.
        System.out.println("You have eaten: " + caloriesConsumedEquation + " calories worth of cookies "
                + "which is " + servingSizeConsumed + " servings.");

        


    }
    
}

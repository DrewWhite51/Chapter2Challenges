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
public class StringManipulator {
    
    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Enter the name of your city: ");
        String cityName = keyboard.nextLine();
        
        System.out.println(cityName.length());
        System.out.println(cityName.toUpperCase());
        System.out.println(cityName.toLowerCase());
        System.out.println(cityName.charAt(0));
        
    }
    
}

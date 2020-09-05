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
public class LandCalculation {
    
    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
        double landAcresInFeet = 43560;
        
        
        System.out.println("Enter the amount of land in square feet that you want converted to acres: ");
        double landConversionAmount = keyboard.nextInt();
        
        double squareFeetToAcreConversion = landConversionAmount / landAcresInFeet;
        System.out.println(landConversionAmount + "square feet of land is equal to approximately \n" +
                squareFeetToAcreConversion + " acres.");
    }
    
}

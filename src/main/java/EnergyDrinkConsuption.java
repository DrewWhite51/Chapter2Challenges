/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Drew
 */
public class EnergyDrinkConsuption {
    
    public static void main(String[] args) {
        double totalCustomersSurveyed = 12467;
        double oneDrinkPerWeek = totalCustomersSurveyed/14;
        double totalPreferCitrus = .64 * 12467;
        
        
        System.out.println("The amount of customes that drink one energy drink per week is " + oneDrinkPerWeek +
                "\n. The amout of people that prefer citrus flavors is " + totalPreferCitrus + ".");
    }
    
}

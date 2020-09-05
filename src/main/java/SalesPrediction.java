/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Drew
 */


public class SalesPrediction {
    
    public static void main(String[] args) {
        
        double salesPercentage = .62;
        double totalSales = 4600000;
        double eastCoastSales = totalSales * salesPercentage;
        
        System.out.println("The East Coast sales division will account for " + eastCoastSales + " of sales.");
        
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Drew
 */
import java.text.NumberFormat;


public class StockTransaction {
    public static void main(String[] args) {
        
        NumberFormat money = NumberFormat.getCurrencyInstance();

        double numberOfShares = 1000;
        double buyingCosts = 32.87;
        
        double buyingRate = numberOfShares * buyingCosts;
        double brokerBuyFee = (buyingRate) * .02;
        double totalBuyTransaction = buyingRate + brokerBuyFee;
        
        double sellingCosts = 33.92;
        double brokerSellFees = (sellingCosts * numberOfShares) * .02;
        double totalSellTransaction = (numberOfShares * sellingCosts) - brokerSellFees;
        
        
        double amountMade = totalSellTransaction - totalBuyTransaction;
        
        System.out.println("Joe bought the stock for " + money.format(totalBuyTransaction));
        System.out.println("When Joe bought the stock, he paid his broker " + money.format(brokerBuyFee));
        System.out.println("When Joe sold his stock he sold it for " + money.format(totalSellTransaction));
        System.out.println("When Joe sold his stock he ha paid his broker " + money.format(brokerSellFees));
        System.out.println("In all, this investment made " + money.format(amountMade) +" for Joe.");
        
    }
    
    
}

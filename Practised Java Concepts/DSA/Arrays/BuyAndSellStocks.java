/*
 
You are given an array prices where prices[i] is the price of a given stock on the ith day.
You want to maximize your profit by choosing a single day to buy one stock and choosing a 
different day in the future to sell that stock. Return the maximum profit you can achieve 
from this transaction. If you cannot achieve any profit, return 0.

prices = [7, 1, 5, 3, 6, 4]

profit = sellingPrice - buyPrice

Day = 1
--------

BuyingPrice = 7

Day = 2
--------

SellingPrice = 1
BuyingPrice = 7

Profit = 1 - 7 = -6 

Day = 3
-------

SellingPrice = 5
BuyingPrice = 1

Profit = 5 - 1 = 4 

Day = 4
--------

SellingPrice = 3
BuyingPrice = 1

Profit = 3 - 1 = 2 
Day = 5
-------

SellingPrice = 6
BuyingPrice = 1

Profit = 6 - 1 = 5 

Day = 6
--------

SellingPrice = 4
BuyingPrice = 1

Profit = 4 - 1 = 3 

pseudo code:
-----------
var buyPrice = +infinity (track lowest buying(stock) price)
var maxPrice = 0(updated everytime)

for(int i=0 to n){
    if(buyPrice <  sellingPrice){ --> case 1
        profit = sellingPrice - buyPrice
    }
    buyPrice = sellingPrice(current price) --> case 2
}
 */


import java.util.*;

public class BuyAndSellStocks {

    public static int buyAndSellStocks(int prices[]) {
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i=0; i<prices.length; i++){
            if(buyPrice < prices[i]){ //profit
                int profit = prices[i] - buyPrice;
                maxProfit = Math.max(maxProfit, profit);
            }else{
                buyPrice = prices[i];
            }
        }
        return maxProfit;
        
    }
    public static void main(String[] args) {

        int prices[] = {7, 1, 5, 3, 6, 4};

        System.out.println("Maximum Profit Achieved is : " + buyAndSellStocks(prices));   
    }
    
}

//O(n)


/*
 
output:
-------

Maximum Profit Achieved is : 5

 */

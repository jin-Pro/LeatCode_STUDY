package easy;

public class No_121_BestTimetoBuyandSellStock {

    int maxProfit(int prices[]) {
        int lowest = 999999;
        int marginMax = 0;
        
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < lowest)
                lowest = prices[i];
            
            else if (prices[i] - lowest > marginMax)
                marginMax = prices[i] - lowest;
        }
        return marginMax;
    }
}
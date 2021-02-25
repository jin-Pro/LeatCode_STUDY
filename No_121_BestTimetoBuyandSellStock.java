package LeetCode;

public class No_121_BestTimetoBuyandSellStock {
	public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int max = 0;
        
        for(int i = 0; i < prices.length; i++) {
        	if(prices[i] < min) min = prices[i];
        	else if(prices[i] - min > max) max = prices[i] - min;
        }
        
        return max;
    }
	//Runtime: 1 ms, faster than 98.84% 
	//Memory Usage: 52.4 MB, less than 30.51% 
	
	//처음에 2중 for문 사용 >> 시간초과
	//생각한게 단일 for문 어떻게 해야할까 생각함
	//prices값중 max값이 가장 클때의 prices의 원소 두개를 i와 j라고 가정한다.
	// i와 j사이의 prices값은 prices[i]와 prices[j] 사이의 범위에 존재한다.
	// 따라서 min값이 정의될때마다 새로운 max값이 정의되지 않는다면 max값은 변경되지 않는다.
}

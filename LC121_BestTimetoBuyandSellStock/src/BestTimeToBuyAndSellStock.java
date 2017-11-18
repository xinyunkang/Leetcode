
public class BestTimeToBuyAndSellStock {
	public static int maxProfit(int[] prices) {
        int minPrice=Integer.MAX_VALUE;
        int maxProfit=0;  //use maxProfit, NOT max value
        for(int i=0;i<prices.length;i++)
        {
        	if(prices[i]<minPrice) { //if lower than min replace
        		minPrice=prices[i];        		
        	}
        	else if(prices[i]-minPrice>maxProfit) { //if new max profit, replace.
        		maxProfit=prices[i]-minPrice;
        	}
        }
        return maxProfit;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] testInput = new int[] {7,1,3,5,6};
		System.out.println(maxProfit(testInput));
		
	}

}

package LEC40;

public class Best_time_buy_sell {
    public int maxProfit(int[] prices) {
        int max = 0;
        int i = 1 , min = prices[0];

        while(i < prices.length){
            max = Math.max(max , (prices[i] - min));
            i++;
            min = Math.min(min , prices[i-1]);
        }
        return max;
    }
}

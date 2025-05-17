import java.util.Scanner;

public class BestTimeStock {
    public static void main(String[] args){
        int[] prices = {7,1,5,3,6,4};
        int maxProfit = solution(prices);
        System.out.println(maxProfit);
    }
    public static int solution(int[] prices) {
        int buy = prices[0];
        int mProfit = 0;
        for(int i = 1; i < prices.length; i++){
            int profit = prices[i] - buy;
            if(buy > prices[i]){
                buy = prices[i];
            }else{
                mProfit = Math.max(profit, mProfit);
            }
        }

        return mProfit;
    }
}

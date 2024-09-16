package javaCodingQuestions;

public class buyAndSellStocks {


    public static void main(String[] args){

        int[] prices = {7, 1, 5, 3, 6, 4 };
        int buy = prices[0];
        int maxprofit = 0;

        for( int i = 1; i < prices.length; i++){

            if( buy > prices[i]){
                buy = prices[i];
            }
            else{
                int profit = prices[i] - buy;
                if( profit> maxprofit){
                    maxprofit= profit;
                }
            }

        }

        System.out.println("Max profit is "+maxprofit);

    }

}

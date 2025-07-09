import java.util.Scanner;

public class BestTimeToBuyAndSellStock2 {

    public int maxProfit(int[] prices) {
        int l = prices.length;
        int buy = prices[0], profit = 0;

        for (int i = 1; i < l; i++) {
            if (buy < prices[i])
                profit += prices[i] - buy;

            buy = prices[i];
        }
        return profit;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BestTimeToBuyAndSellStock2 obj = new BestTimeToBuyAndSellStock2();

        System.out.print("Enter number of days: ");
        int n = scanner.nextInt();

        int[] prices = new int[n];

        System.out.println("Enter stock prices for each day:");
        for (int i = 0; i < n; i++) {
            prices[i] = scanner.nextInt();
        }

        int result = obj.maxProfit(prices);

        System.out.println("Maximum Profit: " + result);
        scanner.close();
    }
}

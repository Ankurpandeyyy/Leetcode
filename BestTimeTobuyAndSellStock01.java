import java.util.Scanner;

public class BestTimeTobuyAndSellStock01 {

    public int maxProfit(int[] prices) {
        int l = prices.length;
        int buy = prices[0], profit = 0;

        for (int i = 1; i < l; i++) {
            if (prices[i] < buy)
                buy = prices[i];
            else if (prices[i] - buy > profit)
                profit = prices[i] - buy;
        }

        return profit;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BestTimeTobuyAndSellStock01 obj = new BestTimeTobuyAndSellStock01();

        System.out.print("Enter number of days: ");
        int n = scanner.nextInt();

        int[] prices = new int[n];
        System.out.println("Enter stock prices for each day:");
        for (int i = 0; i < n; i++) {
            prices[i] = scanner.nextInt();
        }

        int result = obj.maxProfit(prices);
        System.out.println("Maximum Profit (Single Transaction): " + result);

        scanner.close();
    }
}

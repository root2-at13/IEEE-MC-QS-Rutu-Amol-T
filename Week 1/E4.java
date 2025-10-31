import java.util.*;
public class E4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of days: ");
        int n = sc.nextInt();

        int[] prices = new int[n];
        System.out.println("Enter stock prices for each day:");
        for (int i = 0; i < n; i++) {
            prices[i] = sc.nextInt();
        }
        E4 obj = new E4();
        int profit = obj.maxProfit(prices);

        System.out.println("Maximum Profit: " + profit);

        sc.close();
    }
    public int maxProfit(int[] prices) {
        int min = prices[0];
        int max = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < min) {
                min = prices[i];
            } else if (prices[i] - min > max) {
                max = prices[i] - min;
            }
        }
        return max;
    }
}
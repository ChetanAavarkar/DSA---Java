package dsa;

import java.util.Scanner;

public class BestTimeToBuyAndSellStock {

	public static int maxProfit(int[] prices) {
		int minPrice = Integer.MAX_VALUE;
		int maxProfit = 0;
		
		for (int price : prices) {
			if (price < minPrice) {
				minPrice = price;
			} else if (price - minPrice > maxProfit) {
				maxProfit = price - minPrice;
			}
		}
		return maxProfit;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter stock prices separated by space: ");
		String line = sc.nextLine();
		
		String[] parts = line.trim().split("\\s+");
		int[] prices = new int[parts.length];
		
		for (int i = 0; i < parts.length; i++) {
			prices[i] = Integer.parseInt(parts[i]);
		}
		
		int result = maxProfit(prices);
		System.out.println("Maximum Profit: " + result);
		sc.close();
	}
}
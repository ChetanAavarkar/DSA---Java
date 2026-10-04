package dsa;

import java.util.Scanner;

public class MaximumDifference {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number of elements: ");
		int n = sc.nextInt();
		
		if (n < 2) {
			System.out.println("Need at least 2 elements");
			sc.close();
			return;
		}
		
		int[] arr = new int[n];
		System.out.print("Enter " + n + " numbers: ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		int minSoFar = arr[0];
		int maxDiff = Integer.MIN_VALUE;
		
		for (int i = 1; i < n; i++) {
			int diff = arr[i] - minSoFar;
			if (diff > maxDiff) {
				maxDiff = diff;
			}
			if (arr[i] < minSoFar) {
				minSoFar = arr[i];
			}
		}
	
		System.out.println("Maximum difference ( j > i): " + maxDiff);
		sc.close();
	}
}
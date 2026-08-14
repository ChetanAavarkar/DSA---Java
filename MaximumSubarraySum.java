package dsa;

import java.util.Scanner;

public class MaximumSubarraySum {

	public static int maxSubArraySum(int[] arr) {
		int maxSoFar = arr[0];
		int currentMax = arr[0];
		
		for (int i = 1; i < arr.length; i++) {
			currentMax = Math.max(arr[i], currentMax + arr[i]);
			maxSoFar = Math.max(maxSoFar, currentMax);
		}
		return maxSoFar;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number of elements: ");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		System.out.println("Enter the elements:");
		
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		int result = maxSubArraySum(arr);
		System.out.println("Maximum Subarray Sum = " + result);
		
		sc.close();
	}
}

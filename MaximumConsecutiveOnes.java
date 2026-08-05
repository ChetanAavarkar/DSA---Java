package dsa;

import java.util.Scanner;

public class MaximumConsecutiveOnes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the size of array: ");
		int n = sc.nextInt();
		
		int[] nums = new int[n];
		
		System.out.print("Enter the elements: ");
		for (int i = 0; i < n; i++) {
			nums[i] = sc.nextInt();
		}
		
		int maxCount = 0;
		int currentCount = 0;

		for (int num : nums) {
			if (num == 1) {
				currentCount++;
				maxCount = Math.max(maxCount, currentCount);
			} else {
				currentCount = 0;
			}
		}
		
		System.out.println("Maximum Consecutive Ones: " + maxCount);
		sc.close();
	}
}
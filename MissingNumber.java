package dsa;

import java.util.Scanner;

public class MissingNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter numbers separated by space: ");
		String line = sc.nextLine().trim();
		
		String[] parts = line.split("\\s+");
		int[] nums = new int[parts.length];
		for (int i = 0; i < parts.length; i++) {
			nums[i] = Integer.parseInt(parts[i]);
		}
		
		int missing = findMissingNumber(nums);
		System.out.println("Missing number: " + missing);
		
		sc.close();
	}
	
	public static int findMissingNumber(int[] nums) {
		int n = nums.length;
		int expectedSum = n * (n + 1) / 2;
		int actualSum = 0;
		
		for (int num : nums) {
			actualSum += num;
		}
		
		return expectedSum - actualSum;
	}
}
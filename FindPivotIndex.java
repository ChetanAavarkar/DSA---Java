package dsa;

import java.util.Scanner;

public class FindPivotIndex {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter numbers separated by space: ");
		String line = sc.nextLine().trim();
		
		String[] parts = line.split("\\s+");
		int[] nums = new int[parts.length];
		for (int i = 0; i < parts.length; i++) {
			nums[i] = Integer.parseInt(parts[i]);
		}
		
		int pivot = findPivotIndex(nums);
		System.out.println("Pivot Index: " + pivot);
		
		sc.close();
	}

	public static int findPivotIndex(int[] nums) {
		int totalSum = 0;
		for (int num : nums) {
			totalSum += num;
		}
		
		int leftSum = 0;
		
		for (int i = 0; i < nums.length; i++) {
			int rightSum = totalSum - leftSum - nums[i];
			
			if (leftSum == rightSum) {
				return i;
			}
			
			leftSum += nums[i];
		}
		
		return -1;
	}
}
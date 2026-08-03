package dsa;

import java.util.Scanner;

public class ProductOfArrayExceptSelf {
	
	public static int[] productExceptSelf(int[] nums) {
		int n = nums.length;
		int[] result = new int[n];
		
		result[0] = 1;
		for (int i = 1; i < n; i++) {
			result[i] = result[i - 1] * nums[i - 1];
		}
		
		int suffix = 1;
		for (int i = n - 1; i >= 0; i--) {
			result[i] = result[i] * suffix;
			suffix *= nums[i];
		}
		return result;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the size of array: ");
		int n = sc.nextInt();
		
		int[] nums = new int[n];
		System.out.print("Enter " + n + " elements: ");
		for (int i = 0 ; i < n; i++) {
			nums[i] = sc.nextInt();
		}
		
		int[] result = productExceptSelf(nums);
		
		System.out.print("Output: ");
		for (int num : result) {
			System.out.print(num + " ");
		}
		sc.close();
	}
}
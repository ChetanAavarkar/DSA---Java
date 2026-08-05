package dsa;

import java.util.Scanner;

public class SingleNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the size of array: ");
		int n = sc.nextInt();
		
		int[] nums = new int[n];
		
		System.out.print("Enter the elements: ");
		for (int i = 0; i < n; i++) {
			nums[i] = sc.nextInt();
		}
		
		int result = 0;
		
		for (int num : nums) {
			result = result ^ num;
		}
		
		System.out.println("Single Number: " + result);
		
		sc.close();
	}
}
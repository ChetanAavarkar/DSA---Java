package dsa;

import java.util.Scanner;

public class MoveZeroes {

	public static void moveZeroes(int[] nums) {
		int insertPos = 0;
		
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != 0) {
				nums[insertPos] = nums[i];
				insertPos++;
			}
		}
		
		while (insertPos < nums.length) {
			nums[insertPos] = 0;
			insertPos++;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the size of array: ");
		int n = sc.nextInt();
		
		int[] nums = new int[n];
		System.out.print("Enter " + n + " elements: ");
		for (int i = 0; i < n; i++) {
			nums[i] = sc.nextInt();
		}
		
		moveZeroes(nums);
		
		System.out.print("Output: ");
		for (int num : nums) {
			System.out.print(num + " ");
		}
		sc.close();
	}
}
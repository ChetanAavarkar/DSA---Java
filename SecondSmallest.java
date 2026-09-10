package dsa;

import java.util.Scanner;

public class SecondSmallest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter numbers separated by space: ");
		String n = sc.nextLine();
		
		String[] parts = n.trim().split("\\s+");
		int m = parts.length;
		
		if (m < 2) {
			System.out.println("Need at least 2 numbers");
			return;
		}
		
		int[] arr = new int[m];
		for(int i = 0; i < m; i++) {
			arr[i] = Integer.parseInt(parts[i]);
		}
		
		int smallest = Integer.MAX_VALUE;
		int secondsmallest = Integer.MAX_VALUE;
		
		for(int num : arr) {
			if(num < smallest) {
				secondsmallest = smallest;
				smallest = num;
			} else if (num < secondsmallest && num != smallest) {
				secondsmallest = num;
			}
		}
		
		if (secondsmallest == Integer.MAX_VALUE) {
			System.out.println("No second smallest element (all elements are same)");
		} else {
			System.out.println("Second smallest element: " + secondsmallest);
		}
		sc.close();
	}
}
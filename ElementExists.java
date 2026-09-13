package dsa;

import java.util.Scanner;

public class ElementExists {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter nuber of elements: ");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		System.out.println("Enter " + n + " numbers: ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Enter the number to search: ");
		int target = sc.nextInt();

		boolean found = false;
		for (int num : arr) {
			if (num == target) {
				found = true;
				break;
			}
		}
		
		if (found) {
			System.out.println("Found");
		} else {
			System.out.println("Not Found");
		}
	}
}
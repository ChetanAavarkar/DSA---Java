package dsa;

import java.util.Scanner;

public class CountOccurrences {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number of elements: ");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		System.out.println("Enter " + n + " numbers: ");
		for (int i = 0 ; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Enter the number to count: ");
		int target = sc.nextInt();
		
		int count = 0;
		for (int num : arr) {
			if (num == target) {
				count++;
			}
		}

		System.out.println("Occurrence of " + target + ": " + count);
		sc.close();
	}
}
package dsa;

import java.util.Scanner;

public class LargestAndSecondLargestElement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of elements: ");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		System.out.println("Enter " + n + " elements: ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;
		
		for (int num : arr) {
			if (num > largest) {
				secondLargest = largest;
				largest = num;
			} else if (num > secondLargest && num != largest) {
				secondLargest = num;
			}
		}
		
		System.out.println("Largest element: " + largest);
		
		if (secondLargest == Integer.MIN_VALUE) {
			System.out.println("Second largest element: Not found ");
		} else {
			System.out.println("Second largest element:" + secondLargest);
		}
		sc.close();
	}
}

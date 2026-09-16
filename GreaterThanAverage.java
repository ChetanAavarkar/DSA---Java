package dsa;

import java.util.Scanner;

public class GreaterThanAverage {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number of elements: ");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		System.out.print("Enter " + n + " numbers: ");
		
		int sum = 0;
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
			sum += arr[i];
		}
		
		double average = (double) sum / n;
		
		int count = 0;
		for (int num : arr) {
			if (num > average) {
				count++;
			}
		}
		
		System.out.println("Average = " + average);
		System.out.println("Count of numbers greater than average = " + count);
		sc.close();
	}
}
package dsa;

import java.util.Scanner;

public class CountGreaterThanAverage {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number of elements: ");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		System.out.println("Enter " + n + " elements:");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		double sum = 0;
		for (int num : arr) {
			sum += num;
		}
		double average = sum / n;
		
		int count = 0;
		for (int num : arr) {
			if (num > average) {
				count++;
			}
		}
		
		System.out.println("Average: " + average);
		System.out.println("Count of elements greater than average: " + count);
		sc.close();
	}

}

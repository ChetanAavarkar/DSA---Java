package dsa;

import java.util.Scanner;

public class SumOfPositive {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number of elements: ");
		int n = sc.nextInt();
		
		int[]arr = new int[n];
		System.out.print("Enter " + n + " numbers: ");
		for (int i = 0; i < n; i++) {
			 arr[i] = sc.nextInt();
		}
		
		int sum = 0;
		for (int num: arr) {
			if (num > 0) {
				sum += num;
			}
		}
		
		System.out.println("Sum of positive numbers: " + sum);
		sc.close();
	}
}
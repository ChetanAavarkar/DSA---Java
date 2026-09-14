package dsa;

import java.util.Scanner;

public class CountGreaterThan10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of array elements: ");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		System.out.println("Enter " + n + " integeres: ");
		for (int i = 0 ; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		int count = 0;
		for(int i = 0; i < n; i++) {
			if (arr[i] > 10) {
				count++;
			}
		}
		
		System.out.println("Count of numbers greater than 10: " + count);
	}
}
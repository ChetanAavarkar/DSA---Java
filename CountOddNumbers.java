package dsa;

import java.util.Scanner;

public class CountOddNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number of elements: ");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		System.out.println("Enter " + n + " numbers: ");
		for (int i = 0 ; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		int count = 0;
		for (int i = 0; i < n; i ++) {
			if (arr[i] %2 != 0) { 
				count++;
			}
		}
		
		System.out.println("Count of odd numberes is: " + count);
		sc.close();
	}
}
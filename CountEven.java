package dsa;

import java.util.Scanner;

public class CountEven {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of array elements: ");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		System.out.println("Enter " + n + " elements: ");
		for (int i = 0; i < n; i++) {
			arr[i] =sc.nextInt();
		}
		
		int count = 0;
		for(int i = 0; i < n; i++) {
			if (arr[i] %2 == 0) {
				count++;
			}
		}
		
		System.out.println("Number of even elements: " + count);
		sc.close();
	}
}
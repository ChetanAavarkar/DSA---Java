package dsa;

import java.util.Scanner;

public class CountPositive {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of array elements: ");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		System.out.println("Enter " + n + " integers: ");
		
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		int count = 0;
		for (int num : arr) {
			if (num > 0) {
				count++;
			}
		}
		
		System.out.println(count);
		sc.close();
	}
}

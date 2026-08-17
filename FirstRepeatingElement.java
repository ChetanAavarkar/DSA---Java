package dsa;

import java.util.HashSet;
import java.util.Scanner;

public class FirstRepeatingElement {

	public static int findFirstRepeating(int[] arr) {
		HashSet<Integer> set = new HashSet<>();
		int minIndex = -1;

		for (int i = arr.length - 1; i >= 0; i--) {
			if (set.contains(arr[i])) {
				minIndex = i;
			} else {
				set.add(arr[i]);
			}
		}
		
		return (minIndex != -1) ? arr[minIndex] : -1;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the size of the array: ");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		System.out.println("Enter " + n + " elements:");
		
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		int result = findFirstRepeating(arr);
		
		if (result != -1) {
			System.out.println("First repeating element is: " + result);
		} else {
			System.out.println("No repeating element found");
		}
		sc.close();
	}
}

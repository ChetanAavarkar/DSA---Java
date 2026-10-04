package dsa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RemoveDuplicates {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number of elements: ");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		System.out.println("Enter " + n + " sorted numbers:");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		List<Integer> unique = new ArrayList<>();
		
		for (int num : arr) {
			boolean exists = false;
			for (int u : unique) {
				if (u == num) {
					exists = true;
					break;
				}
			}
			if (!exists) {
				unique.add(num);
			}
		}
		System.out.println("Unique elements: " + unique);
		sc.close();
	}
}
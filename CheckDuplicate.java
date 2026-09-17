package dsa;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CheckDuplicate {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter size of array: ");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		System.out.println("Enter " + n + " elements:");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		if (hasDuplicate(arr)) {
			System.out.println("Duplicate found");
		} else {
			System.out.println("No duplicates");
		}
		sc.close();
	}
	
	public static boolean hasDuplicate(int[] arr) {
		Set<Integer> set = new HashSet<>();
		
		for (int num : arr) {
			if (!set.add(num)) {
				return true;
			}
		}
		return false;
	}
}
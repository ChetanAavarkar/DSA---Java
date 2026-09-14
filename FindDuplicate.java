package dsa;

import java.util.Scanner;

public class FindDuplicate {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter how many numbers: ");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		System.out.print("Enter " + n + " numbers:");
		
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (arr[i] == arr[j]) {
					System.out.println("Duplicate number is : " + arr[i]);
					sc.close();
					return;
				}
			}
		}
		
		System.out.println("No duplicate found");
		sc.close();
	}
}
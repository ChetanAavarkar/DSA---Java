package dsa;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FirstDuplicate {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number of elements: ");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		System.out.print("enter " + n + " numbers: ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		Map<Integer, Integer> map = new HashMap<>();
		Integer firstDuplicate = null;
		
		for (int num : arr) {
			if (map.containsKey(num)) {
				firstDuplicate = num;
				break;
			}
			map.put(num, 1);
		}
		
		if (firstDuplicate != null) {
			System.out.println("First duplicate element: " + firstDuplicate);
		} else {
			System.out.println("No duplicate found");
		}
		sc.close();
	}
}
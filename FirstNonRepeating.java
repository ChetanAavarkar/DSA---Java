package dsa;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FirstNonRepeating {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter size of array: ");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		System.out.println("Enter " + n + " elements:");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		int result = findFirstNonRepeating(arr);
		
		if (result != -1) {
			System.out.println("First non-repeating element: " + result);
		} else {
			System.out.println("No non-repeating element found");
		}
		sc.close();
	}
	
	public static int findFirstNonRepeating(int[] arr) {
		Map<Integer, Integer> frequency = new LinkedHashMap<>();
		
		for (int num : arr) {
			frequency.put(num, frequency.getOrDefault(num, 0) + 1);
		}
		
		for (Map.Entry<Integer, Integer> entry : frequency.entrySet()) {
			if (entry.getValue() == 1) {
				return entry.getKey();
			}
		}
		return -1;
	}
}
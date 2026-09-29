package dsa;

import java.util.Arrays;
import java.util.Scanner;

public class RotateRightBy2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number of elements: ");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		System.out.println("Enter " + n + " elements:");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Enter rotation count (k): ");
		int k = sc.nextInt();
		
		rotateRight(arr, k);
		
		System.out.println("After right rotation by " + k + ": " + Arrays.toString(arr));
		sc.close();
	}
	
	public static void rotateRight(int[] arr, int k) {
		int n = arr.length;
		if (n == 0) return;
		
		k = k % n;
		if (k == 0) return;
		
		reverse(arr, 0, n - 1);
		reverse(arr, 0, k - 1);
		reverse(arr, k, n - 1);
	}
	
	private static void reverse(int[] arr, int start, int end) {
		while (start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}
}

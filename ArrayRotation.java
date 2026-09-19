package dsa;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayRotation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter size of array: ");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		System.out.println("Enter " + n + " elements:");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Enter number of positions to rotate right: ");
		int k = sc.nextInt();
		
		k = k % n;
		
		rotateRight(arr, k);
		
		System.out.println("Array after right rotation by " + k + " positions: ");
		System.out.println(Arrays.toString(arr));
		
		sc.close();
	}
	
	public static void rotateRight(int[] arr, int k) {
		int n = arr.length;
		
		reverse(arr, 0, n - 1);
		
		reverse(arr, 0, k - 1);
		
		reverse(arr, k, n - 1);
	}
	
	public static void reverse(int[] arr, int start, int end) {
		while (start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}
}
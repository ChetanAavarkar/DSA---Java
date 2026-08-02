package dsa;

import java.util.Arrays;
import java.util.Scanner;

public class ValidAnagram {

	public static boolean isAnagram(String s, String t) {
		if (s.length() != t.length()) {
			return false;
		}
		
		char[] arr1 = s.toCharArray();
		char[] arr2 = t.toCharArray();
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		return Arrays.equals(arr1, arr2);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter first string: ");
		String str1 = sc.nextLine().trim();
		
		System.out.print("Enter second string: ");
		String str2 = sc.nextLine().trim();
		
		boolean result = isAnagram(str1, str2);
		
		System.out.println("Output: " + result);
		
		sc.close();
	}
}

package dsa;

import java.util.Scanner;

public class ValidPanidrome {

	public static boolean isPalindrome(String s) {
		StringBuilder cleaned = new StringBuilder();
		
		for (char c : s.toCharArray()) {
			if (Character.isLetterOrDigit(c)) {
				cleaned.append(Character.toLowerCase(c));
			}
		}
		
		int left = 0;
		int right = cleaned.length() - 1;
		
		while (left < right) {
			if (cleaned.charAt(left) != cleaned.charAt(right)) {
				return false;
			}
			left++;
			right--;
		}
		return true;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a string:");
		String n = sc.nextLine();
		
		boolean result = isPalindrome(n);
		System.out.println(result);
		sc.close();
	}
}
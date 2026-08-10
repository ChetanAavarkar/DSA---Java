package dsa;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FirstUniqueCharacter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a string: ");
		String s = sc.nextLine();
		
		int index = firstUniqueChar(s);
		System.out.println("Output: " + index);
		
		sc.close();
	}

	private static int firstUniqueChar(String s) {
		Map<Character, Integer> freq = new HashMap<>();
		
		for (char c : s.toCharArray()) {
			freq.put(c, freq.getOrDefault(c, 0) + 1);
		}
		
		for (int i = 0; i < s.length(); i++) {
			if (freq.get(s.charAt(i)) == 1) {
				return i;
			}
		}
		
		return -1;
	}
}
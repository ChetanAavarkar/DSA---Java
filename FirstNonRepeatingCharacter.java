package dsa;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FirstNonRepeatingCharacter {

	public static Character firstNonRepeating(String s) {
		if (s == null || s.isEmpty()) {
			return null;
		}
		
		Map<Character, Integer> frequencyMap = new HashMap<>();
		
		for (char c : s.toCharArray()) {
			frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
		}
		
		for (char c : s.toCharArray()) {
			if (frequencyMap.get(c) == 1) {
				return c;
			}
		}
		
		return null;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a string: ");
		String input = sc.nextLine();
		
		Character result = firstNonRepeating(input);
		
		if (result != null) {
			System.out.println("First non-repeating character: " + result);
		} else {
			System.out.println("No non-repeating character found.");
		}
		
		sc.close();
	}
}
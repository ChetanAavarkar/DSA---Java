package dsa;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ContainsDuplicate {

	public static boolean containsDuplicate(int[] nums) {
		Set<Integer> seen = new HashSet<>();
		
		for (int num : nums) {
			if (seen.contains(num)) {
				return true;
			}
			seen.add(num);
		}
		return false;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter numbers separated by space:");
		String line = sc.nextLine();
		
		String[] parts = line.trim().split("\\s+");
		int[] nums = new int[parts.length];
		
		for (int i = 0; i < parts.length; i++) {
			nums[i] = Integer.parseInt(parts[i]);
		}
		
		boolean result = containsDuplicate(nums);
		System.out.println(result);
		sc.close();
	}
}
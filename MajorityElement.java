package dsa;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MajorityElement {

	public static int majorityElement(int[] nums) {
		Map<Integer, Integer> map = new HashMap<>();
		int majorityCount = nums.length / 2;
		
		for (int num : nums) {
			map.put(num, map.getOrDefault(num, 0) + 1);
			if (map.get(num) > majorityCount) {
				return num;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter numbers separated by space: ");
		String n = sc.nextLine().trim();
		
		String[] parts = n.split("\\s+");
		int[] nums = new int[parts.length];
		
		for (int i = 0; i < parts.length; i++) {
			nums[i] = Integer.parseInt(parts[i]);
		}
		
		System.out.println("Output: " + majorityElement(nums));
		sc.close();
	}
}
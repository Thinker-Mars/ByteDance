package easy.sumOfTwoNumbers;

import java.util.HashMap;
import java.util.Map;

public class Solution {
	
	/**
	 *  暴力解法
	 * @param nums
	 * @param target
	 * @return
	 */
	public static int[] twoSum1(int[] nums, int target) {
		int i;
		int j;
		for (i = 0; i < nums.length - 1; i++) {
			int temp1 = nums[i];
			for (j = i + 1; j < nums.length; j++) {
				if (nums[j] == target - temp1) {
					return new int[] {i, j};
				} else {
					continue;
				}
			}
		}
		throw new IllegalArgumentException("error");
		
	}
	
	/**
	 *  双重for循环
	 * @param nums
	 * @param target
	 * @return
	 */
	public static int[] twoSum2(int[] nums, int target) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {
			map.put(nums[i], i);
		}
		for (int i = 0; i < nums.length; i++) {
			int temp = target - nums[i];
			if (map.containsKey(temp) && map.get(temp) != i) {
				return new int[] {i, map.get(temp)};
			}
		}
		throw new IllegalArgumentException("error");
	}
	
	/**
	 * 
	 * @param nums
	 * @param target
	 * @return
	 */
	public static int[] twoSum3(int[] nums, int target) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {
			int temp = target - nums[i];
			if (map.containsKey(temp)) {
				return new int[] {i, map.get(temp)};
			}
			map.put(nums[i], i);
		}
		throw new IllegalArgumentException("error");
	}

}

package onceTime;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Solution {
	//4.0
	public int singleNumber(int[] nums) {
		int result = 0;
		for (int num : nums) {
			//因为0与任何数异或的结果都是它本身，不会影响结果，所以算法入口，
			//我们让0与第一个值异或，来开启下面的运算
			result = num ^ result;
		}
		return result;
		
	}
	//3.0
//	public int singleNumber(int[] nums) {
//		int num = 0;
//		Arrays.sort(nums);//对数组排序
//		for (int i = 0; i < nums.length; i++) {
//			//通过i%2这个运算来判断当前元素是奇数位还是偶数位，只有为偶数位时运算值才为0
//			//若元素是偶数位，则num加上它的值，否则减去它的值
//			num = (i % 2 == 0) ? num + nums[i] : num - nums[i];
//		}
//		return num;
//	}
	//2.0
//	public int singleNumber(int[] nums) {
//		Arrays.sort(nums);//对数组进行排序
//		//因为排好序后的数组中的元素除了要寻找的那个值以外，都是成对出现的，
//		//所以，以每次递增2的规律遍历数组
//		for (int i = 0; i < nums.length - 1; i+=2) {
//			//当前值与它后面的值不相等，则它就是寻找值
//			if (nums[i] != nums[i + 1]) {
//				return nums[i];
//			}
//			
//		}
//		//遍历结束后，没有找到寻找值，则它位于数组末尾，
//		//只有这一种情况下，遍历才会找不到该值
//		return nums[nums.length - 1];
//		
//	}
	
	//1.0
//	public int singleNumber(int[] nums) {
//		Set<Integer> set = new HashSet<>();
//		//遍历数组，把其中的值写入set中
//		for (int a : nums) {
//			if (!set.add(a)) {
//				//若set中已有重复值，就把该值删除，这样遍历结束后的值变是唯一值
//				set.remove(a);
//			}
//		}
//		return set.iterator().next();
//	}

}

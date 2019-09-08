package easy.sumOfTwoNumbers;

public class TestSolution {

	public static void main(String[] args) {
		int[] nums = new int[] {2,7,11,15}; 
		int[] tarNums = Solution.twoSum3(nums, 9);
		for (int item : tarNums) {
			System.out.println(item);
		}

	}

}

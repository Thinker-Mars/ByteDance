package easy.reverseNumber;

public class Solution {
	
	public static int sol1(int num) {
		int reverseNum = 0;
		while (num != 0) {
			
			int pop = num % 10;
			num/=10;
			if (reverseNum > Integer.MAX_VALUE / 10 || reverseNum == Integer.MAX_VALUE / 10 && pop > 7) {
				return 0;
			} else if (reverseNum < Integer.MIN_VALUE / 10 || reverseNum == Integer.MIN_VALUE / 10 && pop < -8) {
				return 0;
			}
			
			reverseNum = reverseNum * 10 + pop;
			
		}
		return reverseNum;
	}

}

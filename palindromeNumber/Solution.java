package easy.palindromeNumber;

public class Solution {
	
    public static boolean isPalindrome(int num) {
    	if (num < 0 || (num % 10) == 0 && num != 0) {
    		return false;
    	}
    	int reverseNumber = 0;
    	while (num > reverseNumber) {
    		
    		reverseNumber = reverseNumber * 10 + num % 10;
    		num/=10;
    		
    	}
    	if (num == reverseNumber || num == (reverseNumber / 10)) {
    		return true;
    	} else {
    		return false;
    	}
        
    }

}

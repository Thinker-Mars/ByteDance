package challengeString;

import java.util.HashSet;
import java.util.Set;

public class Solution {
	
//	/**
//	 * 
//	 * @param s 输入的字符串
//	 * @return 最长不重复字串的长度
//	 */
//	public int lengthOfLongestSubstring(String s) {
//		int length = s.length();//取得字符串的长度
//		int size = 0;
//		for (int i = 0; i < length; i++) {
//			for (int j = i + 1; j <= length; j++) {
//				if (!isReapt(s, i, j)) {
//					size = Math.max(size, j - i);
//				}
//			}
//		}
//		
//		return size;
//	}
//	
//	/**
//	 * 
//	 * @param s 输入的字符串
//	 * @param front 指向字符串的头部
//	 * @param rear 指向字符串的尾部
//	 * @return 若重复则返回true，否则返回false
//	 */
//	public boolean isReapt(String s, int front, int rear) {
//		Set<Character> set = new HashSet();
//		for (int i = front; i < rear; i++) {
//			Character c = s.charAt(i);
//			if (set.contains(c)) {
//				return true;
//			}
//			set.add(c);
//		}
//		return false;
//	}
	
	/**
	 * 
	 * @param s 传入的字符串
	 * @return 最长不重复字串的长度
	 */
    public int lengthOfLongestSubstring(String s) {
        int length = s.length();//取得输入字符串的长度
        Set<Character> set = new HashSet<>();
        int size = 0;
        int front = 0;//滑块头
        int rear = 0;//滑块尾
        while (front < length && rear < length) {
            
            if (!set.contains(s.charAt(rear))){//如果set中不包含当前元素，就把它添加到set中，并更新ans值
            	
                set.add(s.charAt(rear++));
                size = Math.max(size, rear - front);
                
            }
            else {
   
                set.remove(s.charAt(front++));//如果set中包含当前元素，就通过逐一移动i的方式删除set内的元素，
                                          //直到set.contains(s.charAt(j))条件不满足为止
            }
        }
        return size;
    }
}


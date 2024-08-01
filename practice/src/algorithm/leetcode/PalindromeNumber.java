package algorithm.leetcode;

/**
 * Given an integer x, return true if x is a
 * palindrome
 * , and false otherwise.
 */
public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        String num = String.valueOf(x);
        String reverseNum = "";
        for (int i = num.length() - 1; i >= 0; i--) {
            reverseNum += num.charAt(i);
        }
        if (num.equals(reverseNum)) {
            return true;
        }
        return false;
    }
}

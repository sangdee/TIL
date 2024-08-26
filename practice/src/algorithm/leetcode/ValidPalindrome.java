package algorithm.leetcode;

public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        String target = "";
        for (int i = 0; i < s.length(); i++) {
            if (Character.isAlphabetic(s.charAt(i)) || Character.isDigit(s.charAt(i))) {
                target += s.charAt(i);
            }
        }
        target = target.toLowerCase();
        for (int i = 0; i < target.length(); i++) {
            if (target.charAt(i) != target.charAt(target.length() - 1 - i)) {
                return false;
            }
        }

        return true;
    }
}

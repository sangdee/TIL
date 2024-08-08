package algorithm.leetcode;

/**
 * Given a string s consisting of words and spaces, return the length of the last word in the string.
 *
 * A word is a maximal
 * substring
 * consisting of non-space characters only.
 */
public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        String trim = s.trim();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < trim.length(); i++) {
            char c = trim.charAt(i);
            if (c != ' ') {
                result.append(c);
            } else {
                result = new StringBuilder();
            }
        }
        return result.length();
    }
}

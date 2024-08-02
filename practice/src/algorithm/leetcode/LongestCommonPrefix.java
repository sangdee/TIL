package algorithm.leetcode;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
        String[] strs = {"ab", "a"};
        System.out.println(longestCommonPrefix.longestCommonPrefix(strs));
    }

    public String longestCommonPrefix(String[] strs) {

        String prefix = "";
        for (int i = 0; i < strs.length; i++) {
            if (i == 0) {
                prefix = strs[i];
            } else {
                prefix = commonPrefix(prefix, strs[i]);
            }
        }

        return prefix;
    }

    private String commonPrefix(String prefix, String str) {

        for (int i = 0; i < prefix.length(); i++) {
            if (i >= str.length() || prefix.charAt(i) != str.charAt(i)) {
                return prefix.substring(0, i);
            }
        }

        return prefix;
    }
}

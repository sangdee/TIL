package algorithm.leetcode;

/**
 * Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
 */
public class FindTheIndexOfTheFirstOccurrenceInAString {
    public static void main(String[] args) {
        FindTheIndexOfTheFirstOccurrenceInAString test = new FindTheIndexOfTheFirstOccurrenceInAString();
        System.out.println(test.strStr("mississippi", "issip"));
    }

    public int strStr(String haystack, String needle) {
        if (needle.isEmpty()) {
            return 0;
        }
        if (haystack.length() < needle.length()) {
            return -1;
        }
        int count = Integer.MAX_VALUE;
        int haystackIndex = 0;
        int needleIndex = 0;
        while (haystackIndex < haystack.length()) {
            if (haystack.charAt(haystackIndex) == needle.charAt(needleIndex)) {
                if (needleIndex == 0) {
                    count = haystackIndex;
                }
                haystackIndex++;
                needleIndex++;
                if (needleIndex == needle.length()) {
                    return count;
                }
            } else {
                haystackIndex = haystackIndex - needleIndex + 1;
                needleIndex = 0;
            }
        }

        return -1;
    }
}

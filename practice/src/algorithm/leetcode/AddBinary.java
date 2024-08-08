package algorithm.leetcode;

/**
 * Given two binary strings a and b, return their sum as a binary string.
 */
public class AddBinary {
    public String addBinary(String a, String b) {
        int aIndex = a.length() - 1;
        int bIndex = b.length() - 1;

        int sum = 0;
        StringBuilder sb = new StringBuilder();

        while (aIndex >= 0 || bIndex >= 0) {
            if (aIndex >= 0) {
                sum += a.charAt(aIndex--) - '0';
            }
            if (bIndex >= 0) {
                sum += b.charAt(bIndex--) - '0';
            }
            sb.append(sum % 2);
            sum /= 2;
        }

        if (sum != 0) {
            sb.append(sum);
        }
        return sb.reverse().toString();
    }
}

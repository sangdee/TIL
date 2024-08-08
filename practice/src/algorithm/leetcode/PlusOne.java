package algorithm.leetcode;


import java.math.BigInteger;
import java.util.Arrays;

/**
 * You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer.
 * The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.
 *
 * Increment the large integer by one and return the resulting array of digits.
 */
public class PlusOne {
    public static void main(String[] args) {
        PlusOne plusOne = new PlusOne();
        System.out.println(Arrays.toString(plusOne.plusOne(new int[]{5, 6, 2, 0, 0, 4, 6, 2, 4, 9})));
    }

    public int[] plusOne(int[] digits) {
        int lastValue = digits[digits.length - 1];

        if (lastValue + 1 != 10) {
            digits[digits.length - 1] = lastValue + 1;
            return digits;
        }

        BigInteger temp = BigInteger.ZERO;

        for (int i = 0; i < digits.length; i++) {
            temp = temp.multiply(BigInteger.TEN).add(BigInteger.valueOf(digits[i]));
        }

        temp = temp.add(BigInteger.ONE); // temp 증가
        String s = String.valueOf(temp);
        int[] result = new int[s.length()];
        for (int i = 0; i < result.length; i++) {
            result[i] = s.charAt(i) - '0';
        }
        return result;
    }
}

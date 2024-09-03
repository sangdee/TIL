package algorithm.leetcode;

public class PowerOfFour {
    public boolean isPowerOfFour(int n) {
        if (n <= 1) {
            return n == 1;
        }
        while (n > 1) {
            if (n % 4 > 0) {
                return false;
            }
            n = n / 4;
        }
        return true;
    }
}

package algorithm.leetcode;

public class PowerOfTwo {
    public static void main(String[] args) {
        PowerOfTwo powerOfTwo = new PowerOfTwo();
        powerOfTwo.isPowerOfTwo(16);
    }

    public boolean isPowerOfTwo(int n) {
        if (n <= 1) {
            return n == 1;
        }
        while (n > 1) {
            if (n % 2 == 1) {
                return false;
            }
            n = n / 2;
        }
        return true;
    }
}

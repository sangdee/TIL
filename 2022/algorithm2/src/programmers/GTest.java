package programmers;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2022/03/09
 */
public class GTest {
    public int solution(int n) {
        long[] temp = new long[1000000000];
        int i = 1;
        int index = 1;
        while (index <= n) {
            if (i < 10) {
                temp[index++] = i;
                i++;
            } else if (i < 100) {
                temp[index++] = i / 10;
                temp[index++] = i % 10;
                i++;
            } else if (i < 1000) {
                temp[index++] = i / 100;
                temp[index++] = (i % 100) / 10;
                temp[index++] = i % 10;
                i++;
            } else if (i < 10000) {
                temp[index++] = i / 1000;
                temp[index++] = (i % 1000) / 100;
                temp[index++] = (i % 100) / 10;
                temp[index++] = i % 10;
                i++;
            } else if (i < 100000) {
                temp[index++] = i / 10000;
                temp[index++] = (i % 10000) / 1000;
                temp[index++] = (i % 1000) / 100;
                temp[index++] = (i % 100) / 10;
                temp[index++] = i % 10;
                i++;
            } else if (i < 1000000) {
                temp[index++] = i / 100000;
                temp[index++] = (i % 100000) / 10000;
                temp[index++] = (i % 10000) / 1000;
                temp[index++] = (i % 1000) / 100;
                temp[index++] = (i % 100) / 10;
                temp[index++] = i % 10;
                i++;
            }
        }

        return (int)temp[n];
    }

    int getSize(int num) {
        int size = 0;
        while (num > 0) {
            num /= 10;
            size++;
        }
        return size;
    }

    int getNumAt(int num, int index) {
        if (index == 0)
            return num % 10;

        int size = getSize(num);

        int res = (int)(num / Math.pow(10.0, size - index));

        return res % 10;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 1_000_000_000; i++) {
            System.out.println(findNthDigit(i));
        }

    }

    public static int findNthDigit(int n) {
        int num = 0;
        int digits = 0;
        int nextNum = 1;
        long range = 9;
        while (digits + nextNum * range < n) {
            digits += nextNum * range;
            num += range;
            range *= 10;
            nextNum++;
        }

        int containNum = (n - digits - 1) / nextNum + num + 1;
        int index = (n - digits - 1) % nextNum;
        String s = String.valueOf(containNum);
        return s.charAt(index) - '0';
    }

}

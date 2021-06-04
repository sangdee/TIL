package programmers_lv2;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2021-06-03
 */

/**
 * N	A	B	answer
 * 8	4	7	3
 */
public class 예상대진표 {
    public static int solution(int n, int a, int b) {
        int count = 1;
        int left = 0;
        int right = 0;
        if (a < b) {
            left = a;
            right = b;
        } else {
            left = b;
            right = a;
        }

        while (true) {
            if (right - left == 1 && left % 2 != 0) {
                break;
            }
            left = (left + 1) / 2;
            right = (right + 1) / 2;

            count++;
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(solution(8, 4, 7));
    }
}
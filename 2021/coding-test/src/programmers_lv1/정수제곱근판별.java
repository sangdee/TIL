package programmers_lv1;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2021-05-31
 */

/**
 * n	return
 * 121	144
 * 3	-1
 */
public class 정수제곱근판별 {
    public long solution(long n) {
        Double sqrt = Math.sqrt(n);

        if (sqrt == sqrt.intValue()) {
            return (long) Math.pow(sqrt + 1, 2);
        } else {
            return -1;
        }
    }
}

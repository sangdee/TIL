package programmers_lv2;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2021-06-01
 */

/**
 * W	H	result
 * 8	12	80
 * <p>
 * (전체 크기) - (한 패턴 직사각형 당 사용하지 못하는 정사각형 크기 * 반복횟수)
 * <p>
 * (w * h) - (((w / 최대공약수) + (h / 최대공약수) - 1) * 최대공약수)
 */
public class 멀쩡한사각형 {
    public long solution(int w, int h) {
        long x = w;
        long y = h;
        long overall = x * y;
        long gcdValue = gcd(x, y);
        return overall - (((x / gcdValue) + (y / gcdValue) - 1) * gcdValue);
    }

    public long gcd(long x, long y) {
        if (y == 0) {
            return x;
        } else {
            return gcd(y, x % y);
        }
    }
}

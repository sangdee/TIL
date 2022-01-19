package programmers_lv1;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2021-05-31
 */
public class 최대공약수와최소공배수 {
    public int[] solution(int n, int m) {
        return new int[]{gcd(n,m),lcm(n,m)};
    }

    public int gcd(int x, int y) {
        if (y == 0) {
            return x;
        } else {
            return gcd(y, x % y);
        }
    }
    public int lcm(int a, int b) {

        return (a*b)/gcd(a,b);
    }
}
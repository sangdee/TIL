import java.math.BigInteger;

/**
 * @author : Sangji Lee
 * @when : 2020-12-30
 * @github : http://github.com/sangji11
 */
public class SkillCheckTest_2 {

    private int gcdThing(int a, int b) {
        BigInteger b1 = BigInteger.valueOf(a);
        BigInteger b2 = BigInteger.valueOf(b);
        BigInteger gcd = b1.gcd(b2);
        return gcd.intValue();
    }

    public long solution(int w, int h) {
        int result = w * h;
        int gcd = gcdThing(w, h);
        if (gcd == 1) {
            result -= (w + h - 1);
        } else {
            result -= (w + h) - gcd;
        }
        return result;
    }
}

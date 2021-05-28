package teamnote;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2021-05-28
 */
public class _3진법 {
    public void solution(int n) {

        String val = "";
        while (n > 0) {
            val = (n % 3) + val;
            n /= 3;
        }
        System.out.println(val);
    }
}

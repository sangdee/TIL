package programmers_lv1;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2021-05-28
 */
public class _3진법뒤집기 {
    public static int solution(int n) {
        int answer = 0;

        String val = "";
        while (n > 0) {
            val = (n % 3) + val;
            n /= 3;
        }

        String inversion = "";
        for (int i = 0; i < val.length(); i++) {
            inversion += val.charAt(val.length() - i - 1);
        }
        int j = 0;
        for (int i = inversion.length() - 1; i >= 0; i--) {

            if (!(inversion.charAt(j) - '0' == 0)) {
                answer += ((inversion.charAt(j) - '0')) * Math.pow(3, i);
            }
            j++;
        }
        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(45));

        System.out.println("dsada" + Integer.parseInt("0021", 3));
    }
}

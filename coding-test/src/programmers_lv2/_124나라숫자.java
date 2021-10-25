package programmers_lv2;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2021-06-01
 */

/**
 * 10진법	124 나라	    10진법	124 나라
 * 1	    1	            6	14          11 42 /  12 44 / 13 114
 * 2	    2	            7	21
 * 3	    4	            8	22
 * 4	    11	            9	24
 * 5	    12	            10	41
 */
public class _124나라숫자 {
    public static String solution(int n) {
        String[] num = {"4", "1", "2"};
        String answer = "";

        while (n > 0) {
            answer = num[n % 3] + answer;
            n = (n - 1) / 3;
        }

        return answer;
    }
}

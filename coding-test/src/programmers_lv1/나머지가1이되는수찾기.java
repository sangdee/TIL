package programmers_lv1;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2022/01/08
 */
public class 나머지가1이되는수찾기 {

    public static int solution(int n) {
        int answer = Integer.MAX_VALUE;

        for (int i = 1; i <= n - 1; i++) {
            if (n % i == 1) {
                answer = i;
                break;
            }
        }
        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {
        solution(12);
    }

}

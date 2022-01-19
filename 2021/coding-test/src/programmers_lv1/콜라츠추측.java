package programmers_lv1;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2021-05-31
 */

/**
 * 1-1. 입력된 수가 짝수라면 2로 나눕니다.
 * 1-2. 입력된 수가 홀수라면 3을 곱하고 1을 더합니다.
 * 2. 결과로 나온 수에 같은 작업을 1이 될 때까지 반복합니다.
 */
public class 콜라츠추측 {
    public static int solution(int num) {
        int answer = 0;
        long number = num;
        while (number != 1) {
            if (number % 2 == 0) {
                number /= 2;
            } else {
                number *= 3;
                number += 1;
            }
            answer++;
        }
        if (answer >= 500) {
            return -1;
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(6));
    }
}

package programmers.고득점kit;

import java.util.Arrays;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2022/03/28
 */
public class 체육복 {
    public static int solution(int n, int[] lost, int[] reserve) {
        int answer = n - lost.length;
        Arrays.sort(lost);
        Arrays.sort(reserve);

        for (int i = 0; i < lost.length; i++) {
            for (int j = 0; j < reserve.length; j++) {
                if (lost[i] == reserve[j]) {
                    lost[i] = reserve[j] = -1;
                    answer++;
                    break;
                }
            }
        }
        for (int i : lost) {
            if (i != -1) {
                for (int j = 0; j < reserve.length; j++) {
                    if (i == reserve[j] - 1 || i == reserve[j] + 1) {
                        reserve[j] = -1;
                        answer++;
                        break;
                    }
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        solution(5, new int[] {2, 4}, new int[] {2, 3, 5});
    }
}

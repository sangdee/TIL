package temp;

import java.util.Arrays;

public class 체육복 {
    public static int solution(int n, int[] lost, int[] reserve) {
        int answer = n - lost.length;
        Arrays.sort(lost);
        Arrays.sort(reserve);
        for (int i = 0; i < lost.length; i++) {
            for (int j = 0; j < reserve.length; j++) {
                if (lost[i] == reserve[j]) {
                    answer++;
                    lost[i] = reserve[j] = -1;
                    break;
                }
            }
        }

        for (int lostPerson : lost) {
            for (int i = 0; i < reserve.length; i++) {
                if (reserve[i] == lostPerson + 1 || reserve[i] == lostPerson - 1) {
                    answer++;
                    reserve[i] = -1;
                    break;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(5, new int[]{4, 5}, new int[]{3, 4}));
    }
}

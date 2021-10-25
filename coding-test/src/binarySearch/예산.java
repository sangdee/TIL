package binarySearch;

import java.util.Arrays;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2021-05-26
 */
public class 예산 {
    /**
     * budgets	                 M	    return
     * [120, 110, 140, 150]	    485	    127
     * <p>
     * 예를 들어, 전체 국가예산이 485이고 4개 지방의 예산요청이 각각 120, 110, 140, 150일 때,
     * 상한액을 127로 잡으면 위의 요청들에 대해서 각각 120, 110, 127, 127을 배정하고 그 합이 484로 가능한 최대가 됩니다.
     * 각 지방에서 요청하는 예산이 담긴 배열 budgets과 총 예산 M이 매개변수로 주어질 때,
     * 위의 조건을 모두 만족하는 상한액을 return 하도록 solution 함수를 작성해주세요.
     */
    public static int solution(int[] budgets, int M) {
        int answer = 0;
        int n = budgets.length;
        Arrays.sort(budgets);
        int start = 0;
        int end = budgets[n - 1];

        while (start <= end) {
            long total = 0;
            int mid = (start + end) / 2;

            for (int i = 0; i < n; i++) {
                if (budgets[i] > mid) {
                    total += mid;
                } else {
                    total += budgets[i];
                }
            }

            if (total > M) {
                end = mid - 1;
            } else {
                answer = mid;
                start = mid + 1;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{120, 110, 140, 150}, 485));
    }
}

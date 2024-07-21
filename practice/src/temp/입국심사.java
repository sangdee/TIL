package temp;

import java.util.Arrays;

public class 입국심사 {
    public static long solution(int n, int[] times) {
        long answer = 0;
        Arrays.sort(times);
        int start = 1;
        int end = times[times.length - 1] * n;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (count(times, mid) >= n) {
                answer = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }

        }
        return answer;
    }

    private static int count(int[] times, int mid) {
        int count = 0;
        for (int i = 0; i < times.length; i++) {
            count += mid / times[i];
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(solution(6, new int[]{7, 10}));
    }
}

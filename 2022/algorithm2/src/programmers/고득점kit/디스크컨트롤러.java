package programmers.고득점kit;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2022/03/08
 */
public class 디스크컨트롤러 {
    public int solution(int[][] jobs) {
        int answer = 0,
            end = 0,
            index = 0,
            count = 0;
        Arrays.sort(jobs, (o1, o2) -> o1[0] - o2[0]);
        PriorityQueue<int[]> pq = new PriorityQueue<>(((o1, o2) -> o1[1] - o2[1]));
        while (count < jobs.length) {
            while (index < jobs.length && jobs[index][0] <= end) {
                pq.add(jobs[index++]);
            }
            if (pq.isEmpty()) {
                end = jobs[index][0];
            } else {
                int[] tmp = pq.poll();
                answer += tmp[1] + end - tmp[0];
                end += tmp[1];
                count++;
            }
        }
        return (int)Math.floor(answer / jobs.length);
    }
}

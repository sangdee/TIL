/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2021-06-05
 */

import java.util.PriorityQueue;

/**
 * scoville	K	return
 * [1, 2, 3, 9, 10, 12]	7	2
 */
public class 스코빌지수 {
    public static int solution(int[] scoville, int K) {
        int answer = 0;

        PriorityQueue<Integer> heap = new PriorityQueue<>();

        for (int j : scoville) {
            heap.offer(j);
        }

        while (heap.peek() < K) {
            Integer poll1 = heap.poll();
            Integer poll2 = heap.poll() * 2;

            int sum = poll1 + poll2;
            answer++;
            heap.offer(sum);

            if (heap.peek() >= K) break;

            if (heap.size() < 2) return -1;
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 2, 3, 9, 10, 12}, 7));
    }
}

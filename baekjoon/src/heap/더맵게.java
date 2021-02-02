package heap;

import java.util.PriorityQueue;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangji11
 * @since : 2021-02-02
 */
public class 더맵게 {
    //섞은 음식의 스코빌 지수 =
    // 가장 맵지 않은 음식의 스코빌 지수 + (두 번째로 맵지 않은 음식의 스코빌 지수 * 2)

    public int solution(int[] scoville, int K) {
        int answer = 0;

        //int형 priorityQueue 선언 (우선순위가 낮은 숫자 순)
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        for (int aScoville : scoville) {
            heap.offer(aScoville);
        }
        while (heap.peek() <= K) {
            if (heap.size() == 1) {
                return -1;
            }
            int a = heap.poll();
            int b = heap.poll();

            int result = a + (b * 2);

            heap.offer(result);
            answer++;
        }
        return answer;
    }
}

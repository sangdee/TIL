package programmers.고득점kit;

import java.util.PriorityQueue;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2022/03/13
 */
public class 더맵게 {
    public static int solution(int[] scoville, int K) {
        int count = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (Integer i : scoville) {
            pq.offer(i);
        }
        int temp = 0;
        while (pq.size() > 1 || temp != 0) {
            Integer poll = pq.poll();
            if (temp == 0) {
                if (poll < K) {
                    temp = poll;
                }
            }else {
                int sum = temp + (poll * 2);
                pq.offer(sum);
                temp = 0;
                count++;
            }
        }
        if (pq.size() == 1) {
            if (pq.poll() < K) {
                return -1;
            }
        }
        return count;
    }
    public int solution2(int[] scoville, int K) {
        PriorityQueue<Integer> pqScov = new PriorityQueue<>();
        for (int s: scoville) {
            pqScov.add(s);
        }

        int cnt = 0;
        while (pqScov.size() > 1 && pqScov.peek() < K) {
            pqScov.add(pqScov.remove() + pqScov.remove() * 2);
            cnt++;
        }

        return pqScov.peek() >= K ? cnt : -1;
    }
    public static void main(String[] args) {
        solution(new int[] {1, 2, 3}, 11);
    }
}

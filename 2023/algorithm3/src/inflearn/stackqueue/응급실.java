package inflearn.stackqueue;

import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2023/05/19
 */
public class 응급실 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        Queue<Patient> q = new LinkedList<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i < n; i++) {
            int risk = sc.nextInt();
            q.add(new Patient(i, risk));
            pq.add(risk);
        }

        int count = 0;
        while (!q.isEmpty()) {
            if (pq.peek() > q.peek().getRisk()) {
                q.add(q.poll());
            } else {
                Patient poll = q.poll();
                pq.poll();
                count++;

                if (poll.getId() == m) {
                    System.out.println(count);
                    break;
                }
            }
        }
    }

    static class Patient {
        private final int id;
        private final int risk;

        public Patient(int id, int risk) {
            this.id = id;
            this.risk = risk;
        }

        public int getId() {
            return id;
        }

        public int getRisk() {
            return risk;
        }
    }
}

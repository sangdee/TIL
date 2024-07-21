package temp;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 응급실 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        Queue<Patient> q = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            q.add(new Patient(i, sc.nextInt()));
        }
        solution(n, m, q);
    }

    private static void solution(int n, int m, Queue<Patient> q) {
        int count = 0;
        while (!q.isEmpty()) {
            Patient poll = q.poll();
            for (Patient patient : q) {
                if (poll.risk < patient.risk) {
                    q.add(poll);
                    poll = null;
                    break;
                }
            }
            if (poll != null) {
                count++;
                if (poll.order == m) {
                    System.out.println(count);
                }
            }
        }
    }

    static class Patient {
        Integer order;
        Integer risk;

        public Patient(Integer order, Integer risk) {
            this.order = order;
            this.risk = risk;
        }
    }
}

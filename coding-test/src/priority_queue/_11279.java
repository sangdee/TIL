package priority_queue;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2021-05-25
 */
public class _11279 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i < n; i++) {
            int x = scanner.nextInt();

            if (x == 0 && priorityQueue.isEmpty()) {
                System.out.println(0);
            } else if (x == 0 && !priorityQueue.isEmpty()) {
                int value = priorityQueue.poll();
                System.out.println(value);
            } else {
                priorityQueue.add(x);
            }
        }

    }
}

package lecture.stack_queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2022/11/26
 */
public class 공주구하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt();
        int count = 0;
        Queue<Integer> q = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            q.add(i);
        }
        while (q.size() != 1) {
            count++;
            if (count == k) {
                q.poll();
                count = 0;
            } else {
                Integer poll = q.poll();
                q.add(poll);
            }
        }
        System.out.println(q.peek());

    }
}

package inflearn.stackqueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2023/05/17
 */
public class 공주구하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        Queue<Integer> q = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            q.add(i);
        }

        int count = 1;
        while (q.size() != 1) {
            if (count != k) {
                count++;
                q.add(q.poll());
            } else {
                count = 1;
                q.poll();
            }
        }
        System.out.println(q.poll());
    }
}

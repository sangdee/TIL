package inflearn.stackqueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2023/05/15
 */
public class 쇠막대기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int sum = 0, stick = 0, temp = 0;

        Queue<Character> q = new LinkedList<>();
        for (int i = 0; i < s.length(); i++) {
            q.add(s.charAt(i));
        }

        while (!q.isEmpty()) {
            Character poll = q.poll();
            if (poll == '(' && q.peek() == ')') {
                q.poll();
                sum += stick;
                stick -= temp;
                temp = 0;
            } else if (poll == '(') {
                stick++;
            } else {
                temp++;
            }
        }
        sum += temp;
        System.out.println(sum);
    }
}

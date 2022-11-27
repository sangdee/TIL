package lecture.stack_queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2022/11/26
 */
public class 교육과정설계 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String essential = sc.nextLine();
        String subjects = sc.nextLine();

        Queue<Character> q = new LinkedList<>();
        for (Character c : essential.toCharArray()) {
            q.add(c);
        }
        for (Character c : subjects.toCharArray()) {
            if (q.isEmpty()) {
                break;
            }
            if (q.peek() == c) {
                q.poll();
            }
        }
        System.out.println(q.isEmpty() ? "YES" : "NO");

    }
}

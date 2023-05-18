package inflearn.stackqueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2023/05/17
 */
public class 교육과정설계 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String requiredSubject = sc.nextLine();
        String planSubject = sc.nextLine();

        Queue<Character> q = new LinkedList<>();
        for (char c : requiredSubject.toCharArray()) {
            q.add(c);
        }

        System.out.println(checkingSubjectOrder(planSubject, q));
    }

    private static String checkingSubjectOrder(String planSubject, Queue<Character> q) {
        for (char c : planSubject.toCharArray()) {
            if (q.peek() == c) {
                q.poll();
            }
            if (q.isEmpty()) {
                return "YES";
            }
        }
        return "NO";
    }

}

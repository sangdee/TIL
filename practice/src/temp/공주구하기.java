package temp;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 공주구하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        System.out.println(solution(n, k));
    }

    private static int solution(int n, int k) {
        Queue<Integer> q = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            q.add(i);
        }
        int count = 1;
        while (q.size() > 1) {
            if (count != k) {
                count++;
                q.add(q.poll());
            } else {
                q.poll();
                count = 1;
            }
        }
        return q.poll();
    }
}

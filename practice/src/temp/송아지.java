package temp;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 송아지 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int e = sc.nextInt();
        System.out.println(bfs(s, e));
    }

    private static int bfs(int s, int e) {
        int count = 0;
        int result = 0;
        int[] dis = {-1, 1, 5};
        int[] arr = new int[100001];
        Queue<Integer> q = new LinkedList<>();
        q.offer(s);

        while (!q.isEmpty()) {
            Integer poll = q.poll();

            for (int i = 0; i < dis.length; i++) {
                int n = poll + dis[i];
                if (n >= 1 && n < 10001 && arr[n] == 0) {
                    if (n == e) {
                        count++;
                        return count;
                    } else {
                        q.offer(n);
                        arr[n] = 1;
                    }
                }
            }
            count++;
        }
        return 0;
    }


}

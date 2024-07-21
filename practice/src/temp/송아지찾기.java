package temp;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 송아지찾기 {
    static int result = 0;
    static int[] dis = {1, -1, 5};
    static int[] check;
    static Queue<Integer> q = new LinkedList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int e = sc.nextInt();
        System.out.println(bfs(s, e));
    }

    //최단거리는 bfs
    private static int bfs(int s, int e) {
        check = new int[10001];
        check[s] = 1;
        int level = 1;
        q.offer(s);
        while (!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                Integer poll = q.poll();

                for (int j = 0; j < dis.length; j++) {
                    int sum = poll + dis[j];
                    if (sum >= 1 && sum <= 10000 && check[sum] == 0) {
                        if (sum != e) {
                            q.offer(sum);
                            check[sum] = 1;
                        } else {
                            result = level;
                            return result;
                        }
                    }
                }

            }

            level++;
        }
        return level;
    }
}

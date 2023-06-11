package algorithm.inflearn.dfs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2023/06/10
 */
public class 최대점수구하기 {
    static int n, m, answer = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        List<Node2> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int score = sc.nextInt();
            int time = sc.nextInt();
            list.add(new Node2(score, time));
        }
        dfs(0, 0, 0, list);
        System.out.println(answer);
    }

    private static void dfs(int l, int sum, int time, List<Node2> list) {
        if (time > m) {
            return;
        }
        if (l == n) {
            answer = Math.max(answer, sum);
        } else {
            dfs(l + 1, sum + list.get(l).score, time + list.get(l).time, list);
            dfs(l + 1, sum, time, list);
        }
    }
}

class Node2 {
    int score;
    int time;

    public Node2(int score, int time) {
        this.score = score;
        this.time = time;
    }
}

package algorithm.inflearn.sort;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2023/05/24
 */
public class 좌표정렬 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Node> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            list.add(new Node(x, y));
        }
        list.sort((a, b) -> {
            if (a.x > b.x) {
                return 1;
            } else if (a.x == b.x) {
                if (a.y > b.y) {
                    return 1;
                }
            }
            return -1;
        });

        for (Node node : list) {
            System.out.println(node.getX() + " " + node.getY());
        }
    }

    static class Node {
        private int x;
        private int y;

        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }

        @Override
        public String toString() {
            return "Node{" +
                   "x=" + x +
                   ", y=" + y +
                   '}';
        }
    }
}

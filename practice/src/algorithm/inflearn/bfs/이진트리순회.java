package algorithm.inflearn.bfs;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2023/05/31
 */
public class 이진트리순회 {
    static Node root;

    public static void main(String[] args) {
        root = new Node(1);
        root.lt = new Node(2);
        root.rt = new Node(3);
        root.lt.lt = new Node(4);
        root.lt.rt = new Node(5);
        root.rt.lt = new Node(6);
        root.rt.rt = new Node(7);
        bfs(root);
    }

    private static void bfs(Node root) {
        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        int l = 0;
        while (!q.isEmpty()) {
            int len = q.size();
            System.out.print(l + " : ");
            for (int i = 0; i < len; i++) {
                Node poll = q.poll();
                System.out.print(poll.data + " ");
                if (poll.lt != null) {
                    q.offer(poll.lt);
                }
                if (poll.rt != null) {
                    q.offer(poll.rt);
                }
            }
            l++;
            System.out.println();
        }

    }

    static class Node {
        int data;
        Node lt;
        Node rt;

        public Node(int data) {
            this.data = data;
            this.lt = null;
            this.rt = null;
        }
    }
}

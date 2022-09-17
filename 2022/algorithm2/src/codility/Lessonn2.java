package codility;

import java.util.PriorityQueue;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2022/09/17
 */
public class Lessonn2 {
    public static void main(String[] args) {
        Lessonn2 lessonn2 = new Lessonn2();
        System.out.println(lessonn2.solution(0, 1, 8));
    }


    public class Node {
        public char alphabet;
        public Integer count;

        public Node(char alphabet, Integer count) {
            this.alphabet = alphabet;
            this.count = count;
        }
    }

    public String solution(int a, int b, int c) {
        PriorityQueue<Node> pq = new PriorityQueue<>((a1, b1) -> Integer.compare(b1.count, a1.count));
        StringBuilder s = new StringBuilder();

        pq.add(new Node('a', a));
        pq.add(new Node('b', b));
        pq.add(new Node('c', c));

        int i = 0;
        while (!pq.isEmpty()) {
            int length = s.length();
            Node node = pq.poll();

            if (s.length() == 0 || s.charAt(length - 1) != node.alphabet) {
                i = 0;
                while (i < 2 && node.count > 0) {
                    s.append(node.alphabet);
                    node.count--;
                    i++;
                }
            } else if (!pq.isEmpty()) {
                Node ch1 = pq.poll();
                i = 0;
                while (i < 1 && ch1.count > 0) {
                    s.append(ch1.alphabet);
                    ch1.count--;
                    i++;
                }
                if (ch1.count > 0) {
                    pq.add(ch1);
                }
            } else {
                break;
            }

            if (node.count > 0) {
                pq.add(node);
            }
        }
        return s.toString();
    }
}


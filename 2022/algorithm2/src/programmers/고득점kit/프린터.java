package programmers.고득점kit;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2022/03/12
 */
public class 프린터 {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        Queue<Node> q = new LinkedList<>();
        int id = 0;
        for (int i : priorities) {
            q.offer(new Node(id, i));
            id++;
        }
        while (!q.isEmpty()) {
            final Node poll = q.poll();
            boolean present = q.stream()
                .anyMatch(node -> node.importance > poll.importance);

            if (present) {
                q.offer(poll);
            } else {
                answer++;
                if (poll.id == location) {
                    break;
                }
            }
        }

        return answer;
    }

    class Node {
        private int id;
        private int importance;

        public Node(int id, int importance) {
            this.id = id;
            this.importance = importance;
        }
    }
}

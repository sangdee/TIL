package programmers_lv2;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2021-06-05
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * priorities	        location	return
 * [2, 1, 3, 2]	        2	        1
 * [1, 1, 9, 1, 1, 1]	0	        5
 */
public class 프린터 {
    public static int solution(int[] priorities, int location) {
        int answer = 1;

        Queue<Node> q = new LinkedList<>();
        Integer[] copyOfArr = new Integer[priorities.length];

        for (int i = 0; i < priorities.length; i++) {
            copyOfArr[i] = priorities[i];
        }
        Arrays.sort(copyOfArr, Comparator.reverseOrder());

        List<Integer> list = new ArrayList<>(Arrays.asList(copyOfArr));

        for (int i = 0; i < priorities.length; i++) {
            q.offer(new Node(priorities[i], i));
        }
//[2, 1, 3, 2]	        2	        1
        while (!q.isEmpty()) {
            Node node = q.poll();
            if (node.getValue() != list.get(0)) {
                q.offer(new Node(node.value, node.index));
            } else {
                if (node.getIndex() == location) {
                    return answer;
                }
                list.remove(0);
                answer++;
            }


        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 1, 9, 1, 1, 1}, 0));
    }

    static class Node {
        private int value;
        private int index;

        public Node(int value, int index) {
            this.value = value;
            this.index = index;
        }

        public int getValue() {
            return value;
        }

        public int getIndex() {
            return index;
        }
    }
}

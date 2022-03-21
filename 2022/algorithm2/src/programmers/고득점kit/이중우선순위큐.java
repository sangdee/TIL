package programmers.고득점kit;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2022/03/20
 */
public class 이중우선순위큐 {
    public int[] solution(String[] operations) {
        int[] answer = {0, 0};
        PriorityQueue<Integer> max = new PriorityQueue<>(Comparator.reverseOrder());
        PriorityQueue<Integer> min = new PriorityQueue<>();
        for (String s : operations) {
            String[] split = s.split(" ");
            if (split[0].equals("I")) {
                Integer integer = Integer.valueOf(split[1]);
                max.offer(integer);
                min.offer(integer);
            } else {
                if (split[1].equals("1")) {
                    Integer peek = max.peek();
                    max.remove(peek);
                    min.remove(peek);
                } else {
                    Integer peek = min.peek();
                    max.remove(peek);
                    min.remove(peek);
                }
            }
        }
        if (!max.isEmpty()) {
            answer[0] = max.poll();
            answer[1] = min.poll();
        }
        return answer;
    }

    public static void main(String[] args) {
        이중우선순위큐 이중우선순위큐 = new 이중우선순위큐();
        System.out.println(이중우선순위큐.solution(new String[] {"I 7", "I 5", "I -5", "D -1"}));
    }
}

package programmers.고득점kit;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2022/03/12
 */
public class 다리를지나는트럭 {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        int sum = 0;
        Queue<Integer> q = new LinkedList<>();
//7 1
        //11 2
        //0 4 3
        for (Integer i : truck_weights) {
            while (true) {
                if (q.isEmpty()) {
                    q.offer(i);
                    sum += i;
                    answer++;
                    break;
                } else if (q.size() == bridge_length) {
                    sum -= q.poll();
                }else {
                    if (sum + i > weight) {
                        answer++;
                        q.offer(0);
                    }else {
                        q.offer(i);
                        sum += i;
                        answer++;
                        break;
                    }
                }
            }
        }

        return answer;
    }
}

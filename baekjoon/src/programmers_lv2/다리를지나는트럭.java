package programmers_lv2;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2021-06-08
 */

import java.util.LinkedList;
import java.util.Queue;

/**
 * bridge_length	weight	truck_weights	return
 * 2	            10	    [7,4,5,6]	    8
 * 100	            100	    [10]	        101
 * 100	            100	    [10,10,10,10,10,10,10,10,10,10]	110
 */
public class 다리를지나는트럭 {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        int sum = 0;
        Queue<Integer> q = new LinkedList<>();

        for (int i : truck_weights) {
            while (true) {
                if (q.isEmpty()) {
                    q.offer(i);
                    sum += i;
                    answer++;
                    break;
                } else if (q.size() == bridge_length) {
                    sum -= q.poll();
                } else {
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
        return answer + bridge_length;
    }
}

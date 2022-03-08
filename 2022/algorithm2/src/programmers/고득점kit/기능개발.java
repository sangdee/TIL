package programmers.고득점kit;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2022/03/08
 */
public class 기능개발 {
    public static int[] solution(int[] progresses, int[] speeds) {
        int[] answer;
        List<Integer> answerList = new ArrayList<>();

        List<Integer> q = new ArrayList<>();
        List<Integer> speedList = new ArrayList<>();
        for (int i = 0; i < progresses.length; i++) {
            q.add(progresses[i]);
            speedList.add(speeds[i]);
        }

        while (!q.isEmpty()) {
            int count = 0;
            for (int i = 0; i < q.size(); i++) {
                q.set(i, q.get(i) + speedList.get(i));
            }
            while (!q.isEmpty() && q.get(0) >= 100) {
                q.remove(0);
                speedList.remove(0);
                count++;
            }
            if (count > 0) {
                answerList.add(count);
            }
        }
        answer = new int[answerList.size()];
        for (int i = 0; i < answerList.size(); i++) {
            answer[i] = answerList.get(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        solution(new int[] {93, 30, 55}, new int[] {1, 30, 5});
    }

}

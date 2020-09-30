import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangji11
 * @since : 2020-09-20 오후 4:32
 */
public class 모의고사 {
    public static int[] solution(int[] answers) {
        int[] person1 = {1, 2, 3, 4, 5}, person2 = {2, 1, 2, 3, 2, 4, 2, 5}, person3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int answer1 = 0, answer2 = 0, answer3 = 0;
        for (int i = 0; i < answers.length; i++) {
            if (person1[i % person1.length] == answers[i]) answer1++;
            if (person2[i % person2.length] == answers[i]) answer2++;
            if (person3[i % person3.length] == answers[i]) answer3++;
        }
        int bestScore = Math.max(Math.max(answer1, answer2), answer3);
        List<Integer> list = new ArrayList<>();
        if (bestScore == answer1) list.add(1);
        if (bestScore == answer2) list.add(2);
        if (bestScore == answer3) list.add(3);
        list.sort(Comparator.naturalOrder());
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] answers = {1, 2, 3, 4, 5};
        solution(answers);
    }
}

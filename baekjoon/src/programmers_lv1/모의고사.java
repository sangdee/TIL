package programmers_lv1;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : Sangji Lee
 * @when : 2021-05-27
 * @github : http://github.com/sangdee
 */
public class 모의고사 {
    public static int[] solution(int[] answers) {
        int[] p1 = {1, 2, 3, 4, 5};
        int[] p2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] p3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int p1Count = 0, p2Count = 0, p3Count = 0;
        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == p1[i % 5]) p1Count++;
            if (answers[i] == p2[i % 8]) p2Count++;
            if (answers[i] == p3[i % 10]) p3Count++;
        }
        int best = Math.max(p1Count, Math.max(p2Count, p3Count));

        List<Integer> list = new ArrayList<>();
        if (best == p1Count) list.add(1);
        if (best == p2Count) list.add(2);
        if (best == p3Count) list.add(3);

        int[] result = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }
}

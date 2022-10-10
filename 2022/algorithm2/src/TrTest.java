import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2022/03/08
 */
public class TrTest {
    public String solution(String s) {
        String answer = "";
        String temp = s.toLowerCase();
        String[] split = temp.split("");
        String[] alpha = new String[] {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m"
            , "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "simple_outsourcing"};
        int[] countArr = new int[26];
        for (int i = 0; i < split.length; i++) {
            String val = split[i];
            for (int j = 0; j < alpha.length; j++) {
                if (val.equals(alpha[j])) {
                    countArr[j]++;
                }
            }
        }
        int asInt = Arrays.stream(countArr).max().getAsInt();
        for (int i = 0; i < countArr.length; i++) {
            if (countArr[i] == asInt) {
                answer += alpha[i];
            }
        }

        return answer;
    }

    public int[] solution2(int[] grade) {
        int[] answer = new int[grade.length];

        List<Integer> gradeList = new ArrayList<>();
        for (Integer i : grade) {
            gradeList.add(i);
        }
        Collections.sort(gradeList, Collections.reverseOrder());
        for (int i = 0; i < grade.length; i++) {
            int value = gradeList.indexOf(grade[i]);
            answer[i] = value + 1;
        }
        return answer;
    }

    public int solution(int[] dots, int[] lines) {
        int answer = 0;

        return answer;
    }
}

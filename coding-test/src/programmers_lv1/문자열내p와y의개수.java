package programmers_lv1;

/**
 * @author : Sangji Lee
 * @when : 2021-05-30
 * @github : http://github.com/sangdee
 */
public class 문자열내p와y의개수 {
    boolean solution(String s) {
        String lower = s.toLowerCase();
        int pCount = 0;
        int yCount = 0;

        for (int i = 0; i < lower.length(); i++) {
            if (lower.charAt(i) == 'p') pCount++;
            else if (lower.charAt(i) == 'y') yCount++;
        }

        if (pCount == yCount) return true;
        else return false;
    }
}

package lecture.string;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2022/04/09
 */
public class 중복문자제거 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Set<Character> set = new LinkedHashSet<>();
        for (char c : s.toCharArray()) {
            set.add(c);
        }
        StringBuilder answer = new StringBuilder();
        for (char c : set) {
            answer.append(c);
        }
        System.out.println(answer);
    }

    /*
    답
     */
    public String solution(String str) {
        String answer = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.indexOf(str.charAt(i)) == i) {
                answer += str.charAt(i);
            }
        }
        return answer;
    }
}

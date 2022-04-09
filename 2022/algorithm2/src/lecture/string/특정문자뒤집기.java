package lecture.string;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2022/04/09
 */
public class 특정문자뒤집기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Queue<Character> temp = new LinkedList<>();
        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            if (Character.isLetter(c)) {
                temp.offer(c);
            }
        }
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isLetter(c)) {
                answer.append(temp.poll());
            }else {
                answer.append(c);
            }
        }
        System.out.println(answer);
    }
}
class Main{
    public String solution(String str) {
        char[] s = str.toCharArray();
        int lt = 0, rt = str.length() - 1;
        while (lt < rt) {
            if (!Character.isAlphabetic(s[lt])) {
                lt++;
            }
            else if (!Character.isAlphabetic(s[rt])) {
                rt--;
            }else {
                char tmp = s[lt];
                s[lt] = s[rt];
                s[rt] = tmp;
                lt++;
                rt--;
            }
        }
        return String.valueOf(s);
    }
}

package lecture.string;

import java.util.Scanner;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2022/04/20
 */
public class 문자열압축 {
    public static void main(String[] args) {
        String answer = "";
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine() + " ";
        int count = 1;
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                count++;
            }else {
                answer += s.charAt(i);
                if (count > 1) {
                    answer += count;
                    count = 1;
                }
            }
        }
        System.out.println(answer);
    }
}

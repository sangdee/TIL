package lecture.string;

import java.util.Scanner;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2022/04/09
 */
public class 문장속단어 {
    public static void main(String[] args) {
        String answer = "";
        int maxLength = 0;
        Scanner sc = new Scanner(System.in);
        String scanner = sc.nextLine();
        String[] split = scanner.split(" ");

        for (String s : split) {
            if (s.length() > maxLength) {
                maxLength = s.length();
                answer = s;
            }

        }
        System.out.println(answer);
    }
}

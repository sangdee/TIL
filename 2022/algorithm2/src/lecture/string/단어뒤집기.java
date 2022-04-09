package lecture.string;

import java.util.Scanner;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2022/04/09
 */
public class 단어뒤집기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < count; i++) {
            String s = sc.nextLine();
            StringBuilder stringBuilder = new StringBuilder();
            for (int j = s.length() - 1; j >= 0; j--) {
                stringBuilder.append(s.charAt(j));
            }
            System.out.println(stringBuilder);
        }
    }
}

package algorithm.inflearn.string;

import java.util.Scanner;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2024/01/02
 */
public class 대소문자변환 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(caseConversion(s));
    }

    private static String caseConversion(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isLowerCase(c)) {
                stringBuilder.append(Character.toUpperCase(c));
            } else {
                stringBuilder.append(Character.toLowerCase(c));
            }
        }
        return stringBuilder.toString();
    }
}

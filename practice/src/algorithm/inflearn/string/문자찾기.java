package algorithm.inflearn.string;

import java.util.Scanner;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2024/01/01
 */
public class 문자찾기 {
    public static int findLetters(String string, String letter) {
        int count = 0;
        char at = letter.charAt(0);
        for (char c : string.toCharArray()) {
            if (c == at) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine().toLowerCase();
        String letter = sc.nextLine().toLowerCase();
        int letters = findLetters(string, letter);
        System.out.println(letters);
    }
}

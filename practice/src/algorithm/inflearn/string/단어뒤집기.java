package algorithm.inflearn.string;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2024/01/04
 */
public class 단어뒤집기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        List<String> words = new ArrayList<>();
        sc.nextLine();
        for (int i = 0; i < count; i++) {
            words.add(sc.nextLine());
        }
        List<String> list = reverseWords(words);
        for (String s : list) {
            System.out.println(s);
        }
    }

    private static List<String> reverseWords(List<String> words) {
        List<String> list = new ArrayList<>();
        for (String s : words) {
            StringBuilder builder = new StringBuilder();
            for (int i = s.length() - 1; i >= 0; i--) {
                builder.append(s.charAt(i));
            }
            list.add(builder.toString());
        }
        return list;
    }
}

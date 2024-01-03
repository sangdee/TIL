package algorithm.inflearn.string;

import java.util.Scanner;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2024/01/03
 */
public class 문장속단어 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(longestSizeWord(s));
    }

    private static String longestSizeWord(String s) {
        String[] split = s.split(" ");
        int max = 0;
        int index = 0;
        for (int i = 0; i < split.length; i++) {
            int length = split[i].length();
            if (max < length) {
                max = length;
                index = i;
            }
        }
        return split[index];
    }
}

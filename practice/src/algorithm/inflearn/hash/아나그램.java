package algorithm.inflearn.hash;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2023/05/10
 */
public class 아나그램 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word1 = sc.nextLine();
        String word2 = sc.nextLine();
        char[] chars1 = word1.toCharArray();
        char[] chars2 = word2.toCharArray();
        Arrays.sort(chars1);
        Arrays.sort(chars2);
        word1 = String.valueOf(chars1);
        word2 = String.valueOf(chars2);

        if (word1.equals(word2)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }


    }
}

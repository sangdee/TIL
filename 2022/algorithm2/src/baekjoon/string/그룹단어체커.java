package baekjoon.string;

import java.util.Scanner;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2022/01/20
 */
public class 그룹단어체커 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        scanner.nextLine();
        int result = 0;
        for (int j = 0; j < i; j++) {
            String s = scanner.nextLine();
            String temp = "";
            for (int k = 0; k < s.length(); k++) {
                if (!temp.contains(String.valueOf(s.charAt(k)))) {
                    temp += s.charAt(k);
                    int n = k,
                        m = 1;
                    while (n + m < s.length() && s.charAt(n) == s.charAt(n + m)) {
                        k++;
                        m++;
                    }
                } else {
                    result--;
                    break;
                }
            }
            result++;
        }
        System.out.println(result);
    }
}

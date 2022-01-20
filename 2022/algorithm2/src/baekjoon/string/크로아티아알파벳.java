package baekjoon.string;

import java.util.Scanner;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2022/01/20
 */
public class 크로아티아알파벳 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String[] arr = new String[]{"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
        int result = 0;

        for (String croatia : arr) {
            boolean flag = true;
            while (flag) {
                if (s.contains(croatia)) {
                    s = s.replaceFirst(croatia, "#");
                    result++;
                }else {
                    flag = false;
                }
            }
        }
        System.out.println(s.length());
    }
}

package baekjoon.string;

import java.util.Scanner;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2022/01/20
 */
public class 다이얼 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String[] arr = new String[]{"ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "WXYZ"};
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            for (int j = 0; j < arr.length; j++) {
                if (arr[j].contains(String.valueOf(c))) {
                    result += j + 3;
                }
            }
        }
        System.out.println(result);
    }
}

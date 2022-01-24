package baekjoon.sort;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2022/01/24
 */
public class 소트인사이드 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String[] arr = new String[s.length()];

        for (int i = 0; i < s.length(); i++) {
            arr[i] = String.valueOf(s.charAt(i));
        }
        Arrays.sort(arr, Comparator.reverseOrder());
        for (String temp : arr) {
            System.out.print(temp);
        }
    }

}

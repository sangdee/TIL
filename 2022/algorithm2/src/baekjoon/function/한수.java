package baekjoon.function;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2022/01/19
 */
public class 한수 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt(),
            result = 99;

        if (i <= 99) {
            System.out.println(i);
        } else if (i <= 110) {
            System.out.println(result);
        } else {
            for (int j = 111; j <= i; j++) {
                if (hansu(j)) {
                    result++;
                }
            }
            System.out.println(result);
        }
    }

    static boolean hansu(int i) {
        if (i == 1000) {
            return false;
        }
        List<Integer> list = new ArrayList<>();
        int num = i;
        for (int j = 0; j < 3; j++) {
            list.add(num % 10);
            num = num / 10;
        }
        return list.get(0) - list.get(1) == list.get(1) - list.get(2);
    }
}

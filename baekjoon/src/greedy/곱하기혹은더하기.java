package greedy;

import java.util.Scanner;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2021-04-19
 */
public class 곱하기혹은더하기 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        int result = 0;
        for (char c : s.toCharArray()) {
            int num = c - '0';
            if (num == 1 || num == 0) {
                result += num;
            } else {
                if (result == 0) result =1;
                    result *= num;
            }
        }
        System.out.println(result);
    }
}

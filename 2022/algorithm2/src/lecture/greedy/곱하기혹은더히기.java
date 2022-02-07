package lecture.greedy;

import java.util.Scanner;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2022/02/05
 */
public class 곱하기혹은더히기 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int result = s.charAt(0) - '0';
        for (int i = 1; i < s.length(); i++) {
            int num = s.charAt(i) - '0';

            if (result <= 1 || num <= 1) {
                result += num;
            } else {
                result *= num;
            }
        }
        System.out.println(result);
    }

}

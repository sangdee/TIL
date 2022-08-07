package lecture;

import java.util.Scanner;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2022/08/07
 */
public class 점수계산 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input1 = in.nextInt();

        int result = 0;
        int tmp = 0;

        for (int i = 0; i < input1; i++) {
            int value = in.nextInt();
            if (value == 1) {
                tmp++;
                result += tmp;
            }else {
                tmp = 0;
            }
        }
        System.out.println(result);
    }
}

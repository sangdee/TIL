package lecture.implementation;

import java.util.Scanner;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2022/02/08
 */
public class 시각 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count = 0;

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < 60; j++) {
                for (int k = 0; k < 60; k++) {
                    if (hasThree(i) || hasThree(j) || hasThree(k)) {

                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }

    public static boolean hasThree(int number) {
        return number % 10 == 3 || (number >= 30 && number < 40);
    }

}

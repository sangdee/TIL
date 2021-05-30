package programmers_lv1;

import java.util.Scanner;

/**
 * @author : Sangji Lee
 * @when : 2021-05-30
 * @github : http://github.com/sangdee
 */
public class 직사각형별찍기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        for (int i = 0; i <b ; i++) {
            for (int j = 0; j <a ; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
